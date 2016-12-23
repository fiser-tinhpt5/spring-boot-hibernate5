package com.tinhpt.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by septechuser on 23/12/2016.
 */
@Entity
@Table(name = "issues", schema = "ddd_training_app")
public class Issue {
    private long id;
    private String content;
    private String action;
    private String status;
    private Date deadline;
    private int assignee;
    private String importance;
    private String urgency;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content", nullable = false, length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "action", nullable = false, length = 1000)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "deadline", nullable = false)
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "assignee", nullable = false)
    public int getAssignee() {
        return assignee;
    }

    public void setAssignee(int assignee) {
        this.assignee = assignee;
    }

    @Basic
    @Column(name = "importance", nullable = false, length = 4)
    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    @Basic
    @Column(name = "urgency", nullable = false, length = 4)
    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Issue issue = (Issue) o;

        if (id != issue.id) return false;
        if (assignee != issue.assignee) return false;
        if (content != null ? !content.equals(issue.content) : issue.content != null) return false;
        if (action != null ? !action.equals(issue.action) : issue.action != null) return false;
        if (status != null ? !status.equals(issue.status) : issue.status != null) return false;
        if (deadline != null ? !deadline.equals(issue.deadline) : issue.deadline != null) return false;
        if (importance != null ? !importance.equals(issue.importance) : issue.importance != null) return false;
        if (urgency != null ? !urgency.equals(issue.urgency) : issue.urgency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + assignee;
        result = 31 * result + (importance != null ? importance.hashCode() : 0);
        result = 31 * result + (urgency != null ? urgency.hashCode() : 0);
        return result;
    }
}
