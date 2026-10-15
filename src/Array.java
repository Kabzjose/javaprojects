import java.util.Arrays;


public class Array {
    public static void main(String[] args){
        int[] marks={34,67,5,34,87,6,44};
        int max=marks[0];
        int min=marks[0];
        int sum=0;

        for (int mark:marks) {
            if(mark >max){
                max=mark;
            }

            sum+=mark;
        }
        for (int mark:marks) {
            if(mark <min){
                min=mark;
            }



        }

        double average= (double) sum /marks.length;

        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
        System.out.println("Highest marks is " +max);
        System.out.println("Lowest marks is " +min);
        System.out.println("Average marks is " +average);

    }
}
