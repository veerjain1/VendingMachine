import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[] products = {"Candy", "Soup Can", "Soda", "Popcorn", "Tesla"};
    int[] prices = {50, 75, 100,80, 100000000};
     int[] quantity = {5, 15, 10, 0, 20};

     int userMoney = 150;

    int selection =0;
    int pay =0;

    System.out.println("\nWelcome to Veer's Vending Machine! Here is what we offer: \n");
    for (int i = 0; i < products.length; i++) {
      System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i] / 100.0);
    }
    System.out.println();

    Scanner admin = new Scanner(System.in);  // Create a Scanner object
    System.out.println("\nAre you an admin trying to access the system? If so, enter the code below. If not, just click enter to order.\n");
    String adminCodeAttempt = admin.nextLine();
    
    String adminCode =("VEER_LOVES_CS");

    if(adminCode.equals(adminCodeAttempt)){
      System.out.println("\nACCESS GRANTED\n");

      System.out.println("\nPlease choose from the following options: \n");

       Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("1. Edit inventory");
    System.out.println("2. Change User's Money");
      System.out.println("3. Get free food\n");
    int adminReq = scanner.nextInt();

      if(adminReq == 1){
         Scanner scanner1 = new Scanner(System.in);
        System.out.println("\nWhat product's inventory would you like to edit? \n1. Candy \n2. Soup Can \n3. Soda\n");
         int inventoryChange = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\nRight now, there are "+quantity[inventoryChange-1]+" "+products[inventoryChange-1]+" in inventory. What would you like to change it to?\n");
         int change = scanner2.nextInt();
        quantity[inventoryChange] = change;

      }
      if(adminReq == 2){
         Scanner scanner3 = new Scanner(System.in);
        System.out.println("\nRight now, the user has "+userMoney+" cents. What would you like to change it to? \n");
         int moneyChange = scanner3.nextInt();
        userMoney = moneyChange;
      }

      if(adminReq == 3){
         Scanner scanner4 = new Scanner(System.in);
        System.out.println("\nWhat would you like from the above offerings?\n");
         int adminHungry = scanner4.nextInt();
        quantity[adminHungry-1] = quantity[adminHungry-1]-1;

        System.out.println("\nCongrats! You just bought "+products[adminHungry-1]+" from Veer's Vending Machine! You have "+userMoney+" cents left. Here is your order... \n");


if(products[adminHungry-1] == "Candy"){
      System.out.println("        ."
+"\n      ,i \""
+"\n    ' 8b \""
+"\n  ,;o  `8b \""
+"\n ;  Y8. d8  \""
+"\n-+._ 8: d8. i:"
+"\n    `:8 `8i `8"
+"\n     `._Y8  8:  ___"
+"\n         `'---Yjdp  \"8m._"
+"\n              ,\"' _,o9   `m._"
+"\n              | o8P\"   _.8d8P`-._"
+"\n              :8'   _oodP\"   ,dP'`-._"
+"\n               `: dd8P'   ,odP'  do8'`."
 +"\n                `-'   ,o8P'  ,o8P' ,8P`."
+"\n                   `._dP'   ddP'  ,8P' ,.."
+"\n                      \"`._ PP'  ,8P' _d8'L..__"
 +"\n                         `\"-._88'  .PP,'7 ,8.`-.._"
+"\n                               ``'\"--\"'  | d8' :8i `i."
+"\n                                         l d8  d8  dP/"
+"\n                                           `' J8' `P'"
+"\n                                               ,8F  87"
+"\n                                                `.88  ,'"
+"\n                                                  `.,-' ");
    }
else if(products[adminHungry-1] == "Soup Can"){
System.out.println("[_______________________________]"
          +"\n|===============================|"
          +"\n|   __                          |"
          +"\n|._/_.' _, ,__  ,_ /_ _  / /'   |"
          +"\n| / _  / / /// / // /(-'/ / /|  |"
          +"\n| %__)(_(_//(_/_/(_/(__(_(_/_/_ |"
          +"\n|            /                  |"
          +"\n|                               |"
          +"\n|       C O N D E N S E D       |"
          +"\n|                               |"
          +"\n|            .-''|'-.           |"
          +"\n|           /:`:..':%           |"
          +"\n|==========|.:::::..:|==========|"
          +"\n|           *::::::./           |"
          +"\n|            `-:::-'            |"
          +"\n|     ___                       |"
          +"\n|      |  _ ,_ _  _ -|- _       |"
          +"\n|      | (_)| | |(_| |_(_)      |"
          +"\n|                               |"
          +"\n|V( )V( )V(  S O U P  )V( )V( )V|"
          +"\n|----------           ----------|"
          +"\n'==============================='");
      }

else if(products[adminHungry-1] == "Soda"){
  System.out.println("             _      "                          
            +"\n           .!.!.   "                          
            +"\n            ! !    "                               
            +"\n            ; :     "                           
            +"\n           ;   :     "                           
            +"\n          ;_____:     "                            
            +"\n          ! Coca!      "                           
            +"\n          ! COLA!       "                          
            +"\n          : ____; "                                
            +"\n          .'   '.  "                           
            +"\n          :     :   "                          
            +"\n          '''''''");
}
        
       
        
      }
       System.out.println("Your admin access has now been closed. You are now being redirected to the user's perspective of the vending machine...");
      
    }

    boolean isReady = false;
    while(isReady == false){
    Scanner order = new Scanner(System.in);  // Create a Scanner object
    System.out.println("\n\nWhat would you like to order? (YOU HAVE "+userMoney+" CENTS.)\n");
    selection = order.nextInt();
    if (selection < 1 || selection > products.length) {
        System.out.println("\nInvalid selection. Please try again.\n");
      continue;
    }
      else{
        isReady = true;
      }
     
     if (quantity[selection - 1] <= 0) {
        System.out.println("\nSorry, that product is sold out. Please make another selection.\n");
        continue;
      }
      else{
        isReady = true;
      }
  
      
       Scanner order1 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("\nHow many cents would you like to insert into the vending machine?\n");
     pay = order1.nextInt();   

    if(prices[selection-1]>pay){
      System.out.println("\nSorry, the amount you paid was insufficient, here is your change: "+pay+"\n");
      continue;
    }
      else{
        isReady = true;
      }
      if(pay>userMoney){
      System.out.println("\nSorry, you cannot afford paying that much money, here is your change: "+pay+"\n");
      continue;
    }
      else{
        isReady = true;
      }
    if(quantity[selection-1]==0){
       System.out.println("\nSorry, the amount you paid was insufficient, here is your change: "+pay+"\n");
      continue;
    }
      else{
        isReady = true;
      }
      
       
    }

    if(isReady = true){
    userMoney = userMoney-pay;
    quantity[selection-1] = quantity[selection-1]-1;
    System.out.println("\nCongrats! You just bought "+products[selection-1]+" from Veer's Vending Machine! You have "+userMoney+" cents left. Here is your order... \n");

if(products[selection-1] == "Candy"){
      System.out.println("        ."
+"\n      ,i \""
+"\n    ' 8b \""
+"\n  ,;o  `8b \""
+"\n ;  Y8. d8  \""
+"\n-+._ 8: d8. i:"
+"\n    `:8 `8i `8"
+"\n     `._Y8  8:  ___"
+"\n         `'---Yjdp  \"8m._"
+"\n              ,\"' _,o9   `m._"
+"\n              | o8P\"   _.8d8P`-._"
+"\n              :8'   _oodP\"   ,dP'`-._"
+"\n               `: dd8P'   ,odP'  do8'`."
 +"\n                `-'   ,o8P'  ,o8P' ,8P`."
+"\n                   `._dP'   ddP'  ,8P' ,.."
+"\n                      \"`._ PP'  ,8P' _d8'L..__"
 +"\n                         `\"-._88'  .PP,'7 ,8.`-.._"
+"\n                               ``'\"--\"'  | d8' :8i `i."
+"\n                                         l d8  d8  dP/"
+"\n                                           `' J8' `P'"
+"\n                                               ,8F  87"
+"\n                                                `.88  ,'"
+"\n                                                  `.,-' ");
    }
else if(products[selection-1] == "Soup Can"){
System.out.println("[_______________________________]"
          +"\n|===============================|"
          +"\n|   __                          |"
          +"\n|._/_.' _, ,__  ,_ /_ _  / /'   |"
          +"\n| / _  / / /// / // /(-'/ / /|  |"
          +"\n| %__)(_(_//(_/_/(_/(__(_(_/_/_ |"
          +"\n|            /                  |"
          +"\n|                               |"
          +"\n|       C O N D E N S E D       |"
          +"\n|                               |"
          +"\n|            .-''|'-.           |"
          +"\n|           /:`:..':%           |"
          +"\n|==========|.:::::..:|==========|"
          +"\n|           *::::::./           |"
          +"\n|            `-:::-'            |"
          +"\n|     ___                       |"
          +"\n|      |  _ ,_ _  _ -|- _       |"
          +"\n|      | (_)| | |(_| |_(_)      |"
          +"\n|                               |"
          +"\n|V( )V( )V(  S O U P  )V( )V( )V|"
          +"\n|----------           ----------|"
          +"\n'==============================='");
      }

else if(products[selection-1] == "Soda"){
  System.out.println("             _      "                          
            +"\n           .!.!.   "                          
            +"\n            ! !    "                               
            +"\n            ; :     "                           
            +"\n           ;   :     "                           
            +"\n          ;_____:     "                            
            +"\n          ! Coca!      "                           
            +"\n          ! COLA!       "                          
            +"\n          : ____; "                                
            +"\n          .'   '.  "                           
            +"\n          :     :   "                          
            +"\n          '''''''");
}
  }
}
}