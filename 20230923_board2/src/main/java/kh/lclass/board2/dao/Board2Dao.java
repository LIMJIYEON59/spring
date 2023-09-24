package kh.lclass.board2.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.board2.vo.Board2Vo;

@Repository
public class Board2Dao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//게시글 작성
	public int insert(Board2Vo board2vo) {
		System.out.println("[jj]"+ board2vo);
		return sqlSession.insert("board2.insert", board2vo);
	}
}
