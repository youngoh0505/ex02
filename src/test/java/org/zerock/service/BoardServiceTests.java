package org.zerock.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	@Autowired
	private BoardService service;
	
//	@Test
//	public void testRegister(BoardVO board) {
//		BoardVO boardTest = new BoardVO();
//		boardTest.setTitle("새로운 내용");
//		boardTest.setContent("새로 작성한 내용");
//		boardTest.setWriter("user00");
//		
//		service.register(board);
//		log.info(board);
//	}
//
//	@Test
//	public boolean testModify(BoardVO board) {
//		log.info("modify...."+board);
//		return service.modify(board);
//	}
//	
//	@Test
//	public boolean testRemove(Long bno) {
//		log.info("Remove...."+bno);
//		return service.remove(bno);
//	}
//	
//	@Test
//	public List<BoardVO> getList() {
//		log.info("getList....");
//		return service.getList();
//	}
//	
	@Test
	public void testGetList(){
		service.getList(new Criteria(2,10)).forEach(board ->log.info(board));
	}

			
}
