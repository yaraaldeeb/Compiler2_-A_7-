package src.CSSAST;

public class PseudoClass {
   String colon,id;
   public  void  setId(String id){
       this.id = id;
   }
   public void setColon(String colon){
       this.colon = colon;
   }

   public String getId(){
       return id;
   }
   public String getColon(){
       return colon;
   }
    @Override
    public String toString() {
        return "PseudoClass(" + colon + id + ")";
    }



}
