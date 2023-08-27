package kh.lclass.db1.member.model.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MemberVo {
//	MEMBER------ -------- ------------- 
//	MID    NOT NULL VARCHAR2(20)  
//	MPWD   NOT NULL VARCHAR2(20)  
//	MNAME  NOT NULL VARCHAR2(50)  
//	MEMAIL NOT NULL VARCHAR2(150)
	
	private String mid;
	private String mpwd;
	private String mname;
	private String memail;

}
