package cm.hm.controller;

import cm.hm.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by HUIYE on 2017/12/6.
 */

@Controller
public class Customer  {

    @Autowired
    CustomerMapper customerMapper;

    @RequestMapping("/listCustomer")
    public  String listCustomer(Model model){
        List<cm.hm.po.Customer> customers = customerMapper.selectAll();
        model.addAttribute("list",customers);
        return  "jsp/customer/list";

    }
    @RequestMapping("/addCustomerUI")
    public String addCustomerUI(){
        return "jsp/customer/add";

    }

    @RequestMapping("/addCustomer")
    public String addCustomer(cm.hm.po.Customer customer){
        customerMapper.insert(customer);
        return "jsp/success";
    }

    @RequestMapping("/removeCustomer")
    public String removeCustomer(HttpServletRequest request){
        String custId = request.getParameter("custId");
        customerMapper.delete(custId);
        return "jsp/success";
    }
    @RequestMapping("/editCustomerUI")
    public String editCustomerUI(int custId,Model model){
        cm.hm.po.Customer customer = customerMapper.selectById(custId);
        model.addAttribute("customer",customer);
        return "jsp/customer/edit";
    }

    @RequestMapping("/editCustomer")
    public String editCustomer(cm.hm.po.Customer customer){
        System.out.println(1111111);
        System.out.println(customer);
        customerMapper.update(customer);

        return "jsp/success";
    }

}
