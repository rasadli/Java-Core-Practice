package week10.property;

public class EvenProperty implements Property<Integer>  {

    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }

}
