
import java.util.Random;
public class OrderidGenerator {
    public static void main(String[]args){
        Random random=new Random();
        String[] orderIDs=new String[5];
        for(int i=0;i<orderIDs.length;i++){
            //Generate a random uppercase letter between A (65) and E(69)
            char prefix=(char)(random.nextInt(5)+'A');
            //generate random number from 1 to 999 with format it with leading zeros
            int number=random.nextInt(999)+1;
            String suffix=String.format("%03d",number);
            //combine prefix and suffix to form orderID
            orderIDs[i]=prefix+suffix;
        }
        //Print all generated OrderIDs
        for(String orderID:orderIDs){
            System.out.println(orderID);
        }

    }
}