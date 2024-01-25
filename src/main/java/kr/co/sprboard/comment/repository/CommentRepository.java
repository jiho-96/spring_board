package kr.co.sprboard.comment.repository;

import kr.co.mapper_interface.comment.CommentMapper;
import kr.co.sprboard.comment.dto.CommentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepository {
    private final CommentMapper commentMapper;
    public List<CommentDTO> findAll(Long boardId) { return commentMapper.findAll(boardId);}

    public void save(CommentDTO commentDTO) { commentMapper.save(commentDTO);
    }
}
