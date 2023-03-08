package org.zerock.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper mapper;
	
	private Long[] bnoArr = {1L,2L,3L,4L,5L};
	
//	@Test
//	public void testCreate() {
//		IntStream.range(1, 10).forEach(i -> {
//			ReplyVO vo = new ReplyVO();
//			
//			vo.setBno(bnoArr[i%5]);
//			vo.setReply("댓글 테스트 : "+i);
//			vo.setReplyer("작성자 : "+i);
//			
//			mapper.insert(vo);			
//		});
//	}
	
//	@Test
//	public void testDelete() {
//		mapper.delete(5L);
//	}
	
	@Test
	public void testUpdate() {
		Long targetRno =10L;
		ReplyVO vo = mapper.read(10L);
		vo.setReply("Update Reply");
		int count = mapper.update(vo);
		
		log.info("Update COUNT : "+count);;
	
	}
	
}
