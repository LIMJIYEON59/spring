package kh.lclass.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.lclass.board.dao.BoardDao;
import kh.lclass.board.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao boardDao;

	@Override
	public int insert(BoardVo boardvo) {
		return boardDao.insert(boardvo);
	}
	
}
