package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] ar1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] ar2 = {18, 25, 41, 47, 17, 36, 14, 19};

        System.out.println(findSmallestDifference(ar1, ar2));

    }

        public static int findSmallestDifference(int[] ar1, int[] ar2) {

            int smallestDiff=99999;
            int currentDiff=0;

            for(int i = 0; i < ar1.length; i++) {
                for(int j = 0; j < ar2.length; j++) {
                    currentDiff = Math.abs(ar1[i] - ar2[j]);
                    if(currentDiff < smallestDiff) {
                        smallestDiff = currentDiff;
                    }
                }
            }
            return smallestDiff;
        }

}
