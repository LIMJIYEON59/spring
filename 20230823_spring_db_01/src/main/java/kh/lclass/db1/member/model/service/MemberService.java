package kh.lclass.db1.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.lclass.db1.member.model.dao.MemberDao;
import kh.lclass.db1.member.model.vo.MemberVo;


@Service
public class MemberService {
	
	//이 어노테이션을 사용해서 Spring에서 'MemberDao' 빈을 자동으로 주입한다.
	@Autowired
	private MemberDao memberDao;
	
	// 모든 회원 정보를 DB에서 검색하여 리스트로 반환한다. service의 selectList()메서드가 memberDao의 selectList()를 호출해서 DB의 모든 회원 정보를 검색한다.
	//DB에서 모든 회원 정보를 검색하는 쿼리 실행 
	//DB로부터 검색된 회원 정보는 'List<MemberVo>'형태로 반환된다.
	//'MemberService' 클래스의 'selectList()'메서드는 DB로부터 검색된 회원 목록을 받아와 클라이언트 코드(또는 다른 서비스)에게 리스트로 반환한다.
	//결론: 서비스의 메서드를 이용해 dao의 메서드를 호출해 회원목록을 가져온다!!
	public List<MemberVo> selectList(){
		return memberDao.selectList();	
	}
	
	//'pk'에 해당하는 회원 정보를 가져와서 반환한다.
	public MemberVo selectOne(String pk) {
		return memberDao.selectOne(pk);
	}
	//주어진 'MemberVo' 객체를 DB에 삽입한다. 회원정보를 추가한다.
	public int insert(MemberVo vo) {
		return memberDao.insert(vo);
	}
	//회원정보를 업데이트하고 새로운 정보를 삽입한다. 먼저 'update()'메서드를 호출하여 회원 정보를 업데이트하고 
	//'insert()' 메서드를 호출하여 새로운 정보를 추가한다.
	public int insertReply(MemberVo vo) {
		memberDao.update(vo);
		return memberDao.insert(vo);
	}
	//주어진 'MemberVo' 객체로 DB의 회원 정보를 업데이트한다.
	public int update(MemberVo vo) {
		return memberDao.update(vo);
	}
	//주어진 'pk'에 해당하는 회원 정보를 DB에서 삭제한다.
	public int delete(String pk) {
		return memberDao.delete(pk);
	}
}

/*
 원래는 
 public List<MemberVo> selectList(){
 		List<MemberVo> members = memberDao.selectList();
		return members
	}
*/
