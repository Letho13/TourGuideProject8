package com.openclassrooms.tourguide.Dto;

import com.openclassrooms.tourguide.service.RewardsService;

public class NearByAttractionsByUserDTO {


    // Name of Tourist attraction,
    // Tourist attractions lat/long,
    // The user's location lat/long,
    // The distance in miles between the user's location and each of the attractions.
    // The reward points for visiting each Attraction.

    private String attractionName;
    private double attractionLongitude;
    private double attractionLatitude;
    private double userLongitude;
    private double userLatitude;
    private int rewardPoints;
    private double distanceBetweenUserAndAttraction;

    public NearByAttractionsByUserDTO() {
    }

    public NearByAttractionsByUserDTO(String attractionName, double attractionLongitude, double attractionLatitude, double userLongitude, double userLatitude, int rewardPoints, double distanceBetweenUserAndAttraction) {

        this.attractionName = attractionName;
        this.attractionLongitude = attractionLongitude;
        this.attractionLatitude = attractionLatitude;
        this.userLongitude = userLongitude;
        this.userLatitude = userLatitude;
        this.rewardPoints = rewardPoints;
        this.distanceBetweenUserAndAttraction = distanceBetweenUserAndAttraction;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public double getAttractionLongitude() {
        return attractionLongitude;
    }

    public void setAttractionLongitude(double attractionLongitude) {
        this.attractionLongitude = attractionLongitude;
    }

    public double getAttractionLatitude() {
        return attractionLatitude;
    }

    public void setAttractionLatitude(double attractionLatitude) {
        this.attractionLatitude = attractionLatitude;
    }

    public double getUserLongitude() {
        return userLongitude;
    }

    public void setUserLongitude(double userLongitude) {
        this.userLongitude = userLongitude;
    }

    public double getUserLatitude() {
        return userLatitude;
    }

    public void setUserLatitude(double userLatitude) {
        this.userLatitude = userLatitude;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getDistanceBetweenUserAndAttraction() {
        return distanceBetweenUserAndAttraction;
    }

    public void setDistanceBetweenUserAndAttraction(double distanceBetweenUserAndAttraction) {
        this.distanceBetweenUserAndAttraction = distanceBetweenUserAndAttraction;
    }

    @Override
    public String toString() {
        return "NearByAttractionsByUserDTO{" +
                ", attractionName='" + attractionName + '\'' +
                ", attractionLongitude=" + attractionLongitude +
                ", attractionLatitude=" + attractionLatitude +
                ", userLongitude=" + userLongitude +
                ", userLatitude=" + userLatitude +
                ", rewardPoints=" + rewardPoints +
                ", distanceBetweenUserAndAttraction=" + distanceBetweenUserAndAttraction +
                '}';
    }
}
