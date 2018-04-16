package com.example.sondemo.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class BookDO implements Serializable{
    private Integer bId;
    private String bTitle;
    private List<AuthorDo> authorDos;
}
