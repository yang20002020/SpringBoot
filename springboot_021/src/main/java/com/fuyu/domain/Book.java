package com.fuyu.domain;

import lombok.Data;

//lombok
@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;

}
