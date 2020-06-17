import java.util.*;
/*
This class defines the GST rate for slab1 commodities and calulates
the final price of the commodity.
*/
class GST1{
    int unit;
    double initialUnitPrice;
    double slab1GST=0.00; //GST rate for slab1
    GST1(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public double calculateSlab1GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab1GST));
    }
}
/*
This class defines the GST rate for slab2 commodities and calulates
the final price of the commodity.
*/
class GST2{
    int unit;
    double initialUnitPrice;
    double slab2GST=0.05; //GST rate for slab2
    GST2(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public double calculateSlab2GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab2GST));
    }
}
/*
This class defines the GST rate for slab3 commodities and calulates
the final price of the commodity.
*/
class GST3{
    int unit;
    double initialUnitPrice;
    double slab3GST=0.18; //GST rate for slab3
    GST3(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public double calculateSlab3GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab3GST));
    }
}
/*
This class defines the GST rate for slab4 commodities and calulates
the final price of the commodity.
*/
class GST4{
    int unit;
    double initialUnitPrice;
    double slab4GST=0.28; //GST rate for slab4
    GST4(String[] input1){
        unit=Integer.parseInt(input1[0]);
        initialUnitPrice=Double.parseDouble(input1[2]);
    }
    public double calculateSlab4GST(){
        return unit*(initialUnitPrice+(initialUnitPrice*slab4GST));
    }
}
/*
Main class 
*/
public class commodityPrice{
    public static void main(String []args){
        double finalPrice=0.0;
        Scanner sc=new Scanner(System.in);
        /*
        All the commodities have been categorised into 4 slabs 
        according to the GST class they fall into
        */
        String[] slab1CommodityList={"Rice","Wheat","Dal"};        // 0% GST
        String[] slab2CommodityList={"Table","Sofa","Chair"};      // 5% GST
        String[] slab3CommodityList={"Mobile","TV","Tablet"};      //18% GST
        String[] slab4CommodityList={"Cream","Perfume","Lotion"};  //28% GST
        String input=sc.nextLine();
        String[] splitInput=input.split(" ");
        /*
        Deciding category of current commodity
        */
        if(Arrays.asList(slab1CommodityList).contains(splitInput[1])){
            GST1 product=new GST1(splitInput);
            finalPrice=product.calculateSlab1GST();
        }
        else if(Arrays.asList(slab2CommodityList).contains(splitInput[1])){
            GST2 product=new GST2(splitInput);
            finalPrice=product.calculateSlab2GST();
        }
        else if(Arrays.asList(slab3CommodityList).contains(splitInput[1])){
            GST3 product=new GST3(splitInput);
            finalPrice=product.calculateSlab3GST();
        }
        else if(Arrays.asList(slab4CommodityList).contains(splitInput[1])){
            GST4 product=new GST4(splitInput);
            finalPrice=product.calculateSlab4GST();
        }
        /*
        Displaying final price
        */
        System.out.println(finalPrice);
    }
}