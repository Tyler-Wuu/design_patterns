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

    public static OutfitCreator getInstance() {
        return outfitCreator;
    }

    public String getOutfit(Season season) {
        while (true) {
            ClothingPart clothingPartChoice = null;
            switch (this.rand.nextInt(2)) {
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

            int clothChoice = this.rand.nextInt(clothing.get(clothingPartChoice).size());
            if (clothing.get(clothingPartChoice).get(clothChoice).hasSeason(season)) {
                return clothing.get(clothingPartChoice).get(clothChoice).toString();
            }
        }
    }
    
}
