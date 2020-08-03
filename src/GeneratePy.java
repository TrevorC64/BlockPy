public class GeneratePy {
    //this library will be used to make it easy to write python code in java, mainly eliminates the reuse of \" for strings in python
    //it will also easily convert things like java Iterable objects into python arrays, dictionaries, ect.
    public static final String END = "#end";

    public static String print(String message) {
        return "print(\"" + message + "\")";
    }

    public static String comment(String message){
        return "#" + message;
    }

    public static String input(String message){
        return "input(\"" + message + "\")";
    }

    //MATH FUNCTIONS
    public static String sum(Integer x, Integer y){
        return x + " + " + y;
    }
    public static String difference(Integer x, Integer y){
        return x + " - " + y;
    }
    public static String multiply(Integer x, Integer y){
        return x + " * " + y;
    }
    public static String divide(Integer x, Integer y){
        return x + " / " + y;
    }
    public static String modulo(Integer x, Integer y){
        return x + " % " + y;
    }
    public static String power(Integer x, Integer y){
        return x + " ** " + y;
    }

    //LOGIC FUNCTIONS
    public static String conjunction(String[] args){
        String line = "";
        for (String arg:args) {
            line += arg + " and ";
        }
        return line.substring(0, line.length()-5);
    }
    public static String disjunction(String[] args){
        String line = "";
        for (String arg:args) {
            line += arg + " or ";
        }
        return line.substring(0, line.length()-5);
    }
    public static String negation(String expression1){
        return "!" + expression1;
    }

    //COMPARATOR FUNCTIONS
    public static String greaterThan(String expression1, String expression2){
        return expression1 + ">" + expression2;
    }
    public static String lessThan(String expression1, String expression2){
        return expression1 + "<" + expression2;
    }
    public static String greaterThanEqual(String expression1, String expression2){
        return expression1 + ">=" + expression2;
    }
    public static String lessThanEqual(String expression1, String expression2){
        return expression1 + "<=" + expression2;
    }
    public static String equalTo(String expression1, String expression2){
        return expression1 + "==" + expression2;
    }
    public static String notEqualTo(String expression1, String expression2){
        return expression1 + "!=" + expression2;
    }

    //VARIABLE FUNCTIONS
    public static String makeVar(String name, String value){
        return name + "=" + value;
    }
    public static String addAnd(String name, String value){
        return name + "+=" + value;
    }
    public static String subtractAnd(String name, String value){
        return name + "-=" + value;
    }
    public static String multiplyAnd(String name, String value){
        return name + "*=" + value;
    }
    public static String divideAnd(String name, String value){
        return name + "/=" + value;
    }
    public static String moduloAnd(String name, String value){
        return name + "%=" + value;
    }
    public static String exponentAnd(String name, String value){
        return name + "**=" + value;
    }

    //CONDITIONAL FUNCTIONS
    public static String cond(String condition){
        return "if " + condition + ":";
    }






    public static String def(String name, String[] args){
        String line = "def " + name + "(";
        for (String arg:args) {
            line = line.concat(arg); //ADD COMMAS
        }
        line = line.concat("):");
        return line;
    }
}
