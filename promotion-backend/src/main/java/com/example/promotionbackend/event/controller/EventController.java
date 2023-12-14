package com.example.promotionbackend.event.controller;

import com.example.promotionbackend.event.dto.EventMainResDto;
import com.example.promotionbackend.event.dto.EventResponseDto;
import com.example.promotionbackend.event.entity.EventMainEntity;
import com.example.promotionbackend.event.service.EventMainService;
import com.example.promotionbackend.event.dto.PagingDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final EventMainService eventMainService;

    @GetMapping
    @CrossOrigin(origins = "http://127.0.0.1:5173")
    public EventResponseDto<List<EventMainResDto>> eventMain(@RequestParam("_sort") String sort,
                                                             @RequestParam("_order") String order,
                                                             @RequestParam("_limit") int limit,
                                                             @RequestParam("_page") int page,
                                                             @RequestParam(value = "type") String type) {
        List<EventMainEntity> allEvents = eventMainService.findAllEvents(new PagingDto(sort, order, limit, page, type));
        List<EventMainResDto> result = allEvents.stream()
                .map(x -> new EventMainResDto(x))
                .collect(Collectors.toList());

        return new EventResponseDto<>(result);
    }
}
