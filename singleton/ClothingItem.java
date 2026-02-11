package singleton;

import java.util.ArrayList;

public class ClothingItem {

    private String name;
    private String color;
    private ArrayList<Season> season;

    public ClothingItem(String newName, String newColor) {
        this.name = newName;
        this.color = newColor;
        this.season = new ArrayList<Season>();
    }

    public boolean hasSeason(Season season) {
        return this.season.contains(season);
    }

    public void addSeason(Season newSeason) {
        this.season.add(newSeason);
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Season element : season) {
            if (element == Season.FALL) {
                temp.append("Fall");
            } else if (element == Season.SPRING) {
                temp.append("Spring");
            } else if (element == Season.SUMMER) {
                temp.append("Summer");
            } else if (element == Season.WINTER) {
                temp.append("Winter");
            }
            temp.append(" ");
        }
        return "Season: " + temp.toString() + "Cloth: " + this.name + " Color: " + this.color + "\n";
    }
    
}
