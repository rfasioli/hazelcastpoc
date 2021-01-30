package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class FirstMapExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Map<String, String> employees = hz.getMap("employees");
        if(employees.containsKey("1"))
        {
            employees.put("6", "emp6");

        }else
            employees.put("1", "emp1");
        employees.put("2", "emp2");
        employees.put("3", "emp3");
        employees.put("4", "emp4");
        employees.put("5", "emp5");

        System.out.println("Total number of employees " + employees.size());
    }
}
