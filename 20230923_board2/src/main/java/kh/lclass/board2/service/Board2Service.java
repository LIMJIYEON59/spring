package kh.lclass.board2.service;

import java.util.List;

import kh.lclass.board2.vo.Board2Vo;

public interface Board2Service {
	
	public int insert(Board2Vo boardvo);
	public List<Board2Vo> selectList();
	public Board2Vo read(String bno);
	public int update(Board2Vo boardvo);
	public int delete(String bno);
}