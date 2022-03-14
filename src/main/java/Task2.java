import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    static int Square(int a){
        return a*a;
    }

    static int CrossCircle (List<Integer> circleParam, List<Integer> pointsParam, int i){
        return (Square(pointsParam.get(i*2)-circleParam.get(0))
                + Square(pointsParam.get(i*2+1)-circleParam.get(1))
                - Square(circleParam.get(2)));
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);

        List<Integer> circleParam = new ArrayList<>();
        Scanner in1 = new Scanner(new File(in.next()));
        while (in1.hasNextLine())
            circleParam.add(in1.nextInt());

        List<Integer> pointsParam = new ArrayList<>();
        Scanner in2 = new Scanner(new File(in.next()));
        while (in2.hasNextLine())
            pointsParam.add(in2.nextInt());

        for (int i = 0; i < pointsParam.size()/2; i++){

            if (CrossCircle (circleParam, pointsParam,i) == 0){
                System.out.println(0);
            }

            if (CrossCircle (circleParam, pointsParam,i) < 0){
                System.out.println(1);
            }

            if (CrossCircle (circleParam, pointsParam,i) > 0){
                System.out.println(2);
            }

        }
    }
}
