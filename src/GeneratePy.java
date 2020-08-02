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

    public static String def(String name, String[] args){
        String line = "def " + name + "(";
        for (String arg:args) {
            line = line.concat(arg); //ADD COMMAS
        }
        line = line.concat("):");
        return line;
    }
}
