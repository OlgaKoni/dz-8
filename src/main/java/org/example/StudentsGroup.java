package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentsGroup {
    private Student starosta;

  private ArrayList <Student> students = new ArrayList<>();

   private ArrayList <String> tasks = new ArrayList<>();
   private HashMap <Integer,ArrayList <String>> isDoneTask;

    public StudentsGroup(Student starosta) {
        this.isDoneTask = new HashMap<>();
        this.starosta = starosta;
    }
    public ArrayList<String> getTasks (){
        return tasks;
    };
    public ArrayList<Student> getStudents(){
        return students;
    };
    public HashMap<Integer,ArrayList <String>> getIsDoneTask(){
        return isDoneTask;
    };
    public Student getStarosta (){
        return starosta;
    };

    public void setStarosta (Student student){
        student.setStarosta();
    }
    public void addStudent(Student student){
        students.add(student);

    };
    public void removeStudent(Student student){
        students.remove(student);
    };
    public void addTask(String task){
        tasks.add (task);
    };
    public void markTaskDone(Student student, String task){
        isDoneTask.put(student.getId(), tasks);
    }




}
