package com.checkpoint.app.designPattern.observer;


import com.checkpoint.app.domain.Student;

public interface Observer {


    public void subscriberNotify();
    public void addSubscriber(Student student);
    public void removeSubscriber(Student student);

}
