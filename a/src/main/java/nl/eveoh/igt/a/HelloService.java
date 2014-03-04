package nl.eveoh.igt.a;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Mark Janssen
 */
@Service
public class HelloService {
    public String sayHello() {
        return "Is it me you're looking for?";
    }
}
