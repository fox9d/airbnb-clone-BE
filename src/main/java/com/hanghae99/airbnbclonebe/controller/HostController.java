package com.hanghae99.airbnbclonebe.controller;

import com.hanghae99.airbnbclonebe.auth.auth.UserDetailsImpl;
import com.hanghae99.airbnbclonebe.dto.ResponseDto;
import com.hanghae99.airbnbclonebe.dto.RoomRequestDto;
import com.hanghae99.airbnbclonebe.service.RoomService;
import com.hanghae99.airbnbclonebe.service.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostController {

    private final UserService userService;
    private final RoomService roomService;

    public HostController(UserService userService, RoomService roomService) {
        this.userService = userService;
        this.roomService = roomService;
    }

    @PostMapping("/api/host/register")
    public ResponseDto registerHost(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return userService.registerHost(userDetails);
    }

    @PostMapping("/api/host/room")
    public RoomRequestDto registerRoom(
            @AuthenticationPrincipal UserDetailsImpl userDetails,
            @RequestBody RoomRequestDto requestDto
    ) {
        return roomService.registerRoom(userDetails, requestDto);
    }
}
