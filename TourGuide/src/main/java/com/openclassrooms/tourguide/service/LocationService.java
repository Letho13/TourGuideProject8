package com.openclassrooms.tourguide.service;

import com.openclassrooms.tourguide.user.User;
import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Service
public class LocationService {

    private final GpsUtil gpsUtil;
    private final RewardsService rewardsService;
    Executor executor = Executors.newFixedThreadPool(100);

    public LocationService(GpsUtil gpsUtil, RewardsService rewardsService) {
        this.gpsUtil = gpsUtil;
        this.rewardsService = rewardsService;
    }

    public CompletableFuture<VisitedLocation> trackUserLocationAsync(User user) {

        return CompletableFuture.supplyAsync(() -> gpsUtil.getUserLocation(user.getUserId()), executor)
                .thenCompose(visitedLocation -> {
                    user.addToVisitedLocations(visitedLocation);
                    return rewardsService.calculateRewards(user)
                            .thenApply(future -> visitedLocation);
                });
    }

}
