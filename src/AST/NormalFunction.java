package src.AST;

import java.util.ArrayList;

public class NormalFunction extends Functions{
    String id;
    Parameters parameters = new Parameters();
    ArrayList<Body> bodies = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Function: ");
        stringBuilder.append(this.id);
        stringBuilder.append("\t");
        if (this.parameters != null) {
            if (this.parameters.ids != null) {
                for (int i = 0 ; i < this.parameters.ids.size(); i++) {
                    stringBuilder.append(this.parameters.ids.get(i));
                    stringBuilder.append("\t");
                }
            }
            if (this.parameters.properties != null) {
                for (int i = 0 ; i < this.parameters.properties.size(); i++) {
                    if (this.parameters.properties.get(i).ids != null) {
                        for (int j = 0; j < this.parameters.properties.get(i).ids.size(); j++) {
                            stringBuilder.append(this.parameters.properties.get(i).ids.get(j));
                            stringBuilder.append("\t");
                        }
                        stringBuilder.append("\n");
                    }
                    if (this.parameters.properties.get(i).dataType != null) {
                        if (this.parameters.properties.get(i).dataType.data != null) {
                            stringBuilder.append(this.parameters.properties.get(i).dataType.data);
                            stringBuilder.append("\n");
                        }
                    }
                    if (this.parameters.properties.get(i).value != null) {
                        if (this.parameters.properties.get(i).value.val != null) {
                            stringBuilder.append(this.parameters.properties.get(i).value.val);
                            stringBuilder.append("\n");
                        }
                    }
                    if (this.parameters.properties.get(i).arrayOrObject != null) {
                        if (this.parameters.properties.get(i).arrayOrObject.values != null) {
                            for (int j = 0 ; j < this.parameters.properties.get(i).arrayOrObject.values.size(); j++) {
                                stringBuilder.append(this.parameters.properties.get(i).arrayOrObject.values.get(i).val);
                                stringBuilder.append("\t");
                            }
                            stringBuilder.append("\n");
                        }
                    }
                }
            }

            if (this.parameters.arrayOrObjects != null) {
                for (int i = 0 ; i < this.parameters.arrayOrObjects.size(); i++) {
                    if (this.parameters.arrayOrObjects.get(i).values != null) {
                        for (int j = 0 ; j < this.parameters.arrayOrObjects.get(i).values.size(); j++) {
                            stringBuilder.append(this.parameters.arrayOrObjects.get(i).values.get(j).val);
                            stringBuilder.append("\t");
                        }
                        stringBuilder.append("\n");
                    }
                }
            }
            if (this.parameters.values != null) {
                for (int i = 0 ; i < this.parameters.values.size(); i++) {
                    stringBuilder.append(this.parameters.values.get(i).val);
                    stringBuilder.append("\t");
                }
                stringBuilder.append("\n");
            }
        }

        if (this.bodies != null) {
            for (int i = 0 ; i <this.bodies.size();i++) {
                stringBuilder.append(this.bodies.get(i));
                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public void addChild(Body body) {
        this.bodies.add(body);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public void setBodies(ArrayList<Body> bodies) {
        this.bodies = bodies;
    }

    public String getId() {
        return id;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public ArrayList<Body> getBodies() {
        return bodies;
    }
}
