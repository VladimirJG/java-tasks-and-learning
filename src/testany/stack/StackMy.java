package testany.stack;

public class StackMy<T> {
    private final int INITIAL_KNOCK_SIZE = 8;

    private Object elements[];
    StackMy() {
        elements=new Object[INITIAL_KNOCK_SIZE];
    }

    public int getINITIAL_KNOCK_SIZE() {
        return INITIAL_KNOCK_SIZE;
    }



}
