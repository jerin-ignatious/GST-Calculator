import java.util.*;
/*
This class defines the GST rate for slab1 commodities and calulates
the final price of the commodity.
*/
class GST1{
    static int unit;
    static double initialUnitPrice;
    static double slab1GST=0.00; //GST rate for slab1
    GST1(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public static double calculateSlab1GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab1GST));
    }
}
/*
This class defines the GST rate for slab2 commodities and calulates
the final price of the commodity.
*/
class GST2{
    static int unit;
    static double initialUnitPrice;
    static double slab2GST=0.05; //GST rate for slab2
    GST2(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public static double calculateSlab2GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab2GST));
    }
}
/*
This class defines the GST rate for slab3 commodities and calulates
the final price of the commodity.
*/
class GST3{
    static int unit;
    static double initialUnitPrice;
    static double slab3GST=0.18; //GST rate for slab3
    GST3(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public static double calculateSlab3GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab3GST));
    }
}
/*
This class defines the GST rate for slab4 commodities and calulates
the final price of the commodity.
*/
class GST4{
    static int unit;
    static double initialUnitPrice;
    static double slab4GST=0.28; //GST rate for slab4
    GST4(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public static double calculateSlab4GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab4GST));
    }
}
/*
Main class 
*/
public class commodityPrice{
     /*
    All the commodities have been categorised into 4 slabs 
    according to the GST class they fall into
    */
    static String[] slab1CommodityList={"Rice","Wheat","Dal"};        // 0% GST
    static String[] slab2CommodityList={"Table","Sofa","Chair"};      // 5% GST
    static String[] slab3CommodityList={"Mobile","TV","Tablet"};      //18% GST
    static String[] slab4CommodityList={"Cream","Perfume","Lotion"};  //28% GST
    /*
    Function to decide slab
    */
    public static double decideSlab(String[] splitInput){
        double price=0.0;
        if(Arrays.asList(slab1CommodityList).contains(splitInput[1])){
            GST1 product=new GST1(splitInput);
            price=product.calculateSlab1GST();
        }
        else if(Arrays.asList(slab2CommodityList).contains(splitInput[1])){
            GST2 product=new GST2(splitInput);
            price=product.calculateSlab2GST();
        }
        else if(Arrays.asList(slab3CommodityList).contains(splitInput[1])){
            GST3 product=new GST3(splitInput);
            price=product.calculateSlab3GST();
        }
        else if(Arrays.asList(slab4CommodityList).contains(splitInput[1])){
            GST4 product=new GST4(splitInput);
            price=product.calculateSlab4GST();
        }
        else{
            return -1.0;
        }
        return price;
    }
    /*
    Main function
    */
    public static void main(String []args){
        double finalPrice=0.0;
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] splitInput=input.split(" ");
        finalPrice=decideSlab(splitInput);
        /*
        Case where current product is not available in any slab
        */
        if(finalPrice==-1){
            System.out.println("Enter valid commodity");
        }
        /*
        Case where entered price is negative
        */
        else if(finalPrice<0){
            System.out.println("Entered price is negative");
        }
        /*
        Valid input
        */
        else{
            System.out.println(finalPrice); //Displaying final price of commodity
        }
    }
}