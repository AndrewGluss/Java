public class MaxMinUtils {
    public static void main(String[] args) {
        System.out.println(min(-1,2, 4, 0));
    }
    public static int min(int a, int b){
        return a < b ? a : b;
    }
    public static int min(int a, int b, int c) {
        int x = a < b ? a : b;
        return x < c ? x : c;
    }
    public static int min(int a, int b, int c, int d) {
        int x = a < b ? a : b;
        int y = c < d ? c : d;
        return x < y ? x : y;
    }
    public static int min(int a, int b, int c, int d, int e) {
        int x = a < b ? a : b;
        int y = c < d ? c : d;
        int z = x < y ? x : y;
        return z < e ? z : e;
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int max(int a, int b, int c) {
        int x = a > b ? a : b;
        return x > c ? x : c;
    }
    public static int max(int a, int b, int c, int d) {
        int x = a > b ? a : b;
        int y = c > d ? c : d;
        return x > y ? x : y;
    }
    public static int max(int a, int b, int c, int d, int e) {
        int x = a > b ? a : b;
        int y = c > d ? c : d;
        int z = x > y ? x : y;
        return z > e ? z : e;
    }
}
