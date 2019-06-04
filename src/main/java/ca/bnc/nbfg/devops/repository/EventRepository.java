package ca.bnc.nbfg.devops.repository;

import ca.bnc.nbfg.devops.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ca.bnc.nbfg.devops.model.Event;

public interface EventRepository extends JpaRepository<Event,Long>{}
