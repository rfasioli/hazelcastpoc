package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Queue;

public class FirstQueueExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Queue<String> arrivals = hz.getQueue("arrivals");
        arrivals.add("New York 1");
        arrivals.add("Paris 2");
        arrivals.add("London 3");
        arrivals.add("New York 4");
        arrivals.add("Tokyo 5");
        arrivals.add("São Paulo 6");
        arrivals.add("New York 7");
        arrivals.offer("New York 11");
        arrivals.offer("Paris 12");
        arrivals.offer("London 13");
        arrivals.offer("New York 14");
        arrivals.offer("Tokyo 15");
        arrivals.offer("São Paulo 16");

        System.out.println("Total number of arrivals " + arrivals.size());
    }
}
