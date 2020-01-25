package com.innovar.iTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovar.iTracker.model.UserModel;

@Repository
public interface UserRespository extends JpaRepository<UserModel, Long> {
}
