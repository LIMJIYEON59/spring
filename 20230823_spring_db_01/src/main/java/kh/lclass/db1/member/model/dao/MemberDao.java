package kh.lclass.db1.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.db1.member.model.vo.MemberVo;

@Repository("memberDao")
public class MemberDao {
	
	// Autowired 사용시 Spring에서 이미 만들어진 빈객체를 가져다 씀(Spring에서 'SqlSession' 빈을 자동으로 주입한다.)
	//따라서 =null 또는 = new Xxx() 대입하면 안됨!!
	@Autowired
	private SqlSession sqlSession;
	
	// 모든 회원 정보를 DB에서 검색하여 리스트로 반환한다. MyBatis의 'selectList' 메서드를 사용하여 SQL 쿼리를 실행한다.
	public List<MemberVo> selectList() {
		return sqlSession.selectList("member.selectList");
	}
	// 주어진 'pk'에(Primary Key) 해당하는 회원 정보를 DB에서 검색하여 반환한다. MyBatis의 'selectOne' 메서드를 사용하여 SQL쿼리를 실행한다.
	public MemberVo selectOne(String pk) {
		return sqlSession.selectOne("member.selectOne", pk);
	}
	// 주어진 'MemberVo' 객체를 DB에 삽입한다. MyBatis의 'insert' 메서드를 사용하여 SQL 쿼리를 실행한다.
	public int insert(MemberVo vo) {
		return sqlSession.insert("member.insert", vo);
	}
	// 회원정보 업데이트, Mybatis의 'update'메서드를 사용하여 SQL 쿼리를 실행한다.
	public int update(MemberVo vo) {
		return sqlSession.update("member.update", vo);
	}
	
	//String 타입의 pk 파라미터를 받는다. 반환타입은 int이다. (pk는 주로 회원의 Primary Key 값을 나타낸다) 이 메서드는 특정 회원을 DB에서 삭제하고 삭제된 레코드의 개수를 반환한다.
	//sqlSession 객체를 사용하여 DB작업수행 
	//'sqlSession.delete() 메서드를 호출하여 DB에서 SQL 쿼리를 실행하고 그 결과로 삭제된 레코드의 개수를 반환한다.
	//"member.delete"는 실행할 SQL 쿼리의 이름이다.(MyBatis XML 파일에 정의된 SQL 맵퍼의 쿼리 ID이다.)-> "member.delete"는 회원을 삭제하는 SQL 쿼리를 실행하라는 의미이다. (MyBatis XML 설정 파일에서 해당 쿼리를 찾아서 실행하라는 역할이다)
	//'pk'는 SQL 쿼리에 전달될 파라미터로 사용된다 SQL 쿼리 내에서 해당 파라미터를 이용해 어떤 회원을 삭제할지 결정한다.
	//결론:'pk'를 사용하여 DB에서 해당 회원을 삭제하고 삭제된 레코드의 개수를 반환한다.
	public int delete(String pk) {
		return sqlSession.delete("member.delete", pk); //MyBatis의 sqlSession.delete()메서드
	}
}

// 이 'MemberDao' 클래스는 Spring Framework와 MyBatis를 함께 사용하여 DB와 상호작용을 처리한다.
// DAO 클래스를 Spring loC컨테이너에 빈으로 등록하여 다른 컴포넌틍서 사용할 수 있게 된다.
