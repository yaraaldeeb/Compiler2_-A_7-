package src.HtmlAst;

public class TagBody {
    String id;
    SelfClosingTag selfClosingTag = new SelfClosingTag();
    NormalTags normalTags = new NormalTags();
    Enterpolation enterpolation = new Enterpolation();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tag Body: ");
        stringBuilder.append("\n");
        if (this.selfClosingTag != null){
            stringBuilder.append(selfClosingTag);
            stringBuilder.append("\n");
        } else if (this.normalTags != null) {
            stringBuilder.append(this.normalTags);
            stringBuilder.append("\n");
        } else if (this.enterpolation != null) {
            stringBuilder.append(this.enterpolation);
            stringBuilder.append("\n");
        }else {
            stringBuilder.append(this.id);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public NormalTags getNormalTags() {
        return normalTags;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    public void setNormalTags(NormalTags normalTags) {
        this.normalTags = normalTags;
    }

    public void setEnterpolation(Enterpolation enterpolation) {
        this.enterpolation = enterpolation;
    }

    public String getId() {
        return id;
    }

    public Enterpolation getEnterpolation() {
        return enterpolation;
    }
}
