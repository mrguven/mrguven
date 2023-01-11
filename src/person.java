import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import  java.util.ArrayList;


public class person {


    public static void main(String[] args) {

//        System.out.println("enter a number");
//        Scanner scan = new Scanner(System.in);
//
//                int inPut = scan.nextInt();
//        System.out.println("bu sayiyi yazdirdiniz " + inPut );
//
//


    }

    //-------------------
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here


        while (true) {
            int distance = x2 - x1;
            x1 = x1 + v1;
            x2 = x2 + v2;

            if (x1 == x2) {
                return "YES";
            } else if (distance < (x2 - x1)) {
                return "NO";
            }

        }

    }

//-------------------------
    public static int pageCount(int n, int p) {
        // Write your code here

        int front = 0;
        int back = 0;
        int page = 1;
        while (page <= n) {
            if (page >= p) {
                break;
            } else {
                front++;
            }
            if (n - page == 1) {
                page++;
            } else {
                page += 2;
            }
        }
        if (n % 2 == 0) {
            page = n;
        } else {
            page = n - 1;
        }
        while (page >= 0) {
            if (page <= p) {
                break;
            } else {
                back++;
            }
            page -= 2;

        }
        return (Math.min(front, back));

    }


    Scanner scan = new Scanner(System.in);
    int newInt = scan.nextInt();
    String newString = scan.nextLine();

//-------------------------------

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

int highScore = scores.get(0);
int  lowestScore = scores.get(0);
int first =0;
int sec = 0;

for (int i=1; i<scores.size();i++) {
    if (highScore < scores.get(i)) {
        highScore=scores.get(i);
first++;}
    else if (lowestScore>scores.get(i)) {
        lowestScore=scores.get(i);
        sec++;
        }
}
        List<Integer> newScore = new ArrayList<Integer>();
newScore.add(first) ;
newScore.add(sec);

       return newScore;

    }


//---------------
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        ArrayList<Integer> typeIndex = new ArrayList<>();
        ArrayList<Integer> repeatArray = new ArrayList<>();

        int firstType= 0;
        int secType = 0;
        int repeat=0;




            for (int j=0;i<arr.size();j++) {
                if (arr.get(i)==arr.get(0)) {
                        firstType++;

               }
        }
   }










































}
























