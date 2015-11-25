/**
 * Created by Alex on 11/25/15.
 */
public class Commutator {
    public Object Swicher(int x){
        if ((x%3==0)&&(x%5==0)&&(x%7==0)){
            return "Fizz Buzz Pop";
        } else {
            if ((x%3==0)&&(x%5==0)){
                return "Fizz Buzz";
            }else {
                if ((x%3==0)&&(x%7==0)){
                    return "Fizz Pop";
                }else{
                    if ((x%5==0)&&(x%7==0)){
                        return "Buzz Pop";
                    }else {
                        if (x%3==0){
                            return "Fizz";
                        }
                        if (x%5==0){
                            return "Buzz";
                        }
                        if (x%7==0){
                            return "Pop";
                        }
                        return x;
                    }
                }
            }
        }
    }
}
