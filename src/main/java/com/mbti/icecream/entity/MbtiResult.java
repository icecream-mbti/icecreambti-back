package com.mbti.icecream.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "MBTI_RESULT")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)  //IDE단계에서 필수값 누락을 막을 수 있음.
@AllArgsConstructor
public class MbtiResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String result;

    @CreationTimestamp
    private Timestamp createDate;

}
