package com.hanghae99.airbnbclonebe.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum OptionEnum {
    PARKING,
    KITCHEN,
    AIRCON,
    WIFI,
    WASHER,
    TV;

    @JsonCreator
    public static OptionEnum from(String name){
        name = name.toUpperCase();
        switch (name){
            case "PARKING":
                return OptionEnum.PARKING;
            case "KITCHEN":
                return OptionEnum.KITCHEN;
            case "AIRCON":
                return OptionEnum.AIRCON;
            case "WIFI":
                return OptionEnum.WIFI;
            case "WASHER":
                return OptionEnum.WASHER;
            default:
                return OptionEnum.TV;
        }
    }
}
