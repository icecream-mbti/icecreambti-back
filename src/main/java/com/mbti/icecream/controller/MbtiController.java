package com.mbti.icecream.controller;

import com.mbti.icecream.dto.MbtiDto;
import com.mbti.icecream.entity.MbtiResult;
import com.mbti.icecream.repository.MbtiRepository;
import com.mbti.icecream.service.MbtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mbti")    //공통 URL 설정
public class MbtiController {

    @Autowired
    MbtiService mbtiService;
    @Autowired
    MbtiRepository mbtiRepository;

    @PostMapping(value = "/result")
    public String calmbti(@RequestBody MbtiDto mbtiDto){
        // dto로 받아온 데이터로 service한테 mbti를 계산하게 하고, 결과 값을 받아옴.
        String result = mbtiService.calResult(mbtiDto);

        // Dto를 Entity화
        MbtiResult mbtiResult = mbtiDto.toEntity();

        // Service한테 넘겨서 Repository한테 Entity를 DB안에 저장하게 함.
        mbtiService.save(mbtiResult);

        return result;
    }
}
