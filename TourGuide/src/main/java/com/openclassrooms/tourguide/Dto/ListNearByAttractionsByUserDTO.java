package com.openclassrooms.tourguide.Dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class ListNearByAttractionsByUserDTO {

    private List<NearByAttractionsByUserDTO> nearByAttractionsByUserDTOList;

    public ListNearByAttractionsByUserDTO() {
        this.nearByAttractionsByUserDTOList = new ArrayList<>();
    }

    public ListNearByAttractionsByUserDTO(List<NearByAttractionsByUserDTO> nearByAttractionsByUserDTOList) {
        this.nearByAttractionsByUserDTOList = nearByAttractionsByUserDTOList;
    }

    public List<NearByAttractionsByUserDTO> getNearByAttractionsByUserDTOList() {
        return nearByAttractionsByUserDTOList;
    }

    public void setNearByAttractionsByUserDTOList(List<NearByAttractionsByUserDTO> nearByAttractionsByUserDTOList) {
        this.nearByAttractionsByUserDTOList = nearByAttractionsByUserDTOList;
    }

    @Override
    public String toString() {
        return "ListNearByAttractionsByUserDTO{" +
                "nearByAttractionsByUserDTOList=" + nearByAttractionsByUserDTOList +
                '}';
    }
}
