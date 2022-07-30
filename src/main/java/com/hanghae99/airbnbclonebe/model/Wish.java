package com.hanghae99.airbnbclonebe.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Wish {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "WISH_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID")
    private Room room;
}
