package kr.co.sprboard.comment.service;

import kr.co.sprboard.comment.dto.CommentDTO;
import kr.co.sprboard.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Override
    public List<CommentDTO> findAll(Long boardId) {
        return commentRepository.findAll(boardId);
    }

    @Override
    public void save(CommentDTO commentDTO) {
        commentRepository.save(commentDTO);
    }
}
