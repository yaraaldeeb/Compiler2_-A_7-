package src.HtmlAst;

public class Event {
    String openBracket, id, closeBracket, assign, eventAction;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event: ");
        stringBuilder.append("\n");
        if (this.id != null) {
            stringBuilder.append(this.id);
            stringBuilder.append("\t");
        }
        if (this.assign != null) {
            stringBuilder.append(this.assign);
            stringBuilder.append("\t");
        }
        if (this.eventAction != null) {
            stringBuilder.append(this.eventAction);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCloseBracket(String closeBracket) {
        this.closeBracket = closeBracket;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    public String getOpenBracket() {
        return openBracket;
    }

    public String getId() {
        return id;
    }

    public String getCloseBracket() {
        return closeBracket;
    }

    public String getAssign() {
        return assign;
    }

    public String getEventAction() {
        return eventAction;
    }
}
