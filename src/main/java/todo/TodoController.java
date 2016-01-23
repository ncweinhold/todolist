package todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nick on 17/01/16.
 */
@Controller
public class TodoController {
    private TodoRepository todoRepository;

    @RequestMapping(path="/", method=RequestMethod.GET)
    public String todoList(Model model) {
        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        if (todos != null) {
            model.addAttribute("todolist", todos);
        }
        return "todos";
    }

    @RequestMapping(path="/", method=RequestMethod.POST)
    public String createTodo(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
}
