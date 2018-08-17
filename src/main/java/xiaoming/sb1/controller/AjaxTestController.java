package xiaoming.sb1.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("ajaxtest")
public class AjaxTestController {

    private Gson gson = new Gson();


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index( String json,String gogo) {
//        List<Person> ps = gson.fromJson(str, new TypeToken<List<Person>>(){}.getType());
        System.out.println(gogo);
        Type type = new TypeToken<Hehe>() {}.getType();
        Hehe programList = gson.fromJson(json, type);
        return gson.toJson(programList);
    }


    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    public String index3(@RequestBody String json) {
        System.out.println(json);
        Hehe person = gson.fromJson(json, Hehe.class);
        return gson.toJson(person);
    }






    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String index(@RequestBody Hehe hehe) {

        System.out.println(hehe.data);

        String json2 = "{\"data\":33}";
        Hehe person = gson.fromJson(json2, Hehe.class);
        return gson.toJson(person);
    }

}

class Hehe {
    public String data;
}