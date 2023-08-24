package kh.lcalss.db1.board.model.vo;

import java.util.List;


import lombok.Data;

@Data
//@Component =Data만 적어도됨
public class BoardVo {
//	BNO         NOT NULL NUMBER         
//	BTITLE      NOT NULL VARCHAR2(300)  
//	BCONTENT             VARCHAR2(4000) 
//	BWRITE_DATE NOT NULL TIMESTAMP(6)   
//	MID         NOT NULL VARCHAR2(20)   
//	BREF        NOT NULL NUMBER         
//	BRE_LEVEL   NOT NULL NUMBER         
//	BRE_STEP    NOT NULL NUMBER
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriteDate;
	private String mid;
	private int bref;
	private int breLevel;
	private int breStep; 
	
	// 1:n 관계
	// private List<String> filepathList;
	private List<AttachFileVo> attachFileList;
	
	
}
