package models;

import java.util.ArrayList;

public class Counter {
    protected Integer value;
    private ArrayList<CounterListener> listeners;

    public Counter()
    {
        value = 0;
        listeners = new ArrayList<>();
    }

    public void addListener(CounterListener listener) {
        this.listeners.add(listener);
    }

    public void increase() {
        value++;
        triggerListener();
    }

    public void decrease() {
        value--;
        triggerListener();
    }

    public String getValue() {
        return value.toString();
    }

    private void triggerListener() {
        for(CounterListener listener : this.listeners) {
            listener.oValorMudou(value);
        }
    }
}
