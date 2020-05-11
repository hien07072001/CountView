package com.codegym.controller;

import com.codegym.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
//dung de luu tru model Attribute trong session
public class CounterController {
    @ModelAttribute("mycounter")
//    model attribute "mycounter"  sẽ được thêm vào session nếu tên attribute của @ModelAttribute
////    và @SessionAttributes giống nhau.
    public MyCounter setUpCounter(){
        return  new MyCounter();

    }
    @GetMapping("/")
    public  String get(@ModelAttribute("mycounter") MyCounter myCounter){
        myCounter.increment();
        return "index";
    }

}
