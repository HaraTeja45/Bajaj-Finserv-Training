package com.redis.service;

import java.util.concurrent.TimeUnit;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.redis.model.Application;
import com.redis.repo.ApplicationRepo;
import com.redis.repo.RedisRepoImpl;

@Service
public class UserService {

	private static final String REDIS_KEY = "Test_Redis";

	@Autowired
	@Qualifier("redissonClient")
	RedissonClient redissonClient;

	@Autowired
	ApplicationRepo applicationRepo;

	@Autowired
	RedisRepoImpl<String, Object> redisRepo;

	public String getApplications(Long applicationId) {

		RLock rLock = null;
		boolean isLockAcquired = false;

		try {
			
			String lockId = "Application" + String.valueOf(applicationId);
			rLock = redissonClient.getLock(lockId);

			isLockAcquired = rLock.tryLock(1, 15, TimeUnit.SECONDS);
			if (isLockAcquired) {

				Application application = null;
				if (application == null && redisRepo.get(REDIS_KEY + applicationId) == null) {
					application = applicationRepo.findByApplicationkeyAndIsactive(applicationId, 1);

					redisRepo.save(REDIS_KEY + application.getApplicationkey(), application, 1l);
					System.out.println("Save in redis cache");

				} else {
					System.out.println("Exist in redis cache");
				}
				return "success";
			} else {
				return "false";
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rLock != null && rLock.isLocked() && rLock.isHeldByCurrentThread()) {
				rLock.unlock();

			}

		}

		return "";
	}

}
