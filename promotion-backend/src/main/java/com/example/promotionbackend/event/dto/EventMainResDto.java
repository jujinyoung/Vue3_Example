package com.example.promotionbackend.event.dto;

import com.example.promotionbackend.event.entity.EventMainEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EventMainResDto {

    private String id;
    private String title;
    private String startAt;
    private String endAt;
    private String type;

    public EventMainResDto(EventMainEntity eventMainEntity) {
        this.id = eventMainEntity.getId();
        this.title = eventMainEntity.getTitle();
        this.startAt = eventMainEntity.getStartAt();
        this.endAt = eventMainEntity.getEndAt();
        this.type = eventMainEntity.getType();
    }
}
