package com.rocketseat.planner.repository;

import java.util.List;
import java.util.UUID;

import com.rocketseat.planner.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, UUID>{
    public List<Link> findByTripId(UUID tripId);
}
