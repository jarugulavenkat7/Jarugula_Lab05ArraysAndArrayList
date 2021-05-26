/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Beer {
    private String beerName;
    private String beerType;
    private String beerStyle;
    private double abv;
    private int[] availablePackages;

    /**
     * Constructs Beer with beerName, beerType, beerStyle, abv, availablePackages
     * @param beerName Name of the beer. For ex: Heineken, Bud Light etc…
     * @param beerType Type of beer like Ales, Lagers etc…
     * @param beerStyle Style of beer like Amber, Blonde, Brown, Cream etc.,
     * @param abv Alcohol by volume in percentage of a beer. For ex: 6.8%
     * @param availablePackages The type of packaging available at the manufacturer.For ex: 6,12,28 etc.,
     */
    public Beer(String beerName, String beerType, String beerStyle, double abv, int[] availablePackages) {
        this.beerName = beerName;
        this.beerType = beerType;
        this.beerStyle = beerStyle;
        this.abv = abv;
        this.availablePackages = availablePackages;
    }

    /**
     *Returns beerName
     * @return beerName
     */
    public String getBeerName() {
        return beerName;
    }

    /**
     *Return beerType
     * @return beerType
     */
    public String getBeerType() {
        return beerType;
    }

    /**
     *Returns beerStyle
     * @return beerStyle
     */
    public String getBeerStyle() {
        return beerStyle;
    }

    /**
     *Returns abv
     * @return abv
     */
    public double getAbv() {
        return abv;
    }

    /**
     *Returns availablePackages
     * @return availablePackages
     */
    public int[] getAvailablePackages() {
        return availablePackages;
    }
    
    /**
     *Returns  boolean of lightBeer
     * @return boolean of lightBeer
     */
    public Boolean isLightBeer(){
        return abv<=4;
    }

    /**
     *Returns the Beer in String format
     * @return the Beer in String format
     */
    @Override
    public String toString() {
        String availablePackageString="";
        for(int availablePackage:availablePackages){
            availablePackageString+=String.valueOf(availablePackage);
            if(availablePackages[availablePackages.length-1]==availablePackage){
            availablePackageString+=".";
            }
            else{
                availablePackageString+=", ";
            }
        }
        return "\nBeer Name: " + beerName + "\nBeer Type: " + beerStyle+"," + " Beer Style: " +  beerType+ "\nabv: " + abv+"%" + "\nAvailable in packs of: " + availablePackageString;
    }

}
