package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Set;

public class FirstSetExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Set<String> persons = hz.getSet("persons");
        persons.add("Tom");
        persons.add("John");
        persons.add("Jobim");

        Map<String, String> employees = hz.getMap("employees");
        employees.forEach((k, e) -> persons.add(e));

        System.out.println("Total number of persons " + persons.size());
    }
}
