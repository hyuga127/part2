package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ClassLeader implements Subject{
    private List<Observer> students = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer student : students) {
            student.update(message);
        }
    }
}
