package org.launchcode;

public abstract class BaseDisc {

    String name;
    Double capacity;
    Integer content;
    private String discType;

    public BaseDisc(String name, Double capacity, Integer content, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.content = content;
        this.discType = discType;
    }

    void spinDisc() {
        System.out.println("wheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

}
