package math.problems;

public class Pattern {

    public static void main(String[] args) {
        /*
        Read the numbers below, find the pattern, then implement the logic from this pattern.
            Once done, you should test to see if you get the same output as below:

        100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...

        */
//        pattern();
    }

    public static void pattern(){
        int num = 100;

        System.out.print(num);

        for (int i = 0; i < 4; i++){

            for (int n = 0; n < 10; n++){

                num =num-i;
                System.out.print("," + num);
            }
        }
    }

//    public static void pattern(){
//
//
//        for(int i=100; i>=0;i--){
//            int count=1;
//            if (count<=10){
//                System.out.print(i+",");
//                count++;
//            }
//
//            else if (11<=count && count<=20)
//                else if (90<i && i<70) {
//                System.out.println(i-1 + ",");
//            }
//            else if (70<i && i<740) {
//                System.out.println(i-1 + ",");
//            }
//
//        }
//
//    }

//    public static void pattern() {
//        int count = 0;
//
//        for (int i = 100; i >= 0; i--) {
//            count++;
//            if (count <= 10) {
//                System.out.print(i + ", ");
//            } else {
//                for (i = 90; i >= 0; i -= 2) {
//                    if (count > 10 && count <= 20) {
//                        System.out.print(i + ", ");
//                        count++;
//                    } else {
//                        for (i = 70; i >= 0; i -= 3) {
//                            if (count > 20 && count <= 30) {
//                                System.out.print(i + ", ");
//                                count++;
//                            } else {
//                                for (i = 40; i >= 0; i -= 4) {
//                                    if (count > 30 && count <= 40) {
//                                        System.out.print(i + ", ");
//                                        count++;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//    }
}
