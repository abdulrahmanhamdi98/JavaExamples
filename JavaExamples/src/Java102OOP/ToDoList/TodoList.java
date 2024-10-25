package Java102OOP.ToDoList;

import java.util.ArrayList;

public class TodoList {
    private final ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public int getSize(){
        return tasks.size();
    }



    public void addTask(Task task){
        tasks.add(task);
    }
    public void editTask(int index, String newName, String newDueDate, int newPriority){
        Task task = tasks.get(index);
        task.setName(newName);
        task.setDueDate(newDueDate);
        task.setPriority(newPriority);

    }
    public void deleteTask(int index){
        tasks.remove(index);
    }
    public void listTasks(){
        System.out.println("Tasks: ");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i+1) + ". Name: "+ task.getName() + ". Due Date: " + task.getDueDate() + ". Priority: " + task.getPriority());

        }
    }
}
