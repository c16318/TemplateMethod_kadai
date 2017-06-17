
package cafe;

import java.util.Scanner;

/**
 *
 * @author c16318
 */
public class Tea extends CaffeeinBevarage{
    
    private int condiments;
    
    public void brew(){
        System.out.println("紅茶を入れる");
    }
    
    public void addCondiments(){
    if(condiments == 1){   
        System.out.println("レモンを入れる.");
    }
    else{
        System.out.println("ミルクを入れる");
    }
    }
    
    public boolean customerWantsCondiments(){

        System.out.println("1:レモン、2:ミルク、0:なし >>");
        condiments = getUserInput();
        
        if(condiments == 1 |condiments == 2 ){
            
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public int getUserInput(){
        Scanner stdIn = new Scanner(System.in);
        return stdIn.nextInt();    
    }
}
