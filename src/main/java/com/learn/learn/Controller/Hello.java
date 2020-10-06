package com.learn.learn.Controller;

import com.learn.learn.Dao.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Hello {

    @Autowired
    Mapper mapper;

    @ResponseBody
    @GetMapping("/")
    public List<Integer> sayHello(){
        List<Integer> id = mapper.getId();
        return id;
    }
}
