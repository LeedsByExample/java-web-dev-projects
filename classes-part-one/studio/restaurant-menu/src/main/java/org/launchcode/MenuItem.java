package org.launchcode;

public class MenuItem {
    //fields
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date() dateUpdated;

    //MenuItem menuItemOne = new MenuItem("chicken", 80.00, "terrible", "main course ig", false, new Date()); //this IS calling my constructor and making a new MenuItem object with provided args
    //constructors
    //add a dateUpdated param if and when you figure out how to use it....
    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        //this.dateUpdated = dateUpdated;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    //unsure if these two written correctly - naming conventions??
     public boolean getIsNew() {
         return isNew;
     }

//     public Date getDateUpdated() {
//         return dateUpdated;
//     }

    //setters
    public void setName(String aName) {
        name = aName;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    //unsure if these two written correctly
     public void setIsNew(boolean isNew) {
         this.isNew = isNew;
     }

    // public void setLastUpdated(Date lastUpdated) {
    //     this.lastUpdated = lastUpdated;
    // }
}

//figure out how to use the Date() class because this ain't workin
/* project details
    1. the menu has several menu items
    2. each menu item has a price, description, and category (app, main, or dessert)
    3. it should be possible to display if a menu item is new
    4. the app should know when the menu was last updated
 */

/* Instance Methods To Include:
    1. a way to add and remove menu items from the menu
    2. a way to tell if the menu item is new
    3. a way to tell when the menu was last updated
    4. a way to print out both a single menu item or the entire menu
    5. a way to determine whether two menu items are equal
 */

//also DOWNLOAD AUTOGRADER FOR ASSIGNMENT ONE

//okay why bother using built-in methods like equals or toString if their default functionality is shit and we have to override them with our own methods anyway???

