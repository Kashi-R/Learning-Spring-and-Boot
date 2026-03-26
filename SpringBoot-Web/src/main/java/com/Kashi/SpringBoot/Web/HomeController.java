package com.Kashi.SpringBoot.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
   /** public String add(HttpServletRequest req, HttpSession session){

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);
        session.setAttribute("result",result);
        return result.jsp;
    * */


    public ModelAndView add(int num1, @RequestParam("num2") int nu, ModelAndView mv){

        int result = num1 + nu ;
        System.out.println(result);

        mv.addObject("result",result);
        mv.setViewName("result");
//        System.out.println("add method called");
        return mv;
    }
}
