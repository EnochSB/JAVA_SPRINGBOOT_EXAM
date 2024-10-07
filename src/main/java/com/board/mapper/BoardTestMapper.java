package com.board.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/*
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
*/

import com.board.dto.BoardTestDTO;

@Mapper
public interface BoardTestMapper {
	/*
	// sql문 작성에 제한이 있어 많이 쓰는 방법은 아니지만 가장 쉬운 방법
	// 게시판 목록 보기
	@Select("select seqno,writer,title,to_char(regdate,'YYYY-MM-DD HH24:MI:SS') as regdate from tbl_board order by seqno desc")
	public List<BoardTestDTO> list();
	
	// 게시판 상세 보기
	@Select("select seqno,writer,title,to_char(regdate,'YYYY-MM-DD HH24:MI:SS') as regdate,content from tbl_board where seqno = ${seqno}")
	public BoardTestDTO view(@Param("seqno") int seqno);
	
	// 게시물 등록
	@Insert("insert into tbl_board (writer,title,content) values ('${board.writer}','${board.title}','${board.content}')")
	public void write(@Param("board") BoardTestDTO board);
	
	// 게시물 수정
	@Update("update tbl_board set writer='${board.writer}',title='${board.title}',content='${board.content}' where seqno=${board.seqno}")
	public void modify(@Param("board") BoardTestDTO board);
	
	// 게시물 삭제
	@Delete("delete from tbl_board where seqno=${seqno}")
	public void delete(@Param("seqno") int seqno);
	*/
	
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
