package src.HtmlAst;

public class Attributes {
    String star, id , assign;
    HValue hValue = new HValue();
    Event event = new Event();
    Var var = new Var();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attributes: ");
        stringBuilder.append("\n");
        if (this.id != null) {
            stringBuilder.append(this.id);
            stringBuilder.append("\t");
        }
        if (this.hValue != null) {
            if (this.hValue.val != null) {
                stringBuilder.append(this.hValue.val);
                stringBuilder.append("\n");
            }
        } else if (this.event != null) {
            if (this.event.id != null) {
                stringBuilder.append(this.event.id);
                stringBuilder.append("\t");
            }
            if (this.event.assign != null) {
                stringBuilder.append(this.event.assign);
                stringBuilder.append("\t");
            }
            if (this.event.eventAction != null) {
                stringBuilder.append(this.event.eventAction);
                stringBuilder.append("\t");
            }
        }else if (this.var != null) {
            if (this.var.id != null) {
                stringBuilder.append(this.var.id);
                stringBuilder.append("\t");
            }
            if (this.var.assign != null) {
                stringBuilder.append(this.var.assign);
                stringBuilder.append("\t");
            }
            if (this.var.varAction != null) {
                stringBuilder.append(this.var.varAction);
                stringBuilder.append("\t");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setStar(String star) {
        this.star = star;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public void sethValue(HValue hValue) {
        this.hValue = hValue;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public String getStar() {
        return star;
    }

    public String getId() {
        return id;
    }

    public String getAssign() {
        return assign;
    }

    public HValue gethValue() {
        return hValue;
    }

    public Event getEvent() {
        return event;
    }

    public Var getVar() {
        return var;
    }
}
