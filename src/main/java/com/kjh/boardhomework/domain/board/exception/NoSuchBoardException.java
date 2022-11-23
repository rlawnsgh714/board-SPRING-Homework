package com.kjh.boardhomework.domain.board.exception;

import com.kjh.boardhomework.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class NoSuchBoardException extends CustomException {
    private NoSuchBoardException() {
        super(HttpStatus.NOT_FOUND, "해당 게시글을 찾을 수 없습니다.");
    }

    public static final CustomException EXCEPTION = new NoSuchBoardException();
}