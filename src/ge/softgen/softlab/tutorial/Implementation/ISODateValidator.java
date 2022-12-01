package ge.softgen.softlab.tutorial.Implementation;

import ge.softgen.softlab.tutorial.Interface.Validator;

import java.time.LocalDate;

public class ISODateValidator implements Validator {
    String birthDate;

    public ISODateValidator(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public Boolean isValid() {
        if(birthDate.length()!=10){
            return false;
        }
        String[] temp = birthDate.split(" ");
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);

        return !LocalDate.of(year, month, day).isAfter(LocalDate.now());
    }
}
