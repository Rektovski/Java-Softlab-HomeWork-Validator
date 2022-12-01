package ge.softgen.softlab.tutorial.Interface;

import java.util.List;

public class ValidatorService {
    public static String validate(List<Validator> list) {
        for(var i: list){
            if(!i.isValid()) {
                System.err.println("Invalid Data");
                return "";
            }
        }
        return "Data Accepted!";
    }
}
