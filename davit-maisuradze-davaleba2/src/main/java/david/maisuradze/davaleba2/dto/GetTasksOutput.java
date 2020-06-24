package david.maisuradze.davaleba2.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {
    private List<TaskDTO> tasks;
}
