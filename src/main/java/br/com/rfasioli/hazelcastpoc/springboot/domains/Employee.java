package br.com.rfasioli.hazelcastpoc.springboot.domains;

import java.io.Serializable;

public class Employee implements Serializable {
    private String empId;
    private String empName;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("empId='").append(empId).append('\'');
        sb.append(", empName='").append(empName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
