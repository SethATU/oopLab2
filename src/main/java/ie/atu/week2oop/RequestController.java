package ie.atu.week2oop;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    /// Basic rest controller
    @GetMapping("/hello")
    public String hello() {
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

    /// Using JSON
    @GetMapping("/person")
    public Person getPerson() {
        return new Person("Seth", 21);
    }

    /// calculator
    @GetMapping("/calculate")
    public Calculate getCalculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        double result;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if(num2 == 0) {
                    return new Calculate("Divide By Zero");
                }
                else {
                    result = (double) num1 / num2;
                }
                break;
            default:
                return new Calculate("Error, use (add, subtract, multiply, divide)");
        }
        return new Calculate(num1, num2, operation, result);
    }
}
