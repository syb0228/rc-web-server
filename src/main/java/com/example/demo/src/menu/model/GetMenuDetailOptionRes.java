package com.example.demo.src.menu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetMenuDetailOptionRes {
    private int menuDetailOptionId;
    private String optionName;
    private int optionPrice;
}
