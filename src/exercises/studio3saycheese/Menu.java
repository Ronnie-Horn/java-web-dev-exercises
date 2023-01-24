package exercises.studio3saycheese;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;


    public Menu() {
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

//        public static void main(String[] args) {
//
//        }
//        private String cheeseStick;
//        private String cheeseBread;
//        private String cheesePizza;
//        private String cheeseTortellini;
//        private String cheeseCake;
//
//        public Menu(String cheeseStick, String cheeseBread, String cheesePizza, String cheeseTortellini, String cheeseCake) {
//
//                this.cheeseStick = cheeseStick;
//                this.cheeseBread = cheeseBread;
//                this.cheesePizza = cheesePizza;
//                this.cheeseTortellini = cheeseTortellini;
//                this.cheeseCake = cheeseCake;
//        }
//        public String getCheeseStick() {
//                return cheeseStick;
//        }
//
//        public String getCheeseBread() {
//                return cheeseBread;
//        }
//
//        public String getCheesePizza() {
//                return cheesePizza;
//        }
//
//        public String getCheeseTortellini() {
//                return cheeseTortellini;
//        }
//
//        public String getCheeseCake() {
//                return cheeseCake;
//        }
//
//        public void setCheeseStick(String cheeseStick) {
//                this.cheeseStick = cheeseStick;
//        }
//
//        public void setCheeseBread(String cheeseBread) {
//                this.cheeseBread = cheeseBread;
//        }
//
//        public void setCheesePizza(String cheesePizza) {
//                this.cheesePizza = cheesePizza;
//        }
//
//        public void setCheeseTortellini(String cheeseTortellini) {
//                this.cheeseTortellini = cheeseTortellini;
//        }
//
//        public void setCheeseCake(String cheeseCake) {
//                this.cheeseCake = cheeseCake;
//        }
//}
//}
