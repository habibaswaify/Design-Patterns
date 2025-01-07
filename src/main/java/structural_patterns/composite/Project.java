package structural_patterns.composite;

import java.util.List;

public class Project implements TaskElement{
    private String projectName;
    private List<TaskElement> taskElements;

    public Project(String projectName, List<TaskElement> taskElements) {
        this.projectName = projectName;
        this.taskElements = taskElements;
    }
    public void addTaskElement(TaskElement taskElement){
        taskElements.add(taskElement);
    }
    public void removeTaskElement(TaskElement taskElement){
        taskElements.remove(taskElement);
    }

    @Override
    public void markComplete() {
        for(TaskElement taskElement: taskElements){
            taskElement.markComplete();
        }

    }

    @Override
    public TaskStatus getStatus() {
        // Assume the project status is determined based on whether all tasks are complete or at least one is pending
        for(TaskElement taskElement: taskElements){
            if(taskElement.getStatus().equals(TaskStatus.inProgress)){
                return taskElement.getStatus();
            }
        }
        return TaskStatus.Complete;
    }

    @Override
    public double getTotalTime() {
        double totalTime = 0;
        for(TaskElement taskElement: taskElements){
            totalTime += taskElement.getTotalTime();
        }
        return totalTime;
    }
}
