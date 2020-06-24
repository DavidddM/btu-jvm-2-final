package david.maisuradze.davaleba2.repository;

import david.maisuradze.davaleba2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task,Long> {
}
