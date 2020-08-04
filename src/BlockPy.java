import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BlockPy {
    public String directory;
    public File currentFile;
    public ArrayList<String> lines;
    //TODO Move FileWriter to a instance vairiable that way each time you make a change you dont need to reinitialize the variable

    //TODO When implementing the Block Obj make them stored in a linked list to organize how the lines will be generated
    public BlockPy() {
        //Initializes BlockPy, only used to create the list of lines for now
        this.lines = new ArrayList<>();
        this.directory = System.getProperty("user.dir");
    }

    public void addLine(String line){
        //how new lines of python are added to the file
        this.lines.add(line);
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public File getCurrentFile() {
        return currentFile;
    }

    public void setCurrentFile(File currentFile) {
        this.currentFile = currentFile;
    }

    public void createFile(String fileName){
        //how new python files are created
        try {
            File newFile = new File(this.getDirectory() + "/" + fileName); //grabs current directory and formats with given filename to create the new file
            if (newFile.createNewFile()) { //if the file is created the call will return 1
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists."); //if the file already exists then no new file is made
            }
            this.setCurrentFile(newFile); //sets current file to the newly created file
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void makeChanges(){
        try {
            FileWriter myWriter = new FileWriter(this.currentFile); //initializes filewriter to the current file
            int indent = 0; //default indent to 0
            Boolean whiteSpaceAfter = false;
            Boolean whiteSpaceBefore = false;
            for (String line:this.lines) { //iterates through each line to format then appends to file
                String message = ""; //used for indentation formatting
                for (int i = 0; i < indent; i++) { //number of indents are added
                    message += " ";
                }
                if (line.contains("def ") || line.contains("for ") || line.contains("while(") || line.contains("if ")) { //if an extra indentation is needed i.e. new function, if statement, loops, ect
                    indent += 4;
                    whiteSpaceBefore = true;
                }
                if (line.contains("#end")) { //#end marks the end of an indentation level, this is for this function only, the #end serves no other purpose
                    indent -= 4;
                    whiteSpaceAfter = true;
                }
                if(whiteSpaceBefore){
                    myWriter.append("\n");
                    whiteSpaceBefore = false;
                }

                message += line + "\n"; //adds the newline char
                myWriter.append(message); //appends the line to the file

                if(whiteSpaceAfter){
                    myWriter.append("\n");
                    whiteSpaceAfter = false;
                }
            }
            myWriter.close(); //closes after finished writing
            System.out.println("Successfully wrote to the file."); //notifies completion
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BlockPy blockPy = new BlockPy();
        BlockPyGUI gui = new BlockPyGUI();

        //blockPy.setDirectory("C:/Users/trevj/Desktop/test");
        blockPy.createFile("test.py");

        blockPy.addLine(GeneratePy.comment("This python program was made with BlockPy!!"));
        blockPy.addLine(GeneratePy.def("calculateSum", new String[] {"x","y","z"}));
        blockPy.addLine(GeneratePy.printVal(GeneratePy.sum(GeneratePy.sum("x","y"), "z")));
        blockPy.addLine(GeneratePy.END);
        //blockPy.addLine("");

        blockPy.addLine(GeneratePy.makeVar("v1", GeneratePy.input("Enter First Number:")));
        blockPy.addLine(GeneratePy.makeVar("v2", GeneratePy.input("Enter Second Number:")));
        blockPy.addLine(GeneratePy.makeVar("v3", GeneratePy.input("Enter Third Number:")));
        blockPy.addLine(GeneratePy.call("calculateSum", new String[] {"v1", "v2", "v3"}));
        blockPy.addLine(GeneratePy.forLoop("x", GeneratePy.range(new String[]{"10"})));
        blockPy.addLine(GeneratePy.cond(GeneratePy.negation(GeneratePy.modulo("x","2"))));
        blockPy.addLine(GeneratePy.printVal("x"));
        blockPy.addLine(GeneratePy.END);
        blockPy.addLine(GeneratePy.END);
        blockPy.addLine(GeneratePy.input("end of function"));
        blockPy.makeChanges();

    }
}
