package structural_patterns.composite;

public class Task implements TaskElement{
    private String taskName;
    private double estimatedTime;
    private boolean isCompleted;
    private TaskStatus taskStatus;
    public Task(String taskName, double estimatedTime) {
        this.taskName = taskName;
        this.estimatedTime = estimatedTime;
        this.isCompleted = false;
        this.taskStatus = TaskStatus.inProgress;
    }

    @Override
    public void markComplete() {
        this.isCompleted = true;
        this.taskStatus = TaskStatus.Complete;
    }

    @Override
    public TaskStatus getStatus() {
        return taskStatus;
    }

    public void setStatus(TaskStatus status) {
        this.taskStatus = status;
    }

    @Override
    public double getTotalTime() {
        return estimatedTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setEstimatedTime(double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
}
