package kh.lclass.board.vo;

import java.sql.Date;

// DB에 있는 컬럼 값들을 java에서 객체로 다루기 위해 사용한다.
public class BoardVo {
	/*
	"BNO"	NUMBER		NOT NULL,
	"TITLE"	VARCHAR2(100)		NOT NULL,
	"CONTENT"	VARCHAR2(2000)		NOT NULL,
	"WRITER"	VARCHAR2(100)		NOT NULL,
	"REGDATE"	DATE	DEFAULT SYSDATE	NOT NULL
	*/
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	
	@Override
	public String toString() {
		return "BoardVo [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
