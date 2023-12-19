package com.example.promotionbackend.event.controller;

import com.example.promotionbackend.PromotionBackendApplication;
import com.example.promotionbackend.common.exception.CustomException;
import com.example.promotionbackend.event.dto.EventMainResDto;
import com.example.promotionbackend.event.dto.EventResponseDto;
import com.example.promotionbackend.event.entity.EventMainEntity;
import com.example.promotionbackend.event.service.EventMainService;
import com.example.promotionbackend.event.dto.PagingDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final ApplicationContext ac;
    private final EventMainService eventMainService;

    @GetMapping
    public EventResponseDto eventMain(@RequestParam("_sort") String sort,
                                                             @RequestParam("_order") String order,
                                                             @RequestParam("_limit") int limit,
                                                             @RequestParam("_page") int page,
                                                             @RequestParam(value = "type", defaultValue = "") String type) {
        List<EventMainEntity> allEvents = eventMainService.findAllEvents(new PagingDto(sort, order, limit, page, type));
        List<EventMainResDto> result = allEvents.stream()
                .map(x -> new EventMainResDto(x))
                .collect(Collectors.toList());

        int totalCount = eventMainService.getTotalCount(type);

        return new EventResponseDto<>(result, totalCount);
    }



//    @GetMapping("/getEvtInfo")
//    public EventResponseDto getEventInfo(@RequestParam("evtNo") String evtNo,
//                             @RequestParam("bean") String bean) {
//
//        String[] splits = bean.split("/");
//        if (splits.length == 2) {
//            try {
//                Class beanName = (Class) ac.getBean(splits[0]);
//                Object result = beanName.getMethod(splits[1], String.class).invoke(beanName, evtNo);
//
//                if (result instanceof EventResponseDto) {
//                    return (EventResponseDto) result;
//                }
//                return new EventResponseDto<>(result);
//            } catch (Exception e) {
//                throw new CustomException();
//            }
//        } else {
//            throw new CustomException();
//        }
//    }
}
