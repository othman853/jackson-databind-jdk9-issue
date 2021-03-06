package pojo;

import com.fasterxml.jackson.annotation.JsonCreator;

public class PersonAllArgs {

    private final String name;
    private final Integer age;

    @JsonCreator
    public PersonAllArgs(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
