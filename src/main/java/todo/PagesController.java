package todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nick on 17/01/16.
 */
@Controller
public class PagesController {
    @RequestMapping("/")
    public String indexPage(Model model) {
        return "index";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        return "about";
    }
}
