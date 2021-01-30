package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Set;

public class SetReaderExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Set<String> persons = hz.getSet("persons");

        persons.forEach((v) -> System.out.println(v));

        System.out.println("Total number of persons " + persons.size());
    }
}
