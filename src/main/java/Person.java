import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String city = "-";

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        if (this.age != -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if ("-".equals(city)) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        city = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age = age + 1;
        }
        ;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder()
                //.setSurname(this.name)
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.city);
        return child;
    }

}