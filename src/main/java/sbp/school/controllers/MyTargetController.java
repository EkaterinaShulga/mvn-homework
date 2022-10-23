package sbp.school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/hello")
public class MyTargetController
{

    @RequestMapping(method = RequestMethod.GET)
    public String helloRequestProcessing(ModelMap model)
    {
        System.out.println("MyTargetController processing...");

        model.addAttribute("message", "Hello from MyTargetController");

        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String helloRequestProcessingPost(ModelMap model)
    {
        System.out.println("MyTargetController processing...");

        model.addAttribute("message", "Hello from MyTargetController");

        return "hello";
    }

    public int testJmx()
    {
        return 5;
    }
}
