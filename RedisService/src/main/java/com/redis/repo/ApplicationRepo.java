package com.redis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redis.model.Application;

@Repository
public interface ApplicationRepo extends JpaRepository<Application, Long> {

	Application findByApplicationkeyAndIsactive(Long valueOf, Integer isActive);

}
