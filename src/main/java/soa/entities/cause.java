package soa.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class cause {
    @Id
    private int code_cause;
    private String designation;
    public cause() {
    }

    public cause(int code_cause, String designation) {
        this.code_cause = code_cause;
        this.designation = designation;
    }

    public int getCode_cause() {
        return code_cause;
    }

    public void setCode_cause(int code_cause) {
        this.code_cause = code_cause;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cause cause = (cause) o;
        return code_cause == cause.code_cause && Objects.equals(designation, cause.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code_cause, designation);
    }

    @Override
    public String toString() {
        return "cause{" +
                "code_cause=" + code_cause +
                ", designation='" + designation + '\'' +
                '}';
    }
}
