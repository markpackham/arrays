import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(){
        this.numbers = new ArrayList<Integer>();
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public void addNumbers(int number) {
        this.numbers.add(number);
    }

    public int getNumberAtIndex(int index) {
        return this.numbers.get(index);
    }
}
