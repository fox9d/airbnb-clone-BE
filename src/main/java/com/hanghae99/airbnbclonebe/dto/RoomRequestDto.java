package com.hanghae99.airbnbclonebe.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RoomRequestDto {
    private String title;
    private int maxGuest;
    private int price;
    private String location;
    private String information;
    private List<String> option;
    private String category;
    private List<String> imgUrl;
}
