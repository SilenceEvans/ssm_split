package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/maven")
public class Maven {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/find")
    public ModelAndView findById(Integer id,ModelAndView modelAndView){

        Items items = itemsService.findById(id);
        modelAndView.addObject("items",items);
        modelAndView.setViewName("items");
        return modelAndView;

    }

}
