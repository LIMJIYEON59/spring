package kh.lcalss.db1.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.lcalss.db1.member.dao.BoardDao;
import kh.lcalss.db1.board.model.vo.BoardVo;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;
	
	public List<BoardVo> selectList(){
		return boardDao.selectList();
	}
	public BoardDao selectOne(int bno) {
		return boardDao.selectOne(bno);
	}
	public int insert(BoardVo vo) {
		return boardDao.insert(vo);
	}
	public int insertReply(BoardVo vo) {
		boardDao.update(vo);
		return boardDao.insert(vo);
	}
	public int update(BoardVo vo) {
		return boardDao.update(vo);
	}
	public int delete(int bno) {
		return boardDao.delete(bno);
	}

}
