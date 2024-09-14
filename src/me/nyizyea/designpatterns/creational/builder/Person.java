package me.nyizyea.designpatterns.creational.builder;

public class Person {
    private String name;
    private String email;
    private String address;
    private int age;

    public Person(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private String name;
        private String email;
        private String address;
        private int age;

        public Builder(String name) {
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
