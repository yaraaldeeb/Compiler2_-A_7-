package src.AST;

import java.util.ArrayList;

public class Parameters {
    ArrayList<String> ids = new ArrayList<>();
    ArrayList<Properties> properties = new ArrayList<>();
    ArrayList<ArrayOrObject> arrayOrObjects = new ArrayList<>();
    ArrayList<Value> values = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameters: ");
        if (this.ids != null) {
            for (int i = 0 ; i < this.ids.size(); i++) {
                stringBuilder.append(this.ids.get(i));
                stringBuilder.append("\t");
            }
        }
        if (this.properties != null) {
            for (int i = 0 ; i < this.properties.size(); i++) {
                if (this.properties.get(i).ids != null) {
                    for (int j = 0; j < this.properties.get(i).ids.size(); j++) {
                        stringBuilder.append(this.properties.get(i).ids.get(j));
                        stringBuilder.append("\t");
                    }
                    stringBuilder.append("\n");
                }
                if (this.properties.get(i).dataType != null) {
                    if (this.properties.get(i).dataType.data != null) {
                        stringBuilder.append(this.properties.get(i).dataType.data);
                        stringBuilder.append("\n");
                    }
                }
                if (this.properties.get(i).value != null) {
                    if (this.properties.get(i).value.val != null) {
                        stringBuilder.append(this.properties.get(i).value.val);
                        stringBuilder.append("\n");
                    }
                }
                if (this.properties.get(i).arrayOrObject != null) {
                    if (this.properties.get(i).arrayOrObject.values != null) {
                        for (int j = 0 ; j < this.properties.get(i).arrayOrObject.values.size(); j++) {
                            stringBuilder.append(this.properties.get(i).arrayOrObject.values.get(i).val);
                            stringBuilder.append("\t");
                        }
                        stringBuilder.append("\n");
                    }
                }
            }
        }

        if (this.arrayOrObjects != null) {
            for (int i = 0 ; i < this.arrayOrObjects.size(); i++) {
                if (this.arrayOrObjects.get(i).values != null) {
                    for (int j = 0 ; j < this.arrayOrObjects.get(i).values.size(); j++) {
                        stringBuilder.append(this.arrayOrObjects.get(i).values.get(j).val);
                        stringBuilder.append("\t");
                    }
                    stringBuilder.append("\n");
                }
            }
        }
        if (this.values != null) {
            for (int i = 0 ; i < this.values.size(); i++) {
                stringBuilder.append(this.values.get(i).val);
                stringBuilder.append("\t");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void addId(String id) {
        this.ids.add(id);
    }

    public void addProperty(Properties properties) {
        this.properties.add(properties);
    }

    public void addArrOrObj(ArrayOrObject arrayOrObject) {
        this.arrayOrObjects.add(arrayOrObject);
    }

    public void addValue(Value value) {
        this.values.add(value);
    }

    public void setIds(ArrayList<String> ids) {
        this.ids = ids;
    }

    public void setProperties(ArrayList<Properties> properties) {
        this.properties = properties;
    }

    public void setArrayOrObjects(ArrayList<ArrayOrObject> arrayOrObjects) {
        this.arrayOrObjects = arrayOrObjects;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }

    public ArrayList<String> getIds() {
        return ids;
    }

    public ArrayList<Properties> getProperties() {
        return properties;
    }

    public ArrayList<ArrayOrObject> getArrayOrObjects() {
        return arrayOrObjects;
    }

    public ArrayList<Value> getValues() {
        return values;
    }
}
