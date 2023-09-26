package kh.lclass.board2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.lclass.board2.dao.Board2Dao;
import kh.lclass.board2.vo.Board2Vo;

@Service
public class Board2ServiceImpl implements Board2Service{
	
	@Autowired //의존성 주입
	private Board2Dao boardDao;

	@Override
	public int insert(Board2Vo boardvo) {
		return boardDao.insert(boardvo);
	}

	@Override
	public List<Board2Vo> selectList() {
		return boardDao.selectList();
	}

	@Override
	public Board2Vo selectOne(String bno) {
		return boardDao.selectOne(bno);
	}
	
	
}
