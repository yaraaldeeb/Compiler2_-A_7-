package src.HtmlAst;

import java.util.ArrayList;

public class SelfClosingTag extends Tags{
    String leftArrow, mark, id,divide, rightArrow;
    ArrayList<Attributes> attributes = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Self Closing Tag: ");
        stringBuilder.append("\n");
        if (this.id != null) {
            stringBuilder.append(this.id);
            stringBuilder.append("\t");
        }
        if (this.attributes != null) {
            for (int i = 0 ; i < this.attributes.size();i++) {
                if (this.attributes.get(i).id != null) {
                    stringBuilder.append(this.attributes.get(i).id);
                    stringBuilder.append("\t");
                }
                if (this.attributes.get(i).hValue != null) {
                    if (this.attributes.get(i).hValue.val != null) {
                        stringBuilder.append(this.attributes.get(i).hValue.val);
                        stringBuilder.append("\n");
                    }
                } else if (this.attributes.get(i).event != null) {
                    if (this.attributes.get(i).event != null) {
                        stringBuilder.append(this.attributes.get(i).event);
                        stringBuilder.append("\n");
                    }
                }else if (this.attributes.get(i).var != null) {
                    if (this.attributes.get(i).var != null) {
                        stringBuilder.append(this.attributes.get(i).var);
                        stringBuilder.append("\n");
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public void addChild(Attributes attribute){
        this.attributes.add(attribute);
    }

    public void setLeftArrow(String leftArrow) {
        this.leftArrow = leftArrow;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }

    public void setRightArrow(String rightArrow) {
        this.rightArrow = rightArrow;
    }

    public void setAttributes(ArrayList<Attributes> attributes) {
        this.attributes = attributes;
    }

    public String getLeftArrow() {
        return leftArrow;
    }

    public String getMark() {
        return mark;
    }

    public String getId() {
        return id;
    }

    public String getDivide() {
        return divide;
    }

    public String getRightArrow() {
        return rightArrow;
    }

    public ArrayList<Attributes> getAttributes() {
        return attributes;
    }
}
