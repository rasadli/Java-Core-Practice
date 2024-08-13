package week09;

public class Task implements Comparable<Task> {
    private String name;
    private double duration;
    private int priority;

    public Task(String name, double duration, int priority) {
        this.name = name;
        this.duration = duration;
        this.priority = priority;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task [name=" + name + ", duration=" + duration + ", priority=" + priority + "]";
    }

    @Override
    public int compareTo(Task other) {
        return this.getPriority() - other.getPriority();
    }
} 
