package week12.stream;

import java.util.function.Consumer;

public class Condition implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println(t);
    }

}
