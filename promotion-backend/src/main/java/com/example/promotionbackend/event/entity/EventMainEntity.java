package com.example.promotionbackend.event.entity;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(of = {"id", "title", "startAt", "endAt", "type"})
public class EventMainEntity {

    private String id;
    private String title;
    private String startAt;
    private String endAt;
    private String type;

    public EventMainEntity() {
    }

    public EventMainEntity(String id, String title, String startAt, String endAt, String type) {
        this.id = id;
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
        this.type = type;
    }
}
