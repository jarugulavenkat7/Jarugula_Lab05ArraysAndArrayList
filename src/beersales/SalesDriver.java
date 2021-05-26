/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import beersales.Beer;
import beersales.Retailer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Venkat Sai Jarugula
 */
public class SalesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //1.Declare and initialize a Scanner object to read from the file "inputFile2.txt"
        Scanner scanner = new Scanner(new File("inputFile1.txt"));

        //2.Declare and initialize a PrintWriter object to write output to the file "outputFileText2.txt"
        PrintWriter printWriter = new PrintWriter(new File(
	"outputFileText1.txt"));

        //3.create an ArrayList of Retailer objects with name "retailers"
        ArrayList<Retailer> retailers=new ArrayList<>();
        //4.Read Data
        while(scanner.hasNext("Retailer")){ 
            //5.Read Retailer name and address
            scanner.nextLine();
                String retailerName=scanner.nextLine();
                String address=scanner.nextLine();
            //6.Declare and initialize an object for retailer using above read values
            Retailer retailer =new Retailer(retailerName, address);
            //7.Read all beers available for the retailer. Loop starts here
            do{ 
                // 8.Read all details of a beer
                 String beerName=scanner.nextLine();
                 String beerType=scanner.nextLine();
                String beerStyle=scanner.next();
                double abv=scanner.nextDouble();
                
                scanner.nextLine();
                String availablePackagesString=scanner.nextLine();
                
                 String[] availablePackagesTokens = availablePackagesString.split(" ");
                
               int[] availablePackages= new int[availablePackagesTokens.length];
                for(int i = 0; i < availablePackagesTokens.length; i++){
                    availablePackages[i]=Integer.parseInt(availablePackagesTokens[i]);
                }
           
                // 9.Declare and initialize an object for Beer using above read values
               
                Beer beer=new Beer(beerName, beerType, beerStyle, abv, availablePackages);
                // 10.Add the declared beer object to retailer object created in the outer loop
                
             
                retailer.addNewBeer(beer);
                
            }while(!scanner.hasNext("Retailer") && scanner.hasNext()); //End the loop if reading all the Beer objects for a retailer is completed
            // 11.Add the retailer object created in this loop to variable retailers
            retailers.add(retailer);
        }

        /*!!!For bellow statements, use loops to retrive required Retailer object from arraylist "retailers"
             Do not hardcode indexes to retrive data from variable retailers*/

        // 12.Print "******Walmart Inventory for Beer's*****"
        
        // 13.Invoke toString() on retailer "Walmart" and print object
        
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(Retailer retailer:retailers){
            if(retailer.getRetailerName().equals("Walmart")){
                
                System.out.println("***************************************");
        System.out.println("******Walmart Inventory for Beer's*****");
        System.out.println("***************************************");
        printWriter.println("***************************************");
        printWriter.println("******Walmart Inventory for Beer's*****");
        printWriter.println("***************************************");
                System.out.println(retailer);
                printWriter.println(retailer);
            
        // 14.Print "******Remove Wells IP from Walmart*****"
        System.out.println("***********************************");
        System.out.println("***Remove Wells IPA from Walmart****");
        System.out.println("***********************************");
        printWriter.println("***********************************");
        printWriter.println("***Remove Wells IPA from Walmart****");
        printWriter.println("***********************************");
        // 15.Remove Beer with name "Wells IP" from retailer "Walmart" in retailers and print removed beer details.
        
    Beer removedBeer=retailer.removeBeer("Wells IPA");
       System.out.println(removedBeer); 
        printWriter.println(removedBeer);
       System.out.println("--------------------");
       printWriter.println("--------------------");
       count1=retailer.getBeerList().size();
       
       
    }
if(retailer.getRetailerName().equals("Hy-Vee")){
    count2=retailer.getBeerList().size();
        // 16.Print "****List of strong beer from Hy-Vee****"
        System.out.println("***************************************");
        System.out.println("****List of strong beer from Hy-Vee****");
        System.out.println("***************************************");
        printWriter.println("***************************************");
         printWriter.println("****List of strong beer from Hy-Vee****");
         printWriter.println("***************************************");
         
        // 17.Print all strong beer available in Hy-Vee
        
            
             ArrayList<Beer> strongBeers = retailer.getStrongBeers();
                for(Beer strongBeer:strongBeers){
                    System.out.println(strongBeer.toString());
                    System.out.println("--------------------");
                    printWriter.println(strongBeer.toString());
                    printWriter.println("--------------------");
                }
        
         
        }
if(retailer.getRetailerName().equals("Sam's Club")){
    count3=retailer.getBeerList().size();
        // 18.Print "****List of light beer from Sam's Club****"
        System.out.println("******************************************");
        System.out.println("****List of light beer from Sam's Club****");
        System.out.println("******************************************");
        printWriter.println("******************************************");
        printWriter.println("****List of light beer from Sam's Club****");
        printWriter.println("******************************************");
        
        // 19.Print all light beer available in Sam's Club
        
            
            
             ArrayList<Beer> lightBeers = retailer.getLightBeers();
                for(Beer lightBeer:lightBeers){
                    System.out.println(lightBeer.toString());
                    printWriter.println(lightBeer.toString());
                    System.out.println("--------------------");
                    printWriter.println("--------------------");
                    
                }
        }


        if(retailer.getRetailerName().equals("Casey's General Store")){
                count4=retailer.getBeerList().size();
            }
        
        }    

        // 20.Print  "****Count of different beers available from each retailer****"
        System.out.println("*************************************************************");
        System.out.println("****Count of different beers available from each retailer****");
        System.out.println("*************************************************************");
        printWriter.println("*************************************************************");
        printWriter.println("****Count of different beers available from each retailer****");
         printWriter.println("*************************************************************");
         System.out.println("Walmart: "+count1+"\nHy-Vee: "+count2+"\nSam's Club: "+count3+"\nCasey's General Store: "+count4);
         printWriter.println("Walmart: "+count1+"\nHy-Vee: "+count2+"\nSam's Club: "+count3+"\nCasey's General Store: "+count4);
        // 21.Print count of different beers available from each retailer
        System.out.println("********************************************************");
        System.out.println("****All different beers available from all retailers****");
        System.out.println("********************************************************");
        printWriter.println("********************************************************");
        printWriter.println("****All different beers available from all retailers****");
        printWriter.println("********************************************************");
        
                ArrayList<String> differentBeers = new ArrayList<String>();
        for(Retailer retailer:retailers){
            ArrayList<Beer> listOfBeers = retailer.getBeerList();
            for(Beer beer: listOfBeers){
                if(!differentBeers.contains(beer.getBeerName())){
                    differentBeers.add(beer.getBeerName());
                }
                //names.add(b.getBeerName());
            }
        }
        for(String differentBeer:differentBeers){
            System.out.println(differentBeer);
            printWriter.println(differentBeer);
        }

        // 22.Print "****All different beers available from all retailers****"
        // 23.Print Names of all different beers from all retailers.
     
       // 24.Close PrintWriter object
printWriter.close();
    }
    
}
