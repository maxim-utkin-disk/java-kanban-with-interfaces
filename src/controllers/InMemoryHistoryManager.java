package controllers;

import model.Epic;
import model.Subtask;
import model.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemoryHistoryManager implements HistoryManager{

    private final int MAX_HISTORY_ARRAY_SIZE = 10;
    private final ArrayList<Task> history;

    public InMemoryHistoryManager() {
        history = new ArrayList<>();
    }


    @Override
    public void add(Task task){
        if (history.size() == MAX_HISTORY_ARRAY_SIZE) {
            history.remove(0);
        }
        history.add(task);
    }

    @Override
    public ArrayList<Task> getHistory(){
        return history;
    }

}
