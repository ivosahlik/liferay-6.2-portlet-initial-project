package cz.ivosahlik.controller;

import cz.ivosahlik.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Intellij Idea
 * Created by ivosahlik on 11/02/2018
 */
@Controller
@RequestMapping("VIEW")
public class HomeController {

    private HomeService homeService;

    @Autowired
    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }


    @RenderMapping
    public String home(Model model) {

        model.addAttribute("count", homeService.getCountUsers());

        return "home/home";
    }

}
