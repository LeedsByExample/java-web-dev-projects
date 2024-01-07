package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCd = new CD("The Bee Movie", 10.00, 11011001);

        myCd.spinDisc();

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}

/*
generic behaviors:
1. both spin (interface)
2. both store data (interface?)
3. data gets written onto discs with a laser (interface????)
4. data on discs can be read with a laser (interface>???)
5. once loaded, they both report info like name, capacity, contents, and disc type (interface??!?!???)

 */