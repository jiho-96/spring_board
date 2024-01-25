package kr.co.sprboard.comment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class CommentDTO {
    private Long id;
    private String commentWriter;
    private String commentContents;
    private Long boardId;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yy년MM월dd일 HH:mm", timezone="Asia/Seoul")
    private Timestamp commentCreatedTime;
}
