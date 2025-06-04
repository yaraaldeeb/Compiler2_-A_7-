package src.CSSAST;

public class Functioncall {
    String id, openbracket, closebracket;

    public void setId(String id){
        this.id = id;
    }

    public void setOpenbracket(String openbracket) {
        this.openbracket = openbracket;
    }
    public void setClosebracket(String closebracket) {
        this.closebracket = closebracket;
    }

    public  String getId(){
        return id;
    }

    public String getOpenbracket() {
        return openbracket;
    }

    public String getClosebracket() {
        return closebracket;
    }

    @Override
    public String toString() {
        if (id != null) {
            return id + "()";
        }
        return "";
    }


}
