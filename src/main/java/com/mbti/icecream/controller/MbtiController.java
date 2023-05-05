package com.mbti.icecream.controller;

import com.mbti.icecream.dto.MbtiDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/icecreammbti")    //공통 URL 설정
public class MbtiController {

    @PostMapping("/test")
    public String postMemberDto(@RequestBody MbtiDto mbtiDto){

        if(mbtiDto.getE() > mbtiDto.getI()){
            mbtiDto.setMbti1("E");
        }else{
            mbtiDto.setMbti1("I");
        }
        if(mbtiDto.getN() > mbtiDto.getS()){
            mbtiDto.setMbti2("N");
        }else{
            mbtiDto.setMbti2("S");
        }
        if(mbtiDto.getT() > mbtiDto.getF()){
            mbtiDto.setMbti3("T");
        }else{
            mbtiDto.setMbti3("F");
        }
        if(mbtiDto.getP() > mbtiDto.getJ()){
            mbtiDto.setMbti4("P");
        }else{
            mbtiDto.setMbti4("J");
        }
        return mbtiDto.getMbti1() + mbtiDto.getMbti2() + mbtiDto.getMbti3() + mbtiDto.getMbti4();
    }
}
