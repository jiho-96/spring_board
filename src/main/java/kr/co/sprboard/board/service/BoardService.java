package kr.co.sprboard.board.service;

import kr.co.sprboard.board.dto.BoardDTO;
import kr.co.sprboard.pagenation.dto.PageDTO;

import java.util.List;

public interface BoardService {
    int save(BoardDTO boardDTO);

    List<BoardDTO> findAll();

    void updateHits(Long id);

    BoardDTO findById(Long id);

    void delete(Long id);

    void update(BoardDTO boardDTO);

    List<BoardDTO> pageList(int page);

    PageDTO pagingParam(int page);
}
