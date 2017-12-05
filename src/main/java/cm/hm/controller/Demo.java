package cm.hm.controller;

import cm.hm.dao.Singer;
import cm.hm.mapper.SingerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by HUIYE on 2017/12/5.
 */
@Controller
public class Demo {

    @Autowired
    SingerMapper singerMapper;

    @RequestMapping("hello")
     public String select(Model model){
        ModelAndView modelAndView = new ModelAndView();
        Singer singer = singerMapper.selectByName("薛");
        System.out.println(singer);
        model.addAttribute("singer",singer);
        return "hello";
     }



}
