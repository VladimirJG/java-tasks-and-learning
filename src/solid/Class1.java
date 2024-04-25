package solid;

public class Class1 implements FatherInterface {
    @Override
    public String returnString(Object object) {
        return object + "Class1";
    }
}
