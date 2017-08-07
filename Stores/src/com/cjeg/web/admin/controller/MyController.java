package com.cjeg.web.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjeg.web.admin.model.Book;
import com.cjeg.web.admin.service.BaseService;
import com.cjeg.web.admin.service.BookService;

/**
 * 
 * @author 张瑞志
 * 
 *         创建时间:2017年4月2日 上午9:42:47
 * 
 */
@Controller
@RequestMapping("/my")
public class MyController extends BaseController<Book, String> {

	@Autowired
	private BookService bookService;

	@Override
	BaseService<Book, String> getService() {
		return bookService;
	}

}
