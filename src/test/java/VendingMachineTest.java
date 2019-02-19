import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

public class VendingMachineTest {
    //am facut constructor fara parametri in clasa vending machine, ca sa initializam un vending machine fara sa avem ca parametru
    //fisierul de proprietati, deoarece ar citi fisierul sursa, care daca are sute de produse, e dificil de testat
    VendingMachine vendingMachine = new VendingMachine();
    Map<Product, Integer>productStock = new LinkedHashMap<>();
    Map<Coin, Integer>coinStock = new LinkedHashMap<>();

    @Test
    public void displayMenuTest() {
        Map<Product, Integer> testStock = new LinkedHashMap<>();
        Product p1 = new Product("cafea", 3, 100);
        Product p2 = new Product("Ceai", 2, 100);
        testStock.put(p1, 10);
        p1.setCod(1);
        testStock.put(p2, 10);
        p2.setCod(2);
        String expectedMenu = "";
        expectedMenu = expectedMenu.concat("This is a COFFEE vending machine!");
        expectedMenu = expectedMenu.concat("\n");
        expectedMenu =  expectedMenu.concat("Cod\t Produs\t Pret\t Gramaj");
        expectedMenu = expectedMenu.concat("\n");
        expectedMenu = expectedMenu.concat("1"+"\t"+"cafea"+"\t"+"3"+"\t\t"+"100");
        expectedMenu = expectedMenu.concat("\n");
        expectedMenu = expectedMenu.concat("2"+"\t"+"Ceai"+"\t"+"2"+"\t\t"+"100");
        expectedMenu = expectedMenu.concat("\n");
        String generatedMenu = vendingMachine.displayMenu(testStock, VMType.COFFEE);
            vendingMachine.displayMenu(testStock, VMType.COFFEE);
            Assert.assertEquals(expectedMenu, generatedMenu);
        }

    @Test
    public void displayCoinStockTest(){
        Map<Coin, Integer> testCoinStock = new LinkedHashMap<>();
        Coin c1 = new Coin(1, 10);
        Coin c2 = new Coin (2, 5);
        Coin c3 = new Coin(3, 1);
        testCoinStock.put(c1, 10);
        testCoinStock.put(c2, 10);
        testCoinStock.put(c3, 10);
//        String myCoinStock ="";
//        myCoinStock = myCoinStock.concat("Cod"+"\t "+"Valoare"+"\t"+ "Stoc");
//        myCoinStock = myCoinStock.concat("\n");
//        myCoinStock = myCoinStock.concat("1"+"\t\t"+"10"+ "\t\t"+"10");
//        myCoinStock = myCoinStock.concat("\n");
//        myCoinStock = myCoinStock.concat("2"+"\t\t"+"5"+ "\t\t"+"10");
//        myCoinStock = myCoinStock.concat("\n");
//        myCoinStock = myCoinStock.concat("3"+"\t\t"+"1"+ "\t\t"+"10");
//        myCoinStock = myCoinStock.concat("\n");
        StringBuilder builder = new StringBuilder();
        builder.append("Cod"+"\t "+"Valoare"+"\t"+ "Stoc");
        builder.append("\n");
        builder.append("1"+"\t\t"+"10"+ "\t\t"+"10");
        builder.append("\n");
        builder.append("2"+"\t\t"+"5"+ "\t\t"+"10");
        builder.append("\n");
        builder.append("3"+"\t\t"+"1"+ "\t\t"+"10");
        builder.append("\n");
        String myCoinStock = builder.toString();
        vendingMachine.displayCoinsStock(testCoinStock);
        Assert.assertEquals(myCoinStock, vendingMachine.displayCoinsStock(testCoinStock));

    }

////testez ca atunci cand trec prin metoda deliver product, stocul de produse scade cu 1. eu stiu ca am 10 produse de fiecare.
//    //prin urmare ma astept ca atunci cand se livreaza un produs, sa-mi ramana 9
////    @Test
////    public void deliverProductTest(){
////        Product product = new Product("cafea", 3, 100);
////        Map<Product, Integer> testStock = new LinkedHashMap<>();
////        testStock.put(product, 10);
////        vendingMachine.deliverProduct(product);
////        Assert.assertEquals(9, (long) testStock.get(product));}
//
//    @Test
//    public void deliverProductTest(){
//    VendingMachine vendingMachine1 = new VendingMachine();
//        Map<Product, Integer> testStock = new LinkedHashMap<>();
//        Product p1 = new Product("cafea", 3, 100);
//        testStock.put(p1,10);
//            vendingMachine1.deliverProduct(p1, testStock);
//                Assert.assertEquals(9, (long) testStock.get(p1));
//    }
//
////testez daca numarul monedelor creste. intai testez pentru monedele de 5 si 10. stiu ca am produse cu preturi mai mici de 5 lei
//    //prin
//    @Test
//    public void insertTenCoinsTest(){
//        Map<Coin, Integer> testCoinStock = new LinkedHashMap<>();
//        Coin c1 = new Coin(1, 10);
//        testCoinStock.put(c1, 10);
////Am putea sa facem mock pe scanner, ca sa nu depindem de introducem de introducerea monedelor din exterior
//            vendingMachine.insertCoins(3, testCoinStock);
//
//                Assert.assertEquals(4, (long)testCoinStock.get(c1));
//
//            }
//
////    @Test
////    public void insertOneCoinsTest(){
////        for(Coin coin : coinStock.keySet()) {
////            vendingMachine.insertCoins(3,);
////            if(coin.getValue()==1){
////                Assert.assertEquals(6, (long)coinStock.get(coin));
////            }
////
////        }
////    }
////
////    @Test
////    public void insertWrongCoinsTest(){
////        for(Coin coin : coinStock.keySet()) {
////            vendingMachine.insertCoins(3);
////            if(coin.getValue()!=1 &&coin.getValue()!=5 &&coin.getValue()!=10 ){
////                Assert.assertTrue("Optiunea introdusa nu este valida.", true);
////            }
////
////        }
////    }
//
//    @Test
//    public void payRestForTen(){
//        for (Coin coin : coinStock.keySet()){
//            vendingMachine.payRest(7);
//            if(coin.getValue()==5){
//                Assert.assertEquals(2,(long)coinStock.get(coin));
//            }
//            if(coin.getValue()==1){Assert.assertEquals(1,(long)coinStock.get(coin));}
//        }
//    }
}

