package com.kjh.boardhomework.global.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class FormatterUtils {

    public String formatDateTime(LocalDateTime localDateTime) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy'λ' M'μ' h'μ' m'λΆ'");
        return formatter.format(localDateTime);
    }

    public String getPreviewString(String content, int maximum) {
        if(content.length() > maximum) {
            return String.format("%s..", content.substring(0, maximum - 3));
        } else return content;
    }
}
