/**
 * 
 */
package com.innovar.iTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovar.iTracker.model.Task;

/**
 * @author prashant.tiwari
 *
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
