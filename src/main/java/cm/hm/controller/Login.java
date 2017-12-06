package cm.hm.controller;

import cm.hm.mapper.UserMapper;
import cm.hm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

/**
 * Created by HUIYE on 2017/12/6.
 */
@Controller
public class Login {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login.action")
    public String login(User user, HttpSession Session){
        System.out.println(user);
        User user1 = userMapper.selectByName(user);
        if(user1!=null){
            Session.setAttribute("u_name",user.getU_name());
            return "menu";
        }
        return "login";

    }
    @RequestMapping("test.action")
    public String test(){
        return "menu";
    }
}
