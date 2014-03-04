package nl.eveoh.igt.b;

import nl.eveoh.igt.a.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Mark Janssen
 */
@Controller
public class WebController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String root() {
        return helloService.sayHello();
    }
}
