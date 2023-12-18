package com.example.promotionbackend.event.repository;

import com.example.promotionbackend.event.entity.EventMainEntity;
import com.example.promotionbackend.event.dto.PagingDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EventMainMapper {
    List<EventMainEntity> findAll(PagingDto pagingDto);

    int getTotalCount(@Param("type") String type);
}
