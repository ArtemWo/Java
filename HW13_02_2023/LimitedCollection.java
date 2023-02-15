package HW_Java.Java.HW13_02_2023;


import java.util.ArrayList;

public class LimitedCollection<T> {

        private int maxSize;
        private ArrayList<T> elements;

        public LimitedCollection(int maxSize) {
            this.maxSize = maxSize;
            this.elements = new ArrayList<>();
        }

        public boolean add(T element) {
            if (elements.size() < maxSize) {
                elements.add(element);
                return true;
            } else {
                return false;
            }
        }

        public T get(int index) {
            return elements.get(index);
        }

        public int size() {
            return elements.size();
        }
    }

