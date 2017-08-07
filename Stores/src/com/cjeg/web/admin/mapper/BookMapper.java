package com.cjeg.web.admin.mapper;

import java.util.List;

import com.cjeg.web.admin.model.Book;

public interface BookMapper extends BaseMapper<Book, String> {

	Book findBookType(String id);

	List<Book> selectByType(String type);
}