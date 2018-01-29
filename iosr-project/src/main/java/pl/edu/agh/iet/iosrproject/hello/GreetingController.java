package pl.edu.agh.iet.iosrproject.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.OPTIONS })
@RestController
public class GreetingController {
    private static final String MANIPULATOR_ADDRESS = "http://manipulator:1234/iosr/app/transform?value={value}";
    private static final String template = "Hello, %s!";
    private long counter = 0l;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        counter = fetchNewCounter();
        return new Greeting(counter, String.format(template, name));
    }

    private long fetchNewCounter() {
        RestTemplate restTemplate = new RestTemplate();
        double result = restTemplate.getForObject(MANIPULATOR_ADDRESS, Double.class, counter);
        return (long) result;
    }
}
