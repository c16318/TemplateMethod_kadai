
 
package cafe;
import java.util.Scanner;

/**
 *
 * @author c16318
 */
public class CoffeeWithHook extends CaffeeinBevarageWithHook{
    
    public void brew(){
        System.out.println("コーヒーを入れる");
    }
    
    public boolean customerWantsCondiments(){
        System.out.println("砂糖、ミルクを入れますか。1/0");
        
        if(getUserInput() == 1){
            return true;
        }
        else{
            return false;
        }
        
    }        
    
    public void addCondiments(){
        System.out.println("砂糖、ミルクを入れます。");
    }
    
    public int getUserInput(){
        Scanner stdIn = new Scanner(System.in);
        return stdIn.nextInt();
        
    }
}
