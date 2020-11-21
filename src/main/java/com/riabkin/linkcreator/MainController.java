package com.riabkin.linkcreator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    @Value("${link.start}")
    private String linkStart;

    @Value("${user.link.start}")
    private String userLinkStart;

    @GetMapping
    public ModelAndView index(ModelAndView modelAndView) {

        modelAndView.addObject("link", new Link());

        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView handleCreateLink(ModelAndView modelAndView, Link link) {
        String createdLink = getCreatedLink(link);
        link.setCreatedLink(createdLink);
        modelAndView.addObject("link", link);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    private String getCreatedLink(Link link) {
        String linkEnding = link.getUserLink().replaceAll(userLinkStart, "");
        return link.getUserLink() + linkStart + linkEnding;
    }

}
