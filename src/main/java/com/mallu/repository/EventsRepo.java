package com.mallu.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mallu.entity.EventsEntity;

import jakarta.transaction.Transactional;

@Transactional
public interface EventsRepo extends JpaRepository<EventsEntity, Integer> {

	boolean existsByEventCategory(String eventCategory);

	Optional<EventsEntity> findByEventCategory(String eventCategory);

	Optional<EventsEntity> findByEventId(int eventId);

}
