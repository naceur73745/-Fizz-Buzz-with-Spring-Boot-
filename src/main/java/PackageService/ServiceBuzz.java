package PackageService;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceBuzz {

    public ArrayList<String> fizzBuzz(int number) {
        //create a list
        ArrayList<Integer> negativeValue = new ArrayList<Integer>();
        ArrayList<Integer> positiveValue = new ArrayList<Integer>();
        ArrayList<String> result = new ArrayList<String>() ;
        for (int i = 0; i <= number; i++) {
            negativeValue.add(i);
        }
        positiveValue = negativeValue;
        for (int i : positiveValue) {
            i = Math.abs(i);
        }
        //we created the list
        //and other list that have the value abs
        for (int i = 0; i <= number; i++){
            if((positiveValue.get(i)%3==0) &&  (positiveValue.get(i)%5==0)){
                result.add(negativeValue.get(i)+" : FizzBuzz") ;

            }else if (positiveValue.get(i)%3==0){
                result.add(negativeValue.get(i)+" : Fizz") ;

            }else if  (positiveValue.get(i)%5==0){
                result.add(negativeValue.get(i)+" : Buzz") ;

            }else {
                int value = negativeValue.get(i) + 1 ;
                result.add(value+" : Buzz") ;

            }
        }
        return result   ;


    }
}
