import java.util.ArrayList;
public class Basics {
    public Integer printTo255(int num){
        while(num<=255){
            System.out.println(num);
            num++;
        }
        return num;
    }
    public Integer printTo255Odds(int num){
        while(num<=255){
            if(num%2 != 0){
                System.out.println(num);
                num++;
            }
            else{
                num++;
            }
            
        }
        return num;
    }
    public Integer printTo255Sum(int num){
        int sum = 0;
        while(num<=255){
            sum += num;
            System.out.println("New Number: "+ num + " Sum: " + sum);
            num++;
        }
        return num;
    }
    public void iterate(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
    public Integer findMax(ArrayList<Integer> arr){
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            if( arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
    }
    public Integer average(ArrayList<Integer> arr){
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
                sum += arr.get(i);
        }
        return sum/arr.size();
    }
    public ArrayList<Integer> arrTo255Odds(int num){
        ArrayList<Integer> y = new ArrayList<Integer>();
        while(num<=255){
            if(num%2 != 0){
                
                y.add(num);
                num++;
            }
            else{
                num++;
            }
            
        }
        return y;
    }
    public Integer greaterThanY(ArrayList<Integer> arr, int num){
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > num){
                sum++;
            }
        }
        return sum;
    }
    public ArrayList<Integer> squareValues(ArrayList<Integer> arr){
        ArrayList<Integer> y = new ArrayList<Integer>();
            for(int i = 0; i < arr.size(); i++){
            y.add(arr.get(i)*arr.get(i));
        }
        return y;
    }
    public ArrayList<Integer> noNegatives(ArrayList<Integer> arr){
        ArrayList<Integer> y = new ArrayList<Integer>();
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) > 0){
                    y.add(arr.get(i));
                }
                else{
                    y.add(0);
                }
        }
        return y;
    }
    public void minMaxAvg(ArrayList<Integer> arr){
        int min = 0;
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
            else if(arr.get(i) < min){
                min = arr.get(i);
            }
            sum += arr.get(i);
        }
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
        System.out.println("Average: "+ sum/arr.size());
    }
    public ArrayList<Integer> shifty(ArrayList<Integer> arr){
        ArrayList<Integer> y = new ArrayList<Integer>();
            for(int i = 1; i < arr.size(); i++){
                y.add(arr.get(i));
        }
        y.add(0);
        return y;
    }
}