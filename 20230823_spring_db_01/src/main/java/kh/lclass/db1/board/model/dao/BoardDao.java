package kh.lclass.db1.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lcalss.db1.board.model.vo.AttachFileVo;
import kh.lcalss.db1.board.model.vo.BoardVo;

@Repository("boardDao")
public class BoardDao {
	
@Autowired	
private SqlSession sqlSession;
	//throws Exception: 예외처리 오류 방지(500)
	public List<BoardVo> selectList() throws Exception {//이 위로 가서 오류 방지(service->controller 결국 controller에서 최종 처리됨)
		return sqlSession.selectList("board.selectList");//여기서 오류 발생하면
	}
	public BoardDao selectOne(int bno) throws Exception {
		return sqlSession.selectOne("board.selectOne", bno);
	}
	// insert시 selectKey를 이용해 PK 값이 추가되어있는 자료형을 리턴한다? 
	public BoardVo insert(BoardVo vo) throws Exception {
		System.out.println("[insert before]" +vo);
		int result  =  sqlSession.insert("board.insert]" +vo);
		System.out.println("[insert after]"+vo);
		return vo;
	}
	public int update(BoardVo vo) throws Exception {
		return sqlSession.update("board.update", vo);
	}
	public int delete(int bno) throws Exception {
		return sqlSession.delete("board.delete", bno);
	}
}
