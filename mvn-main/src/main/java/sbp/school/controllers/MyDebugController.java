package sbp.school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/debug")
public class MyDebugController
{

    @RequestMapping(method = RequestMethod.GET)
    public String debugRequestProcessing(ModelMap model)
    {
        System.out.println("MyTargetController processing...");

        model.addAttribute("message", "Hello from MyDebugController");

        return "debug";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String debugRequestProcessingPost(ModelMap model)
    {
        System.out.println("MyTargetController processing...");

        model.addAttribute("message", "Hello from MyDebugController");

        return "debug";
    }

    public int testJmx()
    {
        return 7;
    }
}
