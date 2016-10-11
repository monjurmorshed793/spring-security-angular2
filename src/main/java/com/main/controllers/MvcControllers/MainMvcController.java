package com.main.controllers.MvcControllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by munna on 10/11/16.
 */
@Controller
public class MainMvcController {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/health")
    public String health(){
        return "health";
    }
}
