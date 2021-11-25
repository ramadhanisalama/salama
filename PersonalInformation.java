import java.util.Scanner;
 class Exercise1{
  public static void  main(String[] args) {
    Scanner scanner = new Scanner (System.in);
      
        System.out.print("Enter your name:");
         String name = scanner.nextLine();
          System.out.println("Your name is : " + name); 

           
            System.out.print("Enter your address : ");
             String myaddress = scanner.nextLine();
              System.out.println("Your address :" + myaddress);

             
            System.out.print(" Your city : ");
           String city = scanner.nextLine();
          System.out.println("Your home city is : " + city);

        
       System.out.print(" Your state here : ");
     String state = scanner.nextLine();
   System.out.println("You are citizen from : " + state);

  
System.out.print("Enter a ZIP : " );
   int myzip = scanner.nextInt();
     System.out.println(" Your ZIP is : " + myzip);

          
           System.out.print("We recommend to get your telephone number :");
             long phoneno = scanner.nextInt();
               System.out.println(" Your phone number is : "  + phoneno);

                 
                   System.out.printf("What is your collge that you are stadying rigt now : ");
                     String mycollege = scanner.nextLine();
                       System.out.println("You are studying in : " + mycollege);
                         scanner.close();




            
    }
}