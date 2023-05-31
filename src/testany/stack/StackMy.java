package testany.stack;

import java.util.ArrayList;
import java.util.List;

public class StackMy<T> {
    private final int INITIAL_KNOCK_SIZE = 8;

    public StackMy() {
    }

    public int getINITIAL_KNOCK_SIZE() {
        return INITIAL_KNOCK_SIZE;
    }

    public List<T> create() {
        return new ArrayList<T>(INITIAL_KNOCK_SIZE);
    }
}
