package prepare_expression.space_equilibration;

public class CleanDoubleSpace {

    static String expression = "";

    protected static String removeSuperfluousSpace(String input) {
        for (int index = 0; index < input.trim().length(); index++) {

            if (input.charAt(index) == ' ' && input.charAt(index + 1) ==' ') {
                continue;
            }
            expression+=input.charAt(index);
        }
        return expression;
    }
}
