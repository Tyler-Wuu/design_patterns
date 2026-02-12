package singleton;

import java.util.ArrayList;

/**
 * @author Tyler Wu
 * ClothingItem class that represent a cloth item
 * contain the name, color, and list of season that cloth have
 */
public class ClothingItem {

    private String name;
    private String color;
    private ArrayList<Season> season;

    /**
     * Constrctor of the ClothingItem
     * Please note seasons need to be add from the addSeason() method
     * @param newName the name of the cloth
     * @param newColor the color of the cloth
     */
    public ClothingItem(String newName, String newColor) {
        this.name = newName;
        this.color = newColor;
        this.season = new ArrayList<Season>();
    }

    /**
     * @param season the season you want to check if it exist in the list
     * @return true if this cloth contains the parm season in the season list
     */
    public boolean hasSeason(Season season) {
        return this.season.contains(season);
    }

    /**
     * add a new season in the list, can exist mutiple same season
     * @param newSeason season to add in the list
     */
    public void addSeason(Season newSeason) {
        this.season.add(newSeason);
    }

    /**
     * return in the following format:
     * Season: [list of season] Cloth: "cloth name" Color: "cloth color"
     */
    @Override
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
