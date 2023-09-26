package kh.lclass.board2.vo;

import java.sql.Date;

public class Board2Vo {
	/*
	"BNO"	NUMBER		NOT NULL,
	"TITLE"	VARCHAR2(100)		NOT NULL,
	"CONTENT"	VARCHAR2(2000)		NOT NULL,
	"WRITER"	VARCHAR2(100)		NOT NULL,
	"REGDATE"	DATE	DEFAULT SYSDATE	NOT NULL
	*/
	
	private String bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	
	@Override
	public String toString() {
		return "Board2Vo [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + "]";
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
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
