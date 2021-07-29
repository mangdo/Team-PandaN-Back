package com.example.teampandanback.dto.project;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class ProjectListResponseDto {
    List<ProjectResponseDto> projects;

    @Builder
    public ProjectListResponseDto(List<ProjectResponseDto> projectResponseDtoList) {
        this.projects = projectResponseDtoList;
    }
}