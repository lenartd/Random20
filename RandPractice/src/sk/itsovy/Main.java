package sk.itsovy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        //int[] generatedNums = new int[21];
        ArrayList<Integer> generatedNums  = new ArrayList<Integer>();

        for(int i = 0; i<21; i++)
        {
            generatedNums.add(i);
        }
        Collections.shuffle(generatedNums);

        Random rand = new Random();
        boolean isfinished = false;
        boolean replaced = false;
        int temp;
        int tempRand;

        while(isfinished)
        {
            for(int i = 1; i<20; i++)
            {
                if(generatedNums.get(i) == generatedNums.get(i-1)+1)
                {
                    replaced = true;

                    tempRand = rand.nextInt(21);
                    temp = generatedNums.get(i-1);
                    generatedNums.set((i-1), generatedNums.get(tempRand));
                    generatedNums.set(tempRand, temp);
                }
                else if(generatedNums.get(i)+1 == generatedNums.get(i+1))
                {
                    replaced = true;

                    tempRand = rand.nextInt(21);
                    temp = generatedNums.get(i+1);
                    generatedNums.set((i+1), generatedNums.get(tempRand));
                    generatedNums.set(tempRand, temp);
                }
                else
                    {
                        replaced = false;
                    }
            }
            if(replaced == false){isfinished=true;}
        }

        for(int k = 0; k< generatedNums.size(); k++)
        {
            System.out.print(generatedNums.get(k) + "  ");
        }
        
        /*
        Random rand = new Random();
        generatedNums[0] = rand.nextInt(21);
        int currentRand;
        for(int i = 1; i<=20; i++)
        {
            currentRand = rand.nextInt(21);
            for(int j = 0; j<=i; j++)
            {
                if(generatedNums[j] != currentRand)
                {
                    if(j==i){generatedNums[i] = currentRand;}
                }
                else
                    {
                        currentRand = rand.nextInt(21);
                        j=0;
                    }
            }
        }

        */
    }
}
