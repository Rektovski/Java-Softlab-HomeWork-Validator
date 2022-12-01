package ge.softgen.softlab.tutorial.Implementation;

import ge.softgen.softlab.tutorial.Interface.Validator;

import java.util.Objects;

public class GenderValidator implements Validator {
    String gender;

    public GenderValidator(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public Boolean isValid() {
        return Objects.equals(gender, "MALE") || Objects.equals(gender, "FEMALE");
    }
}
