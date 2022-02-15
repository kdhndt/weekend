package be.vdab.weekend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Controller
@RequestMapping("/")
class IndexController {

    @GetMapping
    public ModelAndView index() {
//        var dag = LocalDate.of(0,0,0);
        String dag;
        var dagVanDeWeek = LocalDate.now().getDayOfWeek();
        if (dagVanDeWeek == DayOfWeek.SUNDAY || dagVanDeWeek == DayOfWeek.SATURDAY) {
            dag = "weekend";
        } else {
            dag = "werkdag";
        }
        return new ModelAndView("index").addObject(dag);
    }
}
