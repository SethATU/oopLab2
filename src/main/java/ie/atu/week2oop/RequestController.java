package ie.atu.week2oop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {

    /// Basic rest controller
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    /// Using a path variable
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
