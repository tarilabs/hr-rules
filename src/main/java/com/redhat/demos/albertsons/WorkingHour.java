package com.redhat.demos.albertsons;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.kie.dmn.feel.lang.FEELProperty;

public class WorkingHour implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;
    private Long runningTotalHours;

    public WorkingHour() {
    }

    public WorkingHour(LocalDateTime dateTime, Long runningTotalHours) {
        this.dateTime = dateTime;
        this.runningTotalHours = runningTotalHours;
    }

    @FEELProperty("hour")
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Long getRunningTotalHours() {
        return this.runningTotalHours;
    }

    public void setRunningTotalHours(Long runningTotalHours) {
        this.runningTotalHours = runningTotalHours;
    }

    public WorkingHour dateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public WorkingHour runningTotalHours(Long runningTotalHours) {
        this.runningTotalHours = runningTotalHours;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof WorkingHour)) {
            return false;
        }
        WorkingHour workingHour = (WorkingHour) o;
        return Objects.equals(dateTime, workingHour.dateTime) && Objects.equals(runningTotalHours, workingHour.runningTotalHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, runningTotalHours);
    }

    @Override
    public String toString() {
        return "{" +
            " dateTime='" + getDateTime() + "'" +
            ", runningTotalHours='" + getRunningTotalHours() + "'" +
            "}";
    }

    
}