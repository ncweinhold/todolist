package todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nick on 17/01/16.
 */
@RestController
@RequestMapping("/todos")
public class TodoController {

    @RequestMapping("/")
    public List<Todo> homepage() {
        List<Todo> todos = (List<Todo>) todoDao.findAll();
        return todos;
    }

    @RequestMapping(path="/create", method=RequestMethod.POST)
    //@ResponseBody
    public Todo createTodo(@RequestParam(name="title", defaultValue = "Untitled") String title,
                             @RequestParam(name="description", defaultValue="No description") String description) {
        Todo todo;
        try {
            todo = new Todo(title, description);
            todoDao.save(todo);
        } catch (Exception e) {
            return null;
        }
        return todo;
    }

    @Autowired
    private TodoDAO todoDao;
}
