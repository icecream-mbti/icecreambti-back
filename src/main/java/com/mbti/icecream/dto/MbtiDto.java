package com.mbti.icecream.dto;

import com.mbti.icecream.entity.MbtiResult;
import com.mbti.icecream.service.MbtiService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class MbtiDto {
    private int E,I,N,S,T,F,P,J;
    private String mbti1,mbti2,mbti3,mbti4;
    private String result;

    //자동으로 생성되는 id와 timestamp는 null
    public MbtiResult toEntity() {
        return new MbtiResult(null, result, null);
    }


}
