package com.board.dto;

// VO: Value Object
// DTO: Data Transfer Object
public class BoardTestDTO {
	
	// DB에 있는 테이블의 column을 1대1 맵핑
	private int seqno;
	private String writer;
	private String title;
	private String regdate;	// 시간이지만 마리아DB는 String으로 하는게 편하다
	private String content;
	
	// 상단메뉴 Source -> Generate Getters and Setters
	public int getSeqno() {
		return seqno;
	}
	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
