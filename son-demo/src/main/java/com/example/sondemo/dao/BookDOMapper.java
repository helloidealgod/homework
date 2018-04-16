package com.example.sondemo.dao;

import com.example.sondemo.entity.BookDO;
import com.example.sondemo.entity.Books;

public interface BookDOMapper {

    BookDO selectByPrimaryKey(Integer bId);
}