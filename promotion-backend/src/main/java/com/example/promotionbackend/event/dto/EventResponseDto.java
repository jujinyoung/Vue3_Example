package com.example.promotionbackend.event.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EventResponseDto<T> {

    private T data;
    private int totalCount;

    public EventResponseDto(T data) {
        this.data = data;
    }
}
