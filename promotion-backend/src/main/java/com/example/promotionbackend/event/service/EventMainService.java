package com.example.promotionbackend.event.service;

import com.example.promotionbackend.event.entity.EventMainEntity;
import com.example.promotionbackend.event.repository.EventMainMapper;
import com.example.promotionbackend.event.dto.PagingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventMainService {

    private final EventMainMapper eventMainMapper;

    public List<EventMainEntity> findAllEvents(PagingDto pagingDto) {
        return eventMainMapper.findAll(pagingDto);
    }
}
