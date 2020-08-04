public class GeneratePy {
    //this library will be used to make it easy to write python code in java, mainly eliminates the reuse of \" for strings in python
    //it will also easily convert things like java Iterable objects into python arrays, dictionaries, ect.
    public static final String END = "#end";

    //GENERAL FUNCTIONS
    public static String printString(String message) {
        return "print(\"" + message + "\")";
    }

    public static String printVal(String val) {return "print(" + val + ")";}

    public static String comment(String message){
        return "#" + message;
    }

    public static String input(String message){
        return "input(\"" + message + "\")";
    }

    public static String range(String[] nums){
        String line = "range(";
        for (String num:nums) {
            line += num + ", ";
        }
        return line.substring(0, line.length()-2) + ")";
    }

    //MATH FUNCTIONS
    public static String sum(String x, String y){
        return x + " + " + y;
    }
    public static String difference(String x, String y){
        return x + " - " + y;
    }
    public static String multiply(String x, String y){
        return x + " * " + y;
    }
    public static String divide(String x, String y){
        return x + " / " + y;
    }
    public static String modulo(String x, String y){
        return x + " % " + y;
    }
    public static String power(String x, String y){
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
        return "not (" + expression1 + ")";
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

    //TODO ELSE IF
    //TODO ELSE

    //LOOP FUNCTIONS

    //TODO FOR LOOP
    public static String forLoop(String var, String range){
        return "for " + var + " in " + range + ":";
    }
    //TODO WHILE LOOP

    public static String whileLoop(String condition){
        return "while(" + condition + "):";
    }


    public static String def(String name, String[] args){
        String line = "def " + name + "(";
        for (String arg:args) {
            line = line.concat(arg) + ", "; //ADD COMMAS
        }
        line = line.substring(0, line.length()-2); //REMOVE LAST COMMA
        line = line.concat("):");
        return line;
    }

    public static String call(String function, String[] args){
        String line = function + "(";
        for (String arg:args) {
            line = line.concat(arg) + ", "; //ADD COMMAS
        }
        line = line.substring(0, line.length()-2); //REMOVE LAST COMMA
        line = line.concat(")");
        return line;
    }
}
