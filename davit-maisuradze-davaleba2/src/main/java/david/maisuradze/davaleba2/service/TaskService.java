package david.maisuradze.davaleba2.service;

import david.maisuradze.davaleba2.dto.*;

public interface TaskService {
    AddTaskOutput addTask(AddTaskInput addTaskInput);
    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
    GetTasksOutput getTasks(GetTasksInput getTasksInput);
}
