public class Counter {
    int number;
    
    void up(){
        number ++;
    }
    
    void down(){
        if (number < 0){
        number = number - 0;
        }else if(number > 0){
            number--;
        }
    }
    
    int getNumber(){
        return number;
    }
}
