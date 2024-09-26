package classes.validation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Validator {
    private static final String VALID_FORMAT = "^[0-9., ]+$";

    public int[] validator() throws IOException {
        Path filePath = Paths.get("C:\\Users\\Дмитрий\\OneDrive\\Рабочий стол\\massive\\input\\input.txt");
        Stream<String> lines = Files.lines(filePath);
        List<Integer> numbers = lines.filter(Validator::isValidLine).
                flatMap(line -> Stream.of(line.split("[., ]+"))).
                filter(s -> !s.isEmpty()).
                map(Integer::parseInt).
                collect(Collectors.toList());
        int[] resultArray = numbers.stream().mapToInt(Integer::intValue).toArray();
        return resultArray;
    }
    private static boolean isValidLine(String line) {
        return Pattern.matches(VALID_FORMAT, line.trim());
    }
}
