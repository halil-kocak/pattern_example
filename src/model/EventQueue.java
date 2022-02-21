package model;

import java.util.ArrayList;

import model.queueObjects.Job;

public class EventQueue {

    private static final EventQueue instance;

    private ArrayList<Job> jobList = new ArrayList<>();

    // static block initialization for exception handling
    static {
        try {
            instance = new EventQueue();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance /n" + e.toString());
        }
    }

    public static EventQueue getInstance(){
        return instance;
    }
}
