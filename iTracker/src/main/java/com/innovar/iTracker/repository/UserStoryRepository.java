/**
 * 
 */
package com.innovar.iTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovar.iTracker.model.UserStory;

/**
 * @author prashant
 *
 */
public interface UserStoryRepository extends JpaRepository<UserStory, Long> {

}
