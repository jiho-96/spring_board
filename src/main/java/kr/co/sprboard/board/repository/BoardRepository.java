package kr.co.sprboard.board.repository;

import kr.co.sprboard.board.dto.BoardDTO;
import kr.co.mapper_interface.board.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final BoardMapper boardMapper;
    public int save(BoardDTO boardDTO) {
        return boardMapper.save(boardDTO);
    }

    public List<BoardDTO> findAll() { return boardMapper.findAll();}

    public void updateHits(Long id) {boardMapper.updateHits(id); }

    public BoardDTO findById(Long id) { return boardMapper.findById(id); }

    public void delete(Long id) { boardMapper.delete(id);}

    public void update(BoardDTO boardDTO) { boardMapper.update(boardDTO);
    }

    public List<BoardDTO> pagingList(Map<String, Integer> pagingParams) { return  boardMapper.pagingList(pagingParams);
    }

    public int boardCount() { return boardMapper.boardCount();
    }
}
