package array;

public class TrappedWater {
    public static void main(String[] args) {
        int[] a = {5, 5, 1, 7, 1, 1, 5, 2, 7, 6};
        System.out.println(solver(a));
        //4,2,0,3,2,5
        //0,1,0,2,1,0,1,3,2,1,2,1
        //5,5,1,7,1,1,5,2,7,6
    }

    public static int solver(int[] array) {
//        int totalWater = 0;
//        for(int i = 0; i <array.length ; i++){
//            int leftI = i;
//            int rightI = i;
//            int maxLeft=0;
//            int maxRight=0;
//            while (leftI>=0){
//                maxLeft = Math.max(maxLeft,array[leftI]);
//                leftI--;
//            }
//            while(rightI<array.length){
//                maxRight = Math.max(maxRight,array[rightI]);
//                rightI++;
//            }
//            int currentWater = Math.min(maxRight,maxLeft)-array[i];
//            if(currentWater >= 0 ){
//                totalWater+=currentWater;
//            }
//        }
//        return totalWater;
        int maxLeft = array[0];
        int maxRight = array[array.length - 1];
        int left = 0;
        int right = array.length - 1;
        int total = 0;

        while (left <= right) {
            if (maxLeft <= maxRight) {
                int currentP = array[left];
                if (currentP <= maxLeft) {
                    int currentValue = maxLeft - currentP;
                    total += currentValue;
                    left++;
                } else {
                    maxLeft = currentP;
                    left++;
                }
            } else {
                int currentP = array[right];
                if (currentP < maxRight) {
                    int currentValue = maxRight - currentP;
                    total += currentValue;
                    right--;
                } else {
                    maxRight = currentP;
                    right--;
                }
            }
        }
        return total;
    }
}
