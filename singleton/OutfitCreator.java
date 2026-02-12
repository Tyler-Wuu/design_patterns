package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author Tyler Wu
 */
public class OutfitCreator {
    private HashMap<ClothingPart, ArrayList<ClothingItem>> clothing;
    private Random rand;
    private static OutfitCreator outfitCreator = new OutfitCreator();
    // this is from the texbook

    private OutfitCreator() {
        clothing = new HashMap<ClothingPart, ArrayList<ClothingItem>>();
        clothing.put(ClothingPart.TOP, FileReader.getTops());
        clothing.put(ClothingPart.BOTTOM, FileReader.getBottoms());
        clothing.put(ClothingPart.WHOLE, FileReader.getwholes());
        this.rand = new Random();
    }

    /**
     * static OutfitCreator method
     * please note this method is not responsible for creating the instance
     * @return the only instance of the OutfitCreator
     */
    public static OutfitCreator getInstance() {
        return outfitCreator;
    }

    /**
     * This method will return a radomly choosen cloth from the txt file in string
     * @param season the season that the cloth must contain
     * @return a randomly choosen cloth from the txt files, in the format of:
     * Season: [list of season] Cloth: "cloth name" Color: "cloth color"
     */
    public String getOutfit(Season season) {
        while (true) {  // keep looping
            ClothingPart clothingPartChoice = null;
            switch (this.rand.nextInt(2)) {  // choose a piece of cloth part(0-2)
                case 0:
                    clothingPartChoice = ClothingPart.TOP;
                    break;
                case 1:
                    clothingPartChoice = ClothingPart.BOTTOM;
                    break;
                case 2:
                    clothingPartChoice = ClothingPart.WHOLE;
                    break;
                default:
                    System.out.println("UDB when choicing clothing part");
                    break;
            }

            int clothChoiceIndex = 
            this.rand.nextInt(clothing.get(clothingPartChoice).size());
            // choose from index between 0-the size of the list
            ClothingItem clothChoice = clothing.get(clothingPartChoice).get(clothChoiceIndex);

            if (clothChoice.hasSeason(season)) {  // if this cloth fit for the season
                return clothChoice.toString();
            }
            // if the cloth did not fit the season this will keep loop
        }
    }

}
