package itrum.collection;


import java.util.Arrays;

interface Filter {
    Object apply(Object o);
}

class FilterImpl implements Filter {

    @Override
    public Object apply(Object o) {
        return o.equals("Filter");
    }
}

public class Test1 {
    public static void main(String[] args) {
        String[] array = new String[]{"Crown", "Bridge", "Filter", "Mouse"};
        Object[] filter = filter(array, new FilterImpl());
        System.out.println(Arrays.toString(filter));
    }

    public static Object[] filter(Object[] array, FilterImpl filter) {
        Object[] result = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }
}
