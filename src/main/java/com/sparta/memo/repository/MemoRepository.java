package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// SimpleJpaRepository에 @Repository가 달려 있음
public interface MemoRepository extends JpaRepository<Memo, Long> {

}
