package com.example.promotionbackend.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PagingDto {

    private String sort;
    private String order;
    private int limit;
    private int page;
    private String type;
}
