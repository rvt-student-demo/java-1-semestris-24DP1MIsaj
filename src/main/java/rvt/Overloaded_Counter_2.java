package rvt;

public class Overloaded_Counter_2 {
    private int value;

    public Overloaded_Counter_2(int startValue) {
        this.value = startValue;
    }

    public Overloaded_Counter_2() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

    public class MainProgramm {
        public static void main(String[] args) {
            Overloaded_Counter_2 counter = new Overloaded_Counter_2();

            counter.increase();
            counter.increase(5);
            counter.decrease(2);
            counter.decrease(-3);

            System.out.println(counter.value());
        }
    }
}
