package com.example.teampandanback.dto.note;

import lombok.Getter;
import lombok.Setter;

@Getter
public class NoteRequestDto {
    private String title;
    private String content;
    private String deadline;
}