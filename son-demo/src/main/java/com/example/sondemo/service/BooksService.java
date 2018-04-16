package com.example.sondemo.service;

import com.example.sondemo.dao.BookDOMapper;
import com.example.sondemo.entity.BookDO;
import com.example.sondemo.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
    @Autowired
    private BookDOMapper booksMapper;
    public BookDO selectBooks(int bid){
        return booksMapper.selectByPrimaryKey(bid);
    }
}
