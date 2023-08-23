package kh.lcalss.db1.member.model.vo;

import org.springframework.stereotype.Component;

@Component
public class MemberVo {
/*	
MEMBER_ID      VARCHAR2(20) 
MEMBER_PWD     VARCHAR2(20) 
MEMBER_NAME    VARCHAR2(20) 

	"MID"	VARCHAR2(20)		NOT NULL,
	"MPWD"	VARCHAR2(20)		NOT NULL,
	"MNAME"	VARCHAR2(50)		NOT NULL,
	"MEMAIL"	VARCHAR2(150)		NOT NULL
*/
	private String memberId;
	private String memberPwd;
	private String memberName;
	@Override
	public String toString() {
		return "MemberVo [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName + "]";
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
	
}
