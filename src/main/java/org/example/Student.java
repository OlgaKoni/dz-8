package org.example;

public class Student {
    private final int id;
    private final String name;
    private final String surname;
    private boolean starosta = false;


    public Student (int id,String name,String surname, boolean starosta){
        this.id = id;
        this.name = name;
        this.surname = surname;
        if (starosta) this.starosta = true;
        else this.starosta = false;
    }

    public String getName (){return name;}
    public int getId (){return id;}
    public String getSurname(){return surname;}
    public Student setStarosta () {
        this.starosta = true;
        return this;};
}
