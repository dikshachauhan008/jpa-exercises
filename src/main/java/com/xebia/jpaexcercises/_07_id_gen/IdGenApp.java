package com.xebia.jpaexcercises._07_id_gen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IdGenApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-examples-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Employee employee = new Employee();
        employee.setName("Test Employee");
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        Employee foundEmployee = entityManager.find(Employee.class, 1L);
        System.out.println(foundEmployee);
        entityManager.close();
        entityManagerFactory.close();

    }
}
