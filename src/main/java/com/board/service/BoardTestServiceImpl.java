package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dto.BoardTestDTO;
import com.board.mapper.BoardTestMapper;

@Service
public class BoardTestServiceImpl implements BoardTestService {
	// 의존성 주입
	@Autowired
	BoardTestMapper mapper;
	
	// 게시물 목록 보기
	@Override
	public List<BoardTestDTO> list() {
		return mapper.list();
	}
	
	// 게시물 상세 보기
	@Override
	public BoardTestDTO view(int seqno) {
		return mapper.view(seqno);
	}
	
	
	@Override
	public void write(BoardTestDTO board) {
		mapper.write(board);
	}

	@Override
	public void modify(BoardTestDTO board) {
		mapper.modify(board);
	}

	@Override
	public void delete(int seqno) {
		mapper.delete(seqno);
	}

}
