package src.HtmlAst;

import java.util.ArrayList;

public class Html {
    ArrayList<Tags> tags;
    public Html() {
        this.tags = new ArrayList<>();
    }
    public void addChild(Tags tags) {
        this.tags.add(tags);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Tags tag : this.tags) {
            stringBuilder.append(tag);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setTags(ArrayList<Tags> tags) {
        this.tags = tags;
    }

    public ArrayList<Tags> getTags() {
        return tags;
    }
}
