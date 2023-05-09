package com.mbti.icecream.repository;

import com.mbti.icecream.entity.MbtiResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MbtiRepository extends JpaRepository<MbtiResult, Long> {
}
