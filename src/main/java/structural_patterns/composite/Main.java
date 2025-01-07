package structural_patterns.composite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create individual tasks
        Task task1 = new Task("Task 1", 5);
        Task task2 = new Task("Task 2", 3);
        Task task3 = new Task("Task 3", 2);

        // Create a sub-project
        Project subProject = new Project("Sub-Project 1", new ArrayList<>());
        subProject.addTaskElement(task3);

        // Create a main project and add tasks and the sub-project
        Project mainProject = new Project("Main Project", new ArrayList<>());
        mainProject.addTaskElement(task1);
        mainProject.addTaskElement(task2);
        mainProject.addTaskElement(subProject);

        // Display project details before marking complete
        System.out.println("Main Project Status: " + mainProject.getStatus());
        System.out.println("Total Time: " + mainProject.getTotalTime() + " hours");

        // Mark tasks and projects as complete
        task1.markComplete();
        task2.markComplete();
        task3.markComplete();
        subProject.markComplete();

        // Display project details after marking complete
        System.out.println("\nMain Project Status after completion: " + mainProject.getStatus());
    }
}
