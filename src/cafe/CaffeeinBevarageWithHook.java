
package cafe;

/**
 *
 * @author c16318
 */
public abstract class CaffeeinBevarageWithHook {
    
    public void prepareRecipe(){
        boilWater();
        brew();
        pourinCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
        
    }
    
    public void boilWater(){
        System.out.println("お湯を沸かす。");
    }
    
    public abstract void brew();
    
    public void addCondiments(){
        
    }
    
    public void pourinCup(){
        System.out.println("カップに入れる。");
    }
    
    public boolean customerWantsCondiments(){
        return true;
    }
}
