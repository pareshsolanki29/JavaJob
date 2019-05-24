package com.galvanize.employeedb.Entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="JOB")
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobID;

    @Override
    public String toString() {
        return "Job{" +
                "jobID=" + jobID +
                ", Customer='" + Customer + '\'' +
                ", hireDate=" + hireDate +
                ", endDate=" + endDate +
                ", employee=" + employee +
                '}';
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    private String Customer;
    private Date hireDate;
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="empID", nullable=true)
    private Employee employee;

}
