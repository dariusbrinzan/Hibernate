package edu.jpa;

import edu.jpa.entity.Company;
import org.apache.log4j.PropertyConfigurator;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Launcher {
    static {
        PropertyConfigurator.configure(Launcher.class.getResource("/log4j.properties"));
    }

    public static void main(String[] args) {
        // Create EntityManager instance
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnits.lab01");
        EntityManager em = emf.createEntityManager();

        // Start transaction
        em.getTransaction().begin();

        // Create and persist companies
        Company company1 = new Company();
        company1.setId(1);
        company1.setName("Company #1");
        company1.setAddress("Company #1 address");
        em.persist(company1);

        Company company2 = new Company();
        company2.setId(2);
        company2.setName("Company #2");
        company2.setAddress("Company #2 address");
        em.persist(company2);

        // Commit transaction
        em.getTransaction().commit();

        // Close EntityManager
        em.close();
        emf.close();
    }
}
