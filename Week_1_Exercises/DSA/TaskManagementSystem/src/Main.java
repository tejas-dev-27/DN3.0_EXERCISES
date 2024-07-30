public class Main {
    public static void main(String[] args) {
        LinkedList taskList = new LinkedList();

        taskList.addTask(new Task("T1", "Task 1", "Pending"));
        taskList.addTask(new Task("T2", "Task 2", "Completed"));
        taskList.addTask(new Task("T3", "Task 3", "In Progress"));

        System.out.println();
        System.out.println("Tasks after adding:");
        taskList.displayTasks();

        String searchId = "T2";
        Task foundTask = taskList.searchTask(searchId);
        if (foundTask != null) {
            System.out.println();
            System.out.println("Found Task: " + foundTask);
        } else {
            System.out.println();
            System.out.println("Task with ID " + searchId + " not found.");
        }

        taskList.deleteTask("T2");
        System.out.println();
        System.out.println("Tasks after deletion:");
        taskList.displayTasks();

        taskList.addTask(new Task("T4", "Task 4", "Pending"));
        System.out.println();
        System.out.println("More Tasks:");
        taskList.displayTasks();
    }
}
