package exercises.studio3saycheese;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {

//    public static <menuPrices> void main(String[] args) {
//        Menu details = new Menu("Cheese Stick", "Cheese Bread", "Cheese Pizza","Cheese Tortellini", "Cheese Cake");
//
        //    declare field private field name, description, price , category, and dateAdded(Date)

        private String name;
        private String description;
        private double price;
        private String category;
        private Date dateAdded;

        //   define constructor to take values for first 4 fields as params
        public MenuItem(double price,String name, String description) {

                this.name = name;
                this.price = price;
                this.description = description;
                this.category = "No Category";
                this.dateAdded = new Date();
        }
        public MenuItem(double price,String name, String description, String category) {

                this.name = name;
                this.price = price;
                this.description = description;
                this.category = category;
                this.dateAdded = new Date();
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
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

        public Date getDateAdded() {
                return dateAdded;
        }

        public void setDateAdded(Date dateAdded) {
                this.dateAdded = dateAdded;
        }
}
