import java.util.Arrays;
/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i-th customer has in the j-th bank.
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
 */
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts;
        accounts = new int[][]{{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(Arrays.toString(accounts));
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts){
        int wealth = 0;

        for (int i = 0; i < accounts.length; i++){
            int[] account = accounts[i];
            int sum = 0;
            for (int j = 0; j < account.length; j++){
                sum += account[j];
                if (sum > wealth){
                    wealth = sum;
                }
            }
        }
        return wealth;
    }
}
