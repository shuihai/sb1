package xiaoming.sb1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(@RequestParam("key") String key) {
        return "Hello World"+key;
    }




    @RequestMapping("/hello2")
    public String index2(@RequestParam("key2") String key2,HttpServletRequest request, HttpServletResponse response) {

        return key2+"Hello World2"+request.getParameter("key");
    }
 
}