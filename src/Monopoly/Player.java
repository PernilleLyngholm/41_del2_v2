package Monopoly;

public class Player {

    public String name;
    public int age;
    public bankAccount account;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Player (String name){
        this.name = name;
        this.age = age;
        this.account = new Account();
    }

}

}
