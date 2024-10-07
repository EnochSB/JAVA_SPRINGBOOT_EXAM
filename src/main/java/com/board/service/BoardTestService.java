package com.board.service;

import java.util.List;

import com.board.dto.BoardTestDTO;

public interface BoardTestService {
	// 게시판 목록 보기
	public List<BoardTestDTO> list();
	
	// 게시판 상세 보기
	public BoardTestDTO view(int seqno);
	
	// 게시물 등록
	public void write(BoardTestDTO board);
	
	// 게시물 수정
	public void modify(BoardTestDTO board);
	
	// 게시물 삭제
	public void delete(int seqno);
}
