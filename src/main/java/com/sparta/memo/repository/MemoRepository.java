package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

// SimpleJpaRepository에 @Repository가 달려 있음
public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();

    // 2주차 숙제
    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);
}
