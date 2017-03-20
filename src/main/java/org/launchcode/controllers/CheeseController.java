package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ahmed on 3/20/17.
 */

//comment stub

@Controller
public class CheeseController {

    @RequestMapping(value = "")
    public String index() {
        return "index";
    }
}
