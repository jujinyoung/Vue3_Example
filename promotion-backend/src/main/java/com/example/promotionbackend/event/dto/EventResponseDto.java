package com.example.promotionbackend.event.dto;

import com.example.promotionbackend.common.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EventResponseDto<T> extends BaseDto {

    private T data;

    public EventResponseDto(T data, int totalResult) {
        this.data = data;
        setTotalCount(totalResult);
    }
}
