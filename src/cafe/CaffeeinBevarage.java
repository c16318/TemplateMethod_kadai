
package cafe;
import java.util.Scanner;

/**
 *
 * @author c16318
 */
public abstract class CaffeeinBevarage {
    public void boilWater(){
        System.out.println("お湯を沸かす。");
    }
    public void pourinCup(){
        System.out.println("カップに入れる。");
    }
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public boolean customerWantsCondiments(){
        return true;
    }
    
    public void prepareRecipe(){
        
        boilWater();
        brew();
        pourinCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
}
