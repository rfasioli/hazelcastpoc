package br.com.rfasioli.hazelcastpoc.asclientexamples;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class ClientMapExample {
    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();
        HazelcastInstance hz = HazelcastClient.newHazelcastClient(config);
        Map<String, String> employees = hz.getMap("employees");

        employees.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("Total number of employees " + employees.size());

        employees.remove(2);

        employees.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("Total number of employees " + employees.size());
    }
}
