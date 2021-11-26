package com.company.programmingToAnInterface;

interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements displayModule {
    public void display() {
        System.out.println("Display through Projector");
    }
}

public class ClientComputer {
    // this is stored as an interface, not as a concrete implementation
    // this allows to change strategy at runtime without change any implementation
    // (the client can choose to display to a Monitor or to a Projector by setting the dm)
    displayModule dm;

    public void setDisplayModule(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        ClientComputer cm = new ClientComputer();

        displayModule dm = new Monitor();
        displayModule dm1 = new Projector();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm1);
        cm.display();

    }
}
