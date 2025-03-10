package com.rocketseat.planner.service;

import java.util.List;
import java.util.UUID;

import com.rocketseat.planner.dto.ActivityData;
import com.rocketseat.planner.dto.ActivityRequestPayload;
import com.rocketseat.planner.dto.ActivityResponse;
import com.rocketseat.planner.entity.Activity;
import com.rocketseat.planner.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.planner.entity.Trip;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;
    
    public ActivityResponse registerActivity(ActivityRequestPayload payload, Trip trip){
        Activity newActivity = new Activity(payload.title(), payload.occurs_at(), trip);

        this.repository.save(newActivity);

        return new ActivityResponse(newActivity.getId());
    }

    public List<ActivityData> getAllActivitiesFromId(UUID tripId){
        return this.repository.findByTripId(tripId).stream().map(activity -> new ActivityData(activity.getId(), activity.getTitle(), activity.getOccursAt())).toList();
    }
}
