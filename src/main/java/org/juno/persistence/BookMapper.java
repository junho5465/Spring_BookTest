package org.juno.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.juno.domain.BookVO;

public interface BookMapper {
	//@Select("select * from book")
	public List<BookVO> getList();
	public BookVO get(int bookId);
}
