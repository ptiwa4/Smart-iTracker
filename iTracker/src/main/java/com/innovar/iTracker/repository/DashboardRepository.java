/**
 * 
 */
package com.innovar.iTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovar.iTracker.model.Dashboard;

/**
 * @author prashant.tiwari
 *
 */
@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Long> {

}
