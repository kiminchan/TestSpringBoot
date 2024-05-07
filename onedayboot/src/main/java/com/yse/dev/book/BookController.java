package com.yse.dev.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	@GetMapping("/book/create")
	public String create() {
		return "book/create";
	}
}
