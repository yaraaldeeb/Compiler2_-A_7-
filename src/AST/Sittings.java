package src.AST;

import java.util.ArrayList;

public class Sittings {
    ArrayList<String> ids = new ArrayList<>();
    ArrayList<String> paths = new ArrayList<>();
    ArrayList<ThingToImport> thingToImports = new ArrayList<>();

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        if (this.ids != null) {
//            stringBuilder.append("IDs: ");
//            for (int i = 0 ; i < this.ids.size(); i++) {
//                stringBuilder.append(this.ids.get(i));
//                stringBuilder.append("\t");
//            }
//        }
//        if (this.paths != null) {
//            stringBuilder.append("Paths: ");
//            for (int i = 0 ; i < this.paths.size(); i++) {
//                stringBuilder.append(this.paths.get(i));
//                stringBuilder.append("\t");
//            }
//        }
//        if (this.thingToImports != null) {
//            stringBuilder.append("Things We Imported: ");
//            for (int i = 0 ; i < this.thingToImports.size(); i++) {
//                for (int j = 0 ; j < this.thingToImports.get(i).ids.size(); j++) {
//                    stringBuilder.append(this.thingToImports.get(i).ids.get(j));
//                    stringBuilder.append("\t");
//                }
//                stringBuilder.append("\n");
//            }
//            stringBuilder.append("\n");
//        }
//
//        return stringBuilder.toString();
//    }

    public void addThingToImport(ThingToImport thingToImport) {
        this.thingToImports.add(thingToImport);
    }

    public void addPaths(String path) {
        this.paths.add(path);
    }

    public void addId(String id) {
        this.ids.add(id);
    }
    public void setIds(ArrayList<String> ids) {
        this.ids = ids;
    }

    public void setPaths(ArrayList<String> paths) {
        this.paths = paths;
    }

    public void setThingToImports(ArrayList<ThingToImport> thingToImports) {
        this.thingToImports = thingToImports;
    }

    public ArrayList<String> getIds() {
        return ids;
    }

    public ArrayList<String> getPaths() {
        return paths;
    }

    public ArrayList<ThingToImport> getThingToImports() {
        return thingToImports;
    }
}
