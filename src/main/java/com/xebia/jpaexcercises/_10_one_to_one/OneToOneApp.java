package com.xebia.jpaexcercises._10_one_to_one;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("jpa-examples-pu");
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            ParkingSpace parkingSpace = new ParkingSpace(123);
            Employee employee = new Employee("Test Employee", 1_000_000, parkingSpace);
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManager = entityManagerFactory.createEntityManager();

            Employee foundEmployee = entityManager.find(Employee.class, employee.getId());
            System.out.println(foundEmployee);

            entityManager.close();
            entityManager = entityManagerFactory.createEntityManager();

            ParkingSpace foundParking = entityManager.find(ParkingSpace.class, parkingSpace.getId());
            System.out.println(foundParking);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);

        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }

    }
}
