package kr.co.habit;

import java.util.Objects;

public class human {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        human human = (human) o;
        return Objects.equals(name, human.name) && Objects.equals(age, human.age) && Objects.equals(height, human.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    private Integer age;
    private Double height;

}
