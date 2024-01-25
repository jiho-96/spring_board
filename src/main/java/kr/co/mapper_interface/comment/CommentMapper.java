package kr.co.mapper_interface.comment;

import kr.co.sprboard.comment.dto.CommentDTO;

import java.util.List;

public interface CommentMapper {
    List<CommentDTO> findAll(Long boardId);

    void save(CommentDTO commentDTO);
}
