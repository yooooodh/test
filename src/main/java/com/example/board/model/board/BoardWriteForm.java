package com.example.board.model.board;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class BoardWriteForm {
    @NotBlank
    private String title;
    @NotBlank
    private String contents;

    public static Board toBoard(BoardWriteForm boardWriteForm) {
        Board board = new Board();
        board.setTitle(boardWriteForm.getTitle());
        board.setContents(boardWriteForm.getContents());
        return board;
    }
}
