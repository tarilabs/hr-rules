package com.redhat.demos.albertsons;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HireDateReference implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate today;

    public HireDateReference() {
    }

    public HireDateReference(LocalDate startDate, LocalDate endDate, LocalDate today) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.today = today;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getToday() {
        return this.today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HireDateReference)) {
            return false;
        }
        HireDateReference hireDateReference = (HireDateReference) o;
        return Objects.equals(startDate, hireDateReference.startDate) && Objects.equals(endDate, hireDateReference.endDate) && Objects.equals(today, hireDateReference.today);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, today);
    }

    @Override
    public String toString() {
        return "{" +
            " startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", today='" + getToday() + "'" +
            "}";
    }
   
}