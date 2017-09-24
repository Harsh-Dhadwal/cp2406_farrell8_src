package PracExercises;

abstract class Division {
    String name;
    int accountNum;

    Division(String name, int accountNum){
        this.name = name;
        this.accountNum = accountNum;
    }

    abstract void display();

}
