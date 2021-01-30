package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Queue;

public class QueueConsumerExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Queue<String> arrivals = hz.getQueue("arrivals");

        String arrival = arrivals.poll();
        System.out.println("Arrival: " + arrival);

        System.out.println("Total number of persons " + arrivals.size());
    }
}
