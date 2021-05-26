/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

import java.util.ArrayList;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Retailer {
    private String retailerName;
    private String address;
    private ArrayList<Beer> beerList;

    /**
     *Constructs retailer with retailerName, address
     * @param retailerName Name of the retailer.
For ex: Walmart, Hyvee etc…

     * @param address Address of the retailer
     */
    public Retailer(String retailerName, String address) {
        this.retailerName = retailerName;
        this.address = address;
        this.beerList=new ArrayList<Beer>();
    }

    /**
     *Returns retailerName
     * @return retailerName
     */
    public String getRetailerName() {
        return retailerName;
    }

    /**
     *Returns address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *Returns beerList
     * @return beerList
     */
    public ArrayList<Beer> getBeerList() {
        return beerList;
    }
    
    /**
     *Returns whether the beerName is available or not
     * @param beerName
     * @return whether the beerName is available or not
     */
    public boolean isAvailable(String beerName){
        boolean isAvailable=false;
        
        for(Beer beer:beerList){
        if(beer.getBeerName().equals(beerName)){
        isAvailable= true;
        }
        else{
            isAvailable= false;
    }
        }
        
        return isAvailable;
    }

    /**
     *
     * @param newBeer
     */
    public void addNewBeer(Beer newBeer){
       if(!isAvailable(newBeer.getBeerName())){
           beerList.add(newBeer);
       }
 
    }
    
    /**
     *Returns beerName
     * @param beerName
     * @return beerName
     */
    public Beer removeBeer(String beerName){
        Beer detailsOfRemovedBeer=null;
        
        for(Beer beer:beerList){       
            if(beer.getBeerName().equals(beerName)){
                 detailsOfRemovedBeer=beer;
                beerList.remove(beer);
               break;
            }
            }
        return detailsOfRemovedBeer;
    }
    
    /**
     *Returns strong beers
     * @return strong beers
     */
    public ArrayList<Beer> getStrongBeers(){
        ArrayList<Beer> strongBearList= new ArrayList<>();
        for(Beer beer:beerList){
        if(beer.getAbv()>4){
            strongBearList.add(beer);
        }
    }
        
        
      return  strongBearList;
    }
    
    /**
     *Returns light beers
     * @return light beers
     */
    public ArrayList<Beer> getLightBeers(){
          ArrayList<Beer> lightBearList= new ArrayList<>();
        for(Beer beer:beerList){
        if(beer.getAbv()<=4){
            lightBearList.add(beer);
        }
    }
        
        
      return  lightBearList;
    }
    
    /**
     *Returns index in list
     * @param beerName
     * @return Returns index in list
     */
    public int getIndexinList(String beerName){
       
        for(Beer beer:beerList){       
            if(beer.getBeerName().equals(beerName)){
               return beerList.indexOf(beer);
               
            }
            }
        return -1;
        
    }

    /**
     *Returns Retailer in string format
     * @return Retailer in string format
     */
    @Override
    public String toString() {
        String toString =retailerName + "\n" + address + "\n*****Beers List*****\n********************" ;
        for(Beer beer:beerList){
           toString+=beer.toString()+"\n--------------------";

        }
        return toString+"\n********************";
    }
    
    
}
