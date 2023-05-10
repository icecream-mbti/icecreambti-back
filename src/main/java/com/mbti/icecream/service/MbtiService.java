package com.mbti.icecream.service;

import com.mbti.icecream.dto.MbtiDto;
import com.mbti.icecream.entity.MbtiResult;
import com.mbti.icecream.repository.MbtiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MbtiService {

    @Autowired
    MbtiRepository mbtiRepository;

    public String calResult(MbtiDto mbtiDto) {
        if (mbtiDto.getE() > mbtiDto.getI()) {
            mbtiDto.setMbti1("E");
        } else {
            mbtiDto.setMbti1("I");
        }
        if (mbtiDto.getN() > mbtiDto.getS()) {
            mbtiDto.setMbti2("N");
        } else {
            mbtiDto.setMbti2("S");
        }
        if (mbtiDto.getT() > mbtiDto.getF()) {
            mbtiDto.setMbti3("T");
        } else {
            mbtiDto.setMbti3("F");
        }
        if (mbtiDto.getP() > mbtiDto.getJ()) {
            mbtiDto.setMbti4("P");
        } else {
            mbtiDto.setMbti4("J");
        }
        String result = mbtiDto.getMbti1() + mbtiDto.getMbti2() + mbtiDto.getMbti3() + mbtiDto.getMbti4();
        mbtiDto.setResult(result);

        return result;  //이 값을 DB result로 저장
    }

    public void save(MbtiResult mbtiResult){
        MbtiResult saved = mbtiRepository.save(mbtiResult);
    }
}
