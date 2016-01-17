package todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by nick on 17/01/16.
 */
@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoDAO extends CrudRepository<Todo, Long> {
}
