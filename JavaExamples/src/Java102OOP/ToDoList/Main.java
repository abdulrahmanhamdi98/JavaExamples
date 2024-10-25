package Java102OOP.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Delete Task");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();
                    System.out.print("Enter priority (1 - Low, 2 - Medium, 3 - High): ");
                    int priority = scanner.nextInt();
                    Task newTask = new Task(name, dueDate, priority);
                    todoList.addTask(newTask);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.print("Enter task number to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (editIndex > 0 && editIndex <= todoList.getSize()) {
                        System.out.print("Enter new task name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new due date: ");
                        String newDueDate = scanner.nextLine();
                        System.out.print("Enter new priority (1 - Low, 2 - Medium, 3 - High): ");
                        int newPriority = scanner.nextInt();
                        todoList.editTask(editIndex - 1, newName, newDueDate, newPriority);
                        System.out.println("Task edited successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex > 0 && deleteIndex <= todoList.getSize()) {
                        todoList.deleteTask(deleteIndex - 1);
                        System.out.println("Task deleted successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    todoList.listTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
                    }
        }
    }
}
