package src.CSSAST;

import java.util.ArrayList;

public class Body {
    String colon,floatNum,number,cemmi,str;

    ArrayList<String> ids = new ArrayList<>();
    ArrayList<CssStyles> styles = new ArrayList<>();

    Functioncall functioncall = new Functioncall();

    public void addChild(String id){
     this.ids.add(id);
    }
    public void addChild2(CssStyles style){
        this.styles.add(style);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // طباعة الخاصية مثل color أو font-size
        if (!ids.isEmpty()) {
            sb.append(ids.get(0)).append(": ");
        }

        // طباعة القيمة المناسبة
        if (str != null) {
            sb.append(str);
        } else if (number != null) {
            sb.append(number);
        } else if (floatNum != null) {
            sb.append(floatNum);
        } else if (functioncall != null && functioncall.toString() != null && !functioncall.toString().isEmpty()) {
            sb.append(functioncall.toString());
        } else {
            sb.append("undefined"); // لتوضيح أين المشكلة إن لم توجد أي قيمة
        }

        sb.append(";");
        return sb.toString();
    }


    public void setStyles(ArrayList<CssStyles> styles){
        this.styles = styles;
    }
    public void  setId(String str){
        this.str = str;
    }
    public void setColon(String colon){
        this.colon = colon;
    }
    public void setStr(ArrayList<String> ids){
        this.ids = ids;
    }
    public void setFloatNum(String floatNum){
        this.floatNum = floatNum;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setCemmi(String cemmi){
        this.cemmi = cemmi;
    }
    public void setFunctioncall(Functioncall functioncall){
        this.functioncall = functioncall;
    }



    public  Functioncall getFunctioncall(){
        return functioncall;
    }
    public String getStr(){
        return str;
    }
    public String getColon(){
        return colon;
    }
    public String getFloatNum(){
        return floatNum;
    }
    public String getNumber(){
        return number;
    }
    public String getCemmi(){
        return cemmi;
    }
    public ArrayList<String> getIds(){
        return ids;
    }
    public  ArrayList<CssStyles> getFuncs(){
        return styles;
    }


}
