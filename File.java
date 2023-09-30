import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args)
    {
       
  
   Scanner Jhon = new Scanner(System.in);
   double pG,mG,fG,gG,aG,eG, ave;
  
 
 
   System.out.print("Enter prelim Grade in English: 85  ");
   pG = Andrian.nextDouble();
    System.out.print("Enter prelim Grade in Math): 85 ");
   mG = Andrian.nextDouble();
     System.out.print("Enter prelim Grade in Science: 85 ");
   fG = Andrian.nextDouble();
   System.out.print("Enter prelim Grade in History: 84 ");
   gG = Andrian.nextDouble();
   System.out.print("Enter prelim Grade in Filipino: 85 ");
   aG = .nextDouble();
   System.out.print("Enter prelim Grade in Religion: 81 ");
   eG = Jhon.nextDouble();
   
   ave = pG + mG+ fG + gG + aG + eG *6/100;
       
   System.out.println("Average: 91 " + ave);
   
        if (ave>85) 
            System.out.println("Pass " );
        else if (ave<85)
        System.out.println(" Failed ");
        
   
    }
}


