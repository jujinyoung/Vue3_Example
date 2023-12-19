package com.example.promotionbackend.event.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EventMainEntity {

    private String id;
    private String title;
    private String startAt;
    private String endAt;
    private String type;
    private String imgPath;
    private String url;
}
