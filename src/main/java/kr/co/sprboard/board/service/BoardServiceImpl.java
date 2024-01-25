package kr.co.sprboard.board.service;

import kr.co.sprboard.board.dto.BoardDTO;
import kr.co.sprboard.board.repository.BoardRepository;
import kr.co.sprboard.pagenation.dto.PageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardRepository boardRepository;

    @Override
    public int save(BoardDTO boardDTO) {
        int result = boardRepository.save(boardDTO);
        return result;
    }

    @Override
    public List<BoardDTO> findAll() {
        List<BoardDTO> findAllList = boardRepository.findAll();
        return findAllList;
    }

    @Override
    public void updateHits(Long id) {
        boardRepository.updateHits(id);
    }

    @Override
    public BoardDTO findById(Long id) {
        BoardDTO BoardId = boardRepository.findById(id);
        return BoardId;
    }

    @Override
    public void delete(Long id) {
        boardRepository.delete(id);
    }

    @Override
    public void update(BoardDTO boardDTO) {
        boardRepository.update(boardDTO);
    }

    int pageLimit = 5; // 한 페이지당 보여줄 글 개수
    int blockLimit = 3; // 하단에 보여줄 페이지 번호 개수
    @Override
    public List<BoardDTO> pageList(int page) {
        int pageStart = (page-1)*pageLimit;
        Map<String, Integer> pagingParams = new HashMap<>();
        pagingParams.put("start",pageStart);
        pagingParams.put("limit", pageLimit);
        List<BoardDTO> pagingList = boardRepository.pagingList(pagingParams);

        return pagingList;
    }

    @Override
    public PageDTO pagingParam(int page) {
        int boardCount = boardRepository.boardCount();
        int maxPage = (int)(Math.ceil((double) boardCount / pageLimit));
        int startPage = (((int)(Math.ceil((double) page / blockLimit))) - 1) * blockLimit + 1;
        int endPage = startPage + blockLimit - 1;
        if (endPage > maxPage) {
            endPage = maxPage;
        }
        PageDTO pageDTO = new PageDTO();
        pageDTO.setPage(page);
        pageDTO.setMaxPage(maxPage);
        pageDTO.setStartPage(startPage);
        pageDTO.setEndPage(endPage);
        return pageDTO;
    }
}
