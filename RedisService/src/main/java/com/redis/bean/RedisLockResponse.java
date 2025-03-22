package com.redis.bean;

import org.redisson.api.RLock;

public class RedisLockResponse {

	private boolean isLockAquired;
	private RLock lock;


	public boolean isLockAquired() {
		return isLockAquired;
	}

	public void setLockAquired(boolean isLockAquired) {
		this.isLockAquired = isLockAquired;
	}

	public RLock getLock() {
		return lock;
	}

	public void setLock(RLock lock) {
		this.lock = lock;
	}

	@Override
	public String toString() {
		return "RedisLockResponse [isLockAquired=" + isLockAquired + ", lock=" + lock + "]";
	}

}
