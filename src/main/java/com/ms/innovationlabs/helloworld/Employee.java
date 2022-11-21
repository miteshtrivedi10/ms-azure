package com.ms.innovationlabs.helloworld;

public class Employee {
    private final Integer id;
    private final String name;

    public Employee(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.join(",", String.valueOf(this.id), this.name);
    }
}
