package br.com.rfasioli.hazelcastpoc.datastructuresexamples;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

/**
 * A diferença entre um Map e um ReplicatedMap é que no segundo o map sempre é replicado em todos os nós do cluster,
 *  isto basicamente resulta em: Aumento de performance, aumento do consumo de memória.
 */
public class ReplicatedMapExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Map<String, String> employees = hz.getReplicatedMap("employees");
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
