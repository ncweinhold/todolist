package todo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nick on 17/01/16.
 */

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
