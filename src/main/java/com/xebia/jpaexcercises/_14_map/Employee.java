package com.xebia.jpaexcercises._14_map;

import javax.persistence.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ElementCollection
    @CollectionTable(
            name = "phone_numbers",
            joinColumns = @JoinColumn(name = "emp_id")
    )
    @MapKeyColumn(name = "phone_type")
    @Column(name = "phone_number")
    private Map<String, List<String>> phoneNumbers;

    @ElementCollection
    @CollectionTable(name="nick_names")
    private List<String> list_number;

    public Employee() {
    }

    public Employee(String name, Map<String, List<String>> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }
//    public Employee(String name, Map<String, String> phoneNumbers) {
//        this.name = name;
//        this.phoneNumbers = phoneNumbers;
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public Map<String, String> getPhoneNumbers() {
//        return phoneNumbers;
//    }
}
