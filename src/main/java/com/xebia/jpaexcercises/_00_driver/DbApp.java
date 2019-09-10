package com.xebia.jpaexcercises._00_driver;

import com.xebia.jpaexcercises._01_access.EmployeeWithFieldAccess;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-examples-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        EmployeeWithFieldAccess employee = new EmployeeWithFieldAccess();
        employee.setId(1L);
        employee.setName("Test Employee");
        employee.setEmail("test@test.com");
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        EmployeeWithFieldAccess foundEmployee = entityManager.find(EmployeeWithFieldAccess.class, 1L);
        System.out.println(foundEmployee);
        entityManager.close();
        entityManagerFactory.close();

    }
}
