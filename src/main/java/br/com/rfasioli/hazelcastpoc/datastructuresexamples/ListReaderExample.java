package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.List;

public class ListReaderExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        List<String> persons = hz.getList("persons");

        persons.forEach((v) -> System.out.println(v));

        System.out.println("Total number of persons " + persons.size());
    }
}
