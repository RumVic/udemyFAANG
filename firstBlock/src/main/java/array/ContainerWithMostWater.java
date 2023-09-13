package array;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(solver(array));
    }

    public static int solver(int[] height) {

        int p1 = 0;
        int p2 = height.length - 1;
        int areaMax = 0;

        while (p1 < p2) {
            int minHeight = Math.min(height[p1], height[p2]);
            int width = p2 - p1;
            int currentArea = minHeight * width;
            if(currentArea >= areaMax){
                areaMax = currentArea;
            }
            if (height[p1] <= height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return areaMax;
    }
}
