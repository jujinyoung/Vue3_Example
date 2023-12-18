package com.example.promotionbackend.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PagingDto {

    private String sort;
    private String order;
    private int limit;
    private int page;
    private String type;

    private int startRow;

    public PagingDto(String sort, String order, int limit, int page, String type) {
        this.sort = sort;
        this.order = order;
        this.limit = limit;
        this.page = page;
        this.type = type;
        this.startRow = (page - 1) * limit;
    }
}
