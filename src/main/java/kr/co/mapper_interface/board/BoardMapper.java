package kr.co.mapper_interface.board;

import kr.co.sprboard.board.dto.BoardDTO;

import java.util.List;
import java.util.Map;

public interface BoardMapper {
    int save(BoardDTO boardDTO);

    List<BoardDTO> findAll();

    void updateHits(Long id);

    BoardDTO findById(Long id);

    void delete(Long id);

    void update(BoardDTO boardDTO);

    List<BoardDTO> pagingList(Map<String, Integer> pagingParams);

    int boardCount();
}
