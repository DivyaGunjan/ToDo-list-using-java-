import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Task {
    String description;
    int duration; // in minutes
    boolean isCompleted;
    int startTime; // start time in minutes from 6 AM

    Task(String description, int duration, int startTime) {
        this.description = description;
        this.duration = duration;
        this.startTime = startTime;
        this.isCompleted = false;
    }

    void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description + " (" + duration + " mins)";
    }
}

class ToDoList {
    List<Task> tasks;
    int dayStartTime; // start time in minutes (from 6 AM)

    ToDoList() {
        tasks = new ArrayList<>();
        dayStartTime = 6 * 60; // 6 AM in minutes
    }

    void addTask(String description, int duration, int startTime) {
        tasks.add(new Task(description, duration, startTime));
    }

    void displayTask(int index) {
        Task task = tasks.get(index);
        String timeSlot = formatTime(task.startTime);
        System.out.println((index + 1) + ". " + timeSlot + " - " + task);
    }

    String formatTime(int minutesFromMidnight) {
        int hours = minutesFromMidnight / 60;
        int minutes = minutesFromMidnight % 60;
        String amPm = (hours >= 12) ? "PM" : "AM";

        // Convert 24-hour format to 12-hour format
        hours = hours % 12;
        if (hours == 0) {
            hours = 12; // Handle midnight and noon
        }

        return String.format("%02d:%02d %s", hours, minutes, amPm);
    }

    void markTaskAsCompleted(int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            tasks.get(taskNumber - 1).markCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    void saveScheduleToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Your Schedule for the Day:\n");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String timeSlot = formatTime(task.startTime);

                writer.write((i + 1) + ". " + timeSlot + " - " + task + "\n");
            }

            System.out.println("Schedule saved to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file: " + e.getMessage());
        }
    }

    int convertToMinutes(String time) {
        // Convert a string like "08:30 AM" or "14:00 PM" to minutes since 6 AM
        String[] timeParts = time.split(" ");
        String[] hourMinutes = timeParts[0].split(":");
        int hours = Integer.parseInt(hourMinutes[0]);
        int minutes = Integer.parseInt(hourMinutes[1]);

        String amPm = timeParts[1];
        if (amPm.equalsIgnoreCase("PM") && hours != 12) {
            hours += 12;
        } else if (amPm.equalsIgnoreCase("AM") && hours == 12) {
            hours = 0; // handle midnight case
        }

        return (hours * 60 + minutes) - dayStartTime; // Offset by start of the day (6 AM)
    }

    void run() {
        Scanner scanner = new Scanner(System.in);

        // Add tasks
        System.out.println("Enter your tasks for the day (type 'done' when finished):");
        while (true) {
            System.out.print("Task description: ");
            String description = scanner.nextLine();
            if (description.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Duration in minutes: ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("At what time do you want to start this task? (e.g., 08:30 AM): ");
            String startTimeStr = scanner.nextLine();
            int startTime = convertToMinutes(startTimeStr) + dayStartTime;

            addTask(description, duration, startTime);
        }

        // Process tasks one by one
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            displayTask(i);

            System.out.println("Have you completed this task? (yes/no): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                markTaskAsCompleted(i + 1);
                System.out.println("Task marked as completed.");
            }
        }

        System.out.print("Would you like to save your schedule to a file? (yes/no): ");
        String saveInput = scanner.nextLine();
        if (saveInput.equalsIgnoreCase("yes")) {
            System.out.print("Enter the filename: ");
            String filename = scanner.nextLine();
            saveScheduleToFile(filename);
        }

        scanner.close();
    }
}

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.run();
    }
}
