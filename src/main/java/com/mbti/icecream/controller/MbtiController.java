package com.mbti.icecream.controller;

import com.mbti.icecream.dto.MbtiDto;
import com.mbti.icecream.service.MbtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mbti")    //공통 URL 설정
public class MbtiController {

    @Autowired
    MbtiService mbtiService;

    @PostMapping("/result")
    public String postMemberDto(@RequestBody MbtiDto mbtiDto){
        String result = mbtiService.calResult(mbtiDto);
        return result;
    }
}
