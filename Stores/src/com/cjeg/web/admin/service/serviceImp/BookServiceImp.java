package com.cjeg.web.admin.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjeg.web.admin.mapper.BaseMapper;
import com.cjeg.web.admin.mapper.BookMapper;
import com.cjeg.web.admin.model.Book;
import com.cjeg.web.admin.service.BookService;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月2日 上午9:39:59
 * 
 */
@Service("bookService")
public class BookServiceImp extends BaseServiceImp<Book, String> implements
		BookService {

	@Autowired
	private BookMapper mapper;

	@Override
	BaseMapper<Book, String> getBaseMapper() {
		return mapper;
	}
}
