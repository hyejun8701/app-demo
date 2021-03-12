package com.example.appdemo.dto;

import com.example.appdemo.domain.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long seq;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public BoardEntity toEntity() {
        BoardEntity board = BoardEntity.builder()
                .seq(seq)
                .writer(writer)
                .title(title)
                .content(content)
                .build();

        return board;
    }

    @Builder
    public BoardDto(Long seq, String title, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.seq = seq;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
