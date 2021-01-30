package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstListExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        List<String> persons = hz.getList("persons");
        persons.add("Tom");
        persons.add("John");
        persons.add("Jobim");

        Map<String, String> employees = hz.getMap("employees");
        employees.forEach((k, e) -> persons.add(e));

        System.out.println("Total number of persons " + persons.size());
    }
}
