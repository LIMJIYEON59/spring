package kh.lclass.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.board.vo.BoardVo;

//DB를 통해 데이터를 조회하거나 수정 삭제하는 역할을 한다.
@Repository //저장소
public class BoardDao {
	
	@Autowired 
	private SqlSession sqlSession;
	
	//게시글 작성
	public int insert(BoardVo boardvo) {
		System.out.println("[jy]" + boardvo);
		return sqlSession.insert("board.insert", boardvo); //xml의 namespace와 이름이 같아야 한다.
	}
	
	
}
