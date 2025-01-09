package edu.jpa.TABLE_PER_HIERARCHY;

import edu.jpa.TABLE_PER_HIERARCHY.entity.*;
import jakarta.persistence.*;

public class Launcher {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnits.lab04.TABLE_PER_HIERARCHY");
        EntityManager em = emf.createEntityManager();

        init(em);
        sample(em);

        em.close();
        emf.close();
    }

    private static void init(EntityManager em) {
        em.getTransaction().begin();

        Customer customer = new Customer();
        customer.setName("Customer #1");
        customer.setDiscount(10.5);
        em.persist(customer);

        Employee employee = new Employee();
        employee.setName("Employee #1");
        employee.setSalary(2500.0);
        em.persist(employee);

        Executive executive = new Executive();
        executive.setName("Executive #1");
        executive.setBonus(1500.0);
        em.persist(executive);

        em.getTransaction().commit();
    }

    private static void sample(EntityManager em) {
        Person person = em.find(Person.class, 1);
        if (person != null) {
            System.out.println("Found person: " + person.getName());
        }
    }
}
