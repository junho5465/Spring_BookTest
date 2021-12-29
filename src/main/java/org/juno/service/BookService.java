package org.juno.service;

import java.util.List;

import org.juno.domain.BookVO;

public interface BookService {
	public List<BookVO> getList();
	public BookVO get(int bookId);
}
