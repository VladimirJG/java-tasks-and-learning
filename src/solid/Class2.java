package solid;

public class Class2 implements FatherInterface{

    @Override
    public String returnString(Object object) {

        return object + "Class2";
    }
}
