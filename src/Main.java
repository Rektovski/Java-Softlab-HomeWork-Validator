import ge.softgen.softlab.tutorial.Implementation.GenderValidator;
import ge.softgen.softlab.tutorial.Implementation.ISODateValidator;
import ge.softgen.softlab.tutorial.Implementation.IdValidator;
import ge.softgen.softlab.tutorial.Interface.Validator;
import ge.softgen.softlab.tutorial.Interface.ValidatorService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.nextLine();
        String gender = scanner.nextLine();
        String birthDate = scanner.nextLine();

        List<Validator> list = List.of(
                new IdValidator(id),
                new GenderValidator(gender),
                new ISODateValidator(birthDate)
        );

        System.out.println(ValidatorService.validate(list));
    }
}