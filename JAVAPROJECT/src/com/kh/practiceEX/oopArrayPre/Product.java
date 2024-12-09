package com.kh.practiceEX.oopArrayPre;

public class Product{
    private String Name;
    private int Price;
    private String description;
    private String category;

    public Product() {
    }

    public Product(String name, int price) {
        Name = name;
        Price = price;
    }

    public String getName() {
        return Name;
    }


    public int getPrice() {
        return Price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "제품명 = " + Name + "\n가격=" + Price + "\n 제품설명 =" + description + "\n 카테고리=" + category;
    }
}
