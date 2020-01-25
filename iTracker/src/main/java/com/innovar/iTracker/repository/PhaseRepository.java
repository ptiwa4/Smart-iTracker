/**
 * 
 */
package com.innovar.iTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovar.iTracker.model.Phase;

/**
 * @author prashant.tiwari
 *
 */
@Repository
public interface PhaseRepository extends JpaRepository<Phase, Long> {

}
