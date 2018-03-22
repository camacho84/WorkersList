package pl.akademiakodu.lista.model;


public class Todo {
    private String name;
    private String surname;
    private int workTime;


    public Todo(){

    }

    public Todo(String name, String surname, Integer workTime) {
        this.name = name;
        this.surname = surname;
        this.workTime = workTime;
    }

    private boolean finished;

    public boolean isFinished() {
        return finished;
    }

    public String surname(){
        return isFinished() ? "complited " : "incomplited";
    }


    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {this.workTime = workTime; }
}
