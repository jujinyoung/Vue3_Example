package com.example.promotionbackend.event.entity;

import lombok.Getter;
import lombok.ToString;

@Getter
public class EventMainEntity {

    private String id;
    private String title;
    private String startAt;
    private String endAt;
    private String type;
    private String imgPath;

    public EventMainEntity() {
    }

    public EventMainEntity(String id, String title, String startAt, String endAt, String type, String imgPath) {
        this.id = id;
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
        this.type = type;
        this.imgPath = imgPath;
    }
}
