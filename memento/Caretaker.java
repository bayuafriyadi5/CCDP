// Caretaker.java
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<LaundryMemento> mementoList = new ArrayList<>();

    public void add(LaundryMemento state) {
        mementoList.add(state);
    }

    public LaundryMemento get(int index) {
        return mementoList.get(index);
    }
}
