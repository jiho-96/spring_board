package kr.co.sprboard.comment.service;

import kr.co.sprboard.comment.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> findAll(Long id);

    void save(CommentDTO commentDTO);
}
