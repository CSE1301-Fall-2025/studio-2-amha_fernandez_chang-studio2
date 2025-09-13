import java.util.*;

public class Ruin {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("What is your start amount?");
        int startAmount = n1.nextInt();
        System.out.println("What is the probability of win?");
        double winChance = n1.nextDouble();
        System.out.println("What is your limit of win??");
        int winLimit = n1.nextInt();
        System.out.println("What is the total simulations you want to play?");
        double totalSimulations = n1.nextDouble();
        double s =totalSimulations;
        double ruinDay = 0;
        int sucDay = 0;

        for(int i = 0; i < totalSimulations; i ++){
            int money = startAmount;
            int plays = 0;

        while (winLimit > money && money > 0)
        {
            double rnd = Math.random();
            if(rnd > winChance)
            {
                money--;
                //System.out.println("lose");
            }
            else if (rnd <= winChance)
            {
                money++;
                //System.out.println("win");        
            }

            plays++;

        }
        if(money != 0)
        {sucDay ++;
        System.out.println("simulation "+ i +": "+ plays + " WIN");
        }
        else
        {ruinDay ++;
        System.out.println("simulation "+ i +": "+ plays + " LOSE");}
        
     }

         System.out.println("losses: "+ ruinDay);
         System.out.println("simulations: "+ totalSimulations);
         double rate = ruinDay / s;

     double expruin;
        if (winChance == 0.5) {
        expruin = 1.0 - (double) startAmount / winLimit;
        } else {
        expruin = (Math.pow((1 - winChance) / winChance, startAmount) -
            Math.pow((1 - winChance) / winChance, winLimit)) /
           (1 - Math.pow((1 - winChance) / winChance, winLimit));
            }
        
            System.out.print("Ruin rate from simulation: "+ rate);
            System.out.println("Expected Ruin Rate: "+ expruin);
        

    }
}