package kh.lclass.db1.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.lcalss.db1.board.model.vo.BoardVo;
import kh.lclass.db1.board.model.dao.BoardDao;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;
	
	public List<BoardVo> selectList() throws Exception{
		return boardDao.selectList();
	}
	public BoardDao selectOne(int bno) throws Exception {
		return boardDao.selectOne(bno);
	}
	@Transactional //insert가 많을 거라 @넣기
	public int insert(BoardVo vo) throws Exception {
//		int nextval = boardDao.getNextval();
		BoardVo returnVo = boardDao.insert(vo);
		int result = returnVo.getBno();
		if(result != 0) { //0이면 inert 실패
			
		//		if(vo.getAttachFileList()!=null&&returnVo.getAttachFileList(),size()>0) {
		//			boardDao.insertAttachFileList(vo);
		//		}
		}
		return result;
	}
	
	public int update(BoardVo vo) throws Exception {
		return boardDao.update(vo);
	}
	public int delete(int bno) throws Exception {
		return boardDao.delete(bno);
	}

}
