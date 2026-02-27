package ie.atu.week2oop;

import org.springframework.web.bind.annotation.*;

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

    /// Using a Request Parameter
    @GetMapping
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: " + name + ", Age: " + age;
    }
}
