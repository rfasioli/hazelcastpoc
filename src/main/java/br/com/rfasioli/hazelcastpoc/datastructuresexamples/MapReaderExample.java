package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class MapReaderExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Map<String, String> employees = hz.getMap("employees");

        employees.forEach((k, v) -> System.out.println(k + " - " + v));

        System.out.println("Total number of employees " + employees.size());
    }
}
