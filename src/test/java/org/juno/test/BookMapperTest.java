package org.juno.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.juno.persistence.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BookMapperTest {
	@Setter(onMethod =@__({@Autowired}))
	private BookMapper mapper;
	@Test
	public void testGetList() {
		mapper.getList().forEach(book->log.info(book));
	}
}
