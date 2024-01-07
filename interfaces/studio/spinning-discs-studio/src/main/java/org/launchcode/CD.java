package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String name, Double capacity, Integer content) {
        super(name, capacity, content, "CD");
    }

    @Override
    public void writeData() {
        //code body
    }

    @Override
    public void readData() {
        //code body
    }

    @Override
    public void reportData() {
        //code body
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
