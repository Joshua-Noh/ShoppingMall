package com.shop.ShoppingMall_TeamPrj.main.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shop.ShoppingMall_TeamPrj.main.admin.vo.AdminVO;

@Controller
public class AdminController {

    @Autowired
    private AdminControllerImpl adminControllerImpl;

    public ModelAndView viewDashboard(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return adminControllerImpl.viewDashboard(request, response);
    }

    public ModelAndView manageUser(@RequestParam("userId") String userId,
                                   HttpServletRequest request, HttpServletResponse response) throws Exception {
        return adminControllerImpl.manageUser(userId, request, response);
    }

    public ModelAndView updateSettings(@ModelAttribute("settings") AdminVO adminVO,
                                       HttpServletRequest request, HttpServletResponse response) throws Exception {
        return adminControllerImpl.updateSettings(adminVO, request, response);
    }
}
