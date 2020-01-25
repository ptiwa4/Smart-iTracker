/**
 * 
 */
package com.innovar.iTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovar.iTracker.model.Project;

/**
 * @author prashant.tiwari
 *
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
