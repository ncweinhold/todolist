package todo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nick on 17/01/16.
 */
@RestController
public class TodoController {

    @RequestMapping("/")
    public String homepage() {
        return "Hello World";
    }
}
