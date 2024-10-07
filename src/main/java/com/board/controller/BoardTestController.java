package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.dto.BoardTestDTO;
import com.board.mapper.BoardTestMapper;
import com.board.service.BoardTestService;

// BoardTestController 클래스를 스프링 빈으로 생성 --> Controller로 사용
// 스프링이 시작될 때 동시에 작동 시작
@Controller
public class BoardTestController {
	
	// 의존성 주입
	/*
	@Autowired
	BoardTestMapper mapper;
	*/
	@Autowired
	BoardTestService service;
	
	// 라우팅
	// 게시판 목록 보기
	@GetMapping("/board/list")
	public void getList(Model model) throws Exception {
		// Model: Controller와 View 간의 데이터 교환을 담당
		// model.addAttribute("list", mapper.list());

		// 실행순서
		// 1. DBMS와 연결하여 비즈니스 로직 실행(SQL문을 실행 시켜서 DBMS로부터 원하는 값을 얻는다.)
		// 2. Model 객체에 값을 채워주고 이 값을 다시 가져 와서 View에 전달
		model.addAttribute("list", service.list());
	}
	
	// 게시판 상세 보기
	@GetMapping("/board/view")	// http://127.0.0.1:8080/board/view?seqno=1
	public void getView(Model model, @RequestParam("seqno") int seqno) throws Exception {
		// model.addAttribute("view", mapper.view(seqno));
		model.addAttribute("view", service.view(seqno));
	}
	
	// 게시판 등록 화면 보기
	@GetMapping("/board/write")
	public void getWrite() throws Exception {
		
	}
	
	// 게시판 등록
	@PostMapping("/board/write")
	public String postWrite(BoardTestDTO board) throws Exception {
		//mapper.write(board);
		service.write(board);
		return "redirect:/board/list";
	}
	
	// 게시판 수정 화면 보기
	@GetMapping("/board/modify")
	public void getModify(Model model, @RequestParam("seqno") int seqno) throws Exception {
		// model.addAttribute("modify", mapper.view(seqno));
		model.addAttribute("modify", service.view(seqno));
	}
	
	// 게시판 수정
	@PostMapping("/board/modify")
	public String postModify(BoardTestDTO board) throws Exception {
		// mapper.modify(board);
		service.modify(board);
		return "redirect:/board/view?seqno=" + board.getSeqno();
	}
	
	// 게시판 삭제
	@GetMapping("/board/delete") // http://127.0.0.1/board/delete?seqno=1
	public String getDelete(@RequestParam("seqno") int seqno) throws Exception {
		// mapper.delete(seqno);
		service.delete(seqno);
		return "redirect:/board/list";
	}
}
