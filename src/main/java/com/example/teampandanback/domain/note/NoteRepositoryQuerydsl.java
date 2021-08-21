package com.example.teampandanback.domain.note;

import com.example.teampandanback.domain.project.Project;
import com.example.teampandanback.dto.note.response.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;
import java.util.Optional;

public interface NoteRepositoryQuerydsl {
    List<Note> findByProjectAndUser(Long projectId, Long userId);
    Optional<NoteResponseDto> findByNoteId(Long noteId);

    // 전체 프로젝트에서 해당 유저가 작성한 노트 조회
    List<NoteEachMineInTotalResponseDto> findUserNoteInTotalProject(Long userId, Pageable pageable); // findByUserId()
    @Modifying(clearAutomatically = true)
    void deleteByProjectId(Long projectId);

    List<Note> findAllNoteByProjectAndUserOrderByCreatedAtDesc(Long projectId, Long userId, Pageable pageable);
    List<noteEachSearchInTotalResponseDto> findNotesByUserIdAndKeywordInTotal(Long userId, List<String> keywordList);
    List<NoteEachSearchInMineResponseDto> findNotesByUserIdAndKeywordInMine(Long userId, List<String> keywordList);
    List<Note> findNotesByNoteIdList(List<Long> noteIdList);
    List<Note> findAllByProjectOrderByCreatedAtDesc(Project project, Pageable pageable);

    List<Note> findAllByProjectId(Long projectId);
    Long countByProjectId(Long projectId);
}
