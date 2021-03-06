package ru.eltech.tprsystem.web.task;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Semyon on 21.02.2016.
 */
public class TaskPresentation {

    private UUID taskId = null;

    private String inputData;

    private String taskIdentifier;

    private Date timestamp;

    public TaskPresentation(final UUID taskId, final String taskIdentifier, final String inputData, final Date timestamp) {
        this.inputData = inputData;
        this.taskIdentifier = taskIdentifier;
        this.timestamp = timestamp;
        this.taskId = taskId;
    }

    public String getInputData() {
        return inputData;
    }

    public void setInputData(final String inputData) {
        this.inputData = inputData;
    }

    public String getTaskIdentifier() {
        return taskIdentifier;
    }

    public void setTaskIdentifier(final String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(final UUID taskId) {
        this.taskId = taskId;
    }
}
