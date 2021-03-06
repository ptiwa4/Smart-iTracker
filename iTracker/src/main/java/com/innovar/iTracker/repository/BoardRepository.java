/**
 * 
 */
package com.innovar.iTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovar.iTracker.model.Board;

/**
 * @author prashant.tiwari
 *
 */
@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

}
