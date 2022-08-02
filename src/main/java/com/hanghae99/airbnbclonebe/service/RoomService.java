package com.hanghae99.airbnbclonebe.service;

import com.hanghae99.airbnbclonebe.auth.auth.UserDetailsImpl;
import com.hanghae99.airbnbclonebe.dto.RoomRequestDto;
import com.hanghae99.airbnbclonebe.model.OptionEnum;
import com.hanghae99.airbnbclonebe.model.Room;
import com.hanghae99.airbnbclonebe.model.User;
import com.hanghae99.airbnbclonebe.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public RoomRequestDto registerRoom(UserDetailsImpl userDetails, RoomRequestDto requestDto) {

        User user = userDetails.getUser();

        String title = requestDto.getTitle();
        int maxGuest = requestDto.getMaxGuest();
        int price = requestDto.getPrice();
        String location = requestDto.getLocation();
        String information = requestDto.getInformation();
        String category = requestDto.getCategory();

        Room room = new Room(title, user, maxGuest, price, location, information, category);
        roomRepository.save(room);

        List<Room> rooms = roomRepository.findAllByUserId(user.getId());
        List<String> option = requestDto.getOption();
        List<String> imgUrl = requestDto.getImgUrl();

        for (String s : option) {
            OptionEnum.from(s);
        }

        return null;
    }
}
