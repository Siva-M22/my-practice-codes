public class WeeklyTemperatures {
    public static void main(String[] args) {
        
        int[] temperatures = { 18,21,19,25,22,20,17};
        int min=temperatures[0];
        int max =temperatures[0];
        int sum=0;

       
        for(int i=0;i<temperatures.length;i++){
            if(temperatures[i]>max){
                max=temperatures[i];
            }
            
            if(temperatures[i]<min){
               min=temperatures[i];
            }
            
            sum+=temperatures[i];
        }

        
        double average=sum/7.0;

        
        System.out.println("Highest temperature:"+max);
        System.out.println("Lowest temperature:"+min);
        System.out.printf("Average temperatue: %.2f",average);
    }
}
