package structural_patterns.composite;

public interface TaskElement {
    void markComplete();
    TaskStatus getStatus();
    double getTotalTime();
}
