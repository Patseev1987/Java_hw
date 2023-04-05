package Lesson4;

import java.util.LinkedList;

public class BogdanQueue {
    //   enqueue()  - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его
//  first() - возвращает первый элемент из очереди, не удаляя.
    private final LinkedList<Integer> myList;


    public BogdanQueue() {
        myList = new LinkedList<>();
    }

    public BogdanQueue(LinkedList<Integer> list) {
        myList = new LinkedList<>(list);
    }

    public void enqueue(int last) {
        myList.addLast(last);
    }

    public int first() {
        int result = myList.getFirst();
        return result;

    }

    public int dequeue() {
        if (myList.size() < 1) {
            throw new RuntimeException("List is empty!");
        } else {
            int result = myList.removeFirst();
            return result;
        }
    }

    @Override
    public String toString() {

        int iMax = myList.size() - 1;
        if (iMax == -1) return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(myList.get(i)));
            if (i == iMax) return b.append(']').toString();
            b.append(", ");
        }
    }
}
