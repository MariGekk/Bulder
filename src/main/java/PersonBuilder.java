
public class PersonBuilder {

    public String name;
    public String surname;
    public int age;
    public String city;


    public PersonBuilder() {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;

        //if ((this.age < 0) || this.surname == null) {
        //    throw new IllegalArgumentException("Неправильный ввод для создания человека");
        //}

    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, city);

    }
}

