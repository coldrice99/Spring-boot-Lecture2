package com.sparta.memo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 엔티티 클래스의 상속
@EntityListeners(AuditingEntityListener.class) // 자동으로 시간을 넣어주는 기능이 수행됨. Auditing
public abstract class Timestamped {

    @CreatedDate // 엔티티 객체가 생성되어 저장될 때 시간 값이 자동으로 저장
    @Column(updatable = false) // 업데이트가 되지 않도록 막아줌
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @LastModifiedDate // 조회한 엔티티 값을 변경할 때 변경된 시간이 자동으로 저장
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modifiedAt;
}