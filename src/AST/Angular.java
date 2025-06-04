package src.AST;

import java.util.ArrayList;

public class Angular {
    ArrayList<Program> programs;

    public Angular() {
        this.programs = new ArrayList<>();
    }

    public void addChild(Program program) {
        this.programs.add(program);
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Program program : this.programs) {
            stringBuilder.append(program);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
