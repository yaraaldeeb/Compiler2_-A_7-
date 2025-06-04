package src.CSSAST;

public class PseudoElement {
    String id,doubleColon;

    public  void  setId(String id){
        this.id = id;
    }
    public void setDoubleColon(String doubleColon){
        this.doubleColon = doubleColon;
    }
    public String getId(){
        return id;
    }

    public String getDoubleColon(){
        return doubleColon;
    }

    @Override
    public String toString() {
        return "PseudoElement(" + doubleColon + id + ")";
    }

}
