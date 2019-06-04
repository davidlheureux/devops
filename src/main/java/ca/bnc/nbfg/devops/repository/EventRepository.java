package ca.bnc.nbfg.devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.bnc.nbfg.devops.model.Event;

/**
 * @author bnc1314
 *
 */
public interface EventRepository extends JpaRepository<Event, Long> {

	
	
}
