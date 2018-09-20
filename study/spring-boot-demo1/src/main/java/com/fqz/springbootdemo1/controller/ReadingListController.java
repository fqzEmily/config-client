package com.fqz.springbootdemo1.controller;

import com.fqz.springbootdemo1.interf.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ReadingListController {
    @Autowired
    private ReadingListRepository readingListRepository;

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readersBooks(@PathVariable String reader, Model model){
        readingListRepository.findByReader()
    }

    public String addToReadingList(){

    }
}
