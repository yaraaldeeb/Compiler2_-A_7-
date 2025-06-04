package src.Semantics;

import java.util.List;
import java.util.Objects;

public class FunctionSignature {
    public String name;
    public List<String> parameterTypes;

    public FunctionSignature(String name,List<String> parameterTypes){
        this.name = name;
        this.parameterTypes = parameterTypes;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (!(o instanceof FunctionSignature)) return false;
        FunctionSignature that = (FunctionSignature) o;
        return name.equals(that.name) && parameterTypes.equals(that.parameterTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parameterTypes);
    }
}
