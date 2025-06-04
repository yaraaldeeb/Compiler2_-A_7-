package src.HtmlAst;

import org.w3c.dom.Attr;

import java.util.ArrayList;

public class NormalTags extends Tags{
    String leftArrow1,leftArrow2, id1, id2,divide, rightArrow1,rightArrow2;
    ArrayList<Attributes> attributes = new ArrayList<>();
    ArrayList<TagBody> tagBodies = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Normal Tag:");
        stringBuilder.append("\n");
        if (this.id1 != null) {
            stringBuilder.append(this.id1);
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
        if (this.tagBodies != null) {
            for (int i = 0 ; i < this.tagBodies.size();i++) {
                if (this.tagBodies.get(i) != null) {
                    stringBuilder.append(this.tagBodies.get(i));
                    stringBuilder.append("\n");
                }
            }
        }
        if (this.id2 != null) {
            stringBuilder.append(this.id2);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void addAttribute(Attributes attribute) {
        this.attributes.add(attribute);
    }

    public void addBody(TagBody tagBody) {
        this.tagBodies.add(tagBody);
    }

    public void setLeftArrow1(String leftArrow1) {
        this.leftArrow1 = leftArrow1;
    }

    public void setLeftArrow2(String leftArrow2) {
        this.leftArrow2 = leftArrow2;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }

    public void setRightArrow1(String rightArrow1) {
        this.rightArrow1 = rightArrow1;
    }

    public void setRightArrow2(String rightArrow2) {
        this.rightArrow2 = rightArrow2;
    }

    public void setAttributes(ArrayList<Attributes> attributes) {
        this.attributes = attributes;
    }

    public void setTagBodies(ArrayList<TagBody> tagBodies) {
        this.tagBodies = tagBodies;
    }

    public String getLeftArrow1() {
        return leftArrow1;
    }

    public String getLeftArrow2() {
        return leftArrow2;
    }

    public String getId1() {
        return id1;
    }

    public String getId2() {
        return id2;
    }

    public String getDivide() {
        return divide;
    }

    public String getRightArrow1() {
        return rightArrow1;
    }

    public String getRightArrow2() {
        return rightArrow2;
    }

    public ArrayList<Attributes> getAttributes() {
        return attributes;
    }

    public ArrayList<TagBody> getTagBodies() {
        return tagBodies;
    }
}
