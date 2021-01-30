package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.List;
import java.util.Queue;

public class QueueReaderExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Queue<String> arrivals = hz.getQueue("arrivals");

        arrivals.forEach((v) -> System.out.println(v));

        System.out.println("Total number of persons " + arrivals.size());
    }
}
