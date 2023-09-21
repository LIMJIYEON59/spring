package com.ncs.test.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	@Autowired
	private SqlSession sqlSessionTemplate; //root에 있는거 가져옴
	
	public Member loginMember(Member vo) {
		return sqlSessionTemplate.selectOne("member.loginMember", vo); //문제에는 매개인자 안 정해줌 임의로 내가 넣은거임
	}

}
