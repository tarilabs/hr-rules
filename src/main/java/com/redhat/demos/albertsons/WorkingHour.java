package com.redhat.demos.albertsons;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WorkingHour implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;

    public WorkingHour() {
    }

    public WorkingHour(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof WorkingHour)) {
            return false;
        }
        WorkingHour workingHour = (WorkingHour) o;
        return Objects.equals(dateTime, workingHour.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dateTime);
    }

    @Override
    public String toString() {
        return "{" +
            " dateTime='" + getDateTime() + "'" +
            "}";
    }
    
}