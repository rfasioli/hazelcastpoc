package br.com.rfasioli.hazelcastpoc.springboot;

import br.com.rfasioli.hazelcastpoc.springboot.domains.Employee;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.List;
import java.util.Map;

public class EmployeeCashReader {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Map<Object, List<Employee>> employees = hz.getMap("sb_employees");

        employees.forEach((k, v) ->
                v.forEach(e -> System.out.println(e)));

        System.out.println("Total number of employees " + employees.size());
    }
}
