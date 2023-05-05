package com.mbti.icecream.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class MbtiDto {
    private int E,I,N,S,T,F,P,J;
    private String mbti1,mbti2,mbti3,mbti4;
}
