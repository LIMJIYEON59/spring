package kh.lclass.board2.dao;

import java.util.List;

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
	
	//게시글 목록 조회
	public List<Board2Vo> selectList() {
		System.out.println("[j11]");
		return sqlSession.selectList("board2.selectList");
	}
	
	//게시글 상세 조회
	public Board2Vo read(String bno) {
		System.out.println("[j22]"+ bno);
		return sqlSession.selectOne("board2.read", bno);
	}
	
	//게시물 수정
	public int update(Board2Vo board2vo) {
		System.out.println("[j55]");
		return sqlSession.update("board2.update", board2vo);
	}
	
	//게시물 삭제
	public int delete(String bno) {
		return sqlSession.delete("board2.delete", bno);
	}
}
