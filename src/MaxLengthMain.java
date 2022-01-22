import java.util.*;

public class MaxLengthMain {
    public static int MaxLength (Set<String> WhatMax) {
        if(WhatMax.isEmpty()) {
            return 0;
        }
        return Collections.max(WhatMax).length();
    }

    public static void main(String[] args) {
        Set<String> MySet = new HashSet<>();


        System.out.print(MaxLength(MySet));
    }
}
