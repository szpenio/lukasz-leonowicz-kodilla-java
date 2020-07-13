package com.kodilla.patterns.factory.tasks;

public class DrivingTask extends TaskForm {

    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        super(taskName);
        this.where = where;
        this.using = using;
    }
}
