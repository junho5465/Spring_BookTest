package org.juno.service;

import java.util.List;

import org.juno.domain.BookVO;
import org.juno.persistence.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BookServiceImpl implements BookService {
	@Setter(onMethod_=@Autowired)
	private BookMapper mapper;
	
	@Override
	public List<BookVO> getList() {
		log.info("getList...........");
		return mapper.getList();
	}

	@Override
	public BookVO get(int bookId) {
		log.info("get..." + bookId);
		return mapper.get(bookId);
	}

}
