package cm.hm.controller;

import cm.hm.mapper.UserMapper;
import cm.hm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HUIYE on 2017/12/6.
 */
@Controller
public class Login {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login.action")
    public String login(User user){
        System.out.println(user);
        User user1 = userMapper.selectByName(user);
        if(user1!=null){
            return "menu";
        }
        return "login";

    }
}
