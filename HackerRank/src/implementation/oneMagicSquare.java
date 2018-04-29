package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class oneMagicSquare {

    static int formingMagicSquare(int[][] s) {
        // Complete this function
    	int[] arr = new int[9];
    	//int[][] ar = new int[9][1];
    	int row = 0;
    	for(int i = 0 ; i < 3 ; i++) {
    		for(int j = 0; j< 3; j++) {
    			arr[row] = s[i][j];
        		row++;
    		}
    	}
    	Arrays.sort(arr);
    	row = 0;
    	for(int k = 0; k<9; k++) {
    		for(int m = 1; m<=9; m++) {
    			if(arr[k] == m ) {
    				row++;
    				System.out.println("var:"+arr[k] +" value " +row);
    				
    			}
    		}
    		row = 0;
    	}
    	
    	return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}

/*row = 0;
for(int k = 0; k < 9; k = k+3) {
	ar[row] = arr[k] + arr[k+1] + arr[k+2];
	row++;
	if(row == 3) {
		for(int m = 0; m < 3; m++) {
			ar[row] = arr[m] + arr[m +3] + arr[m+6];
			row++;
			if(row == 6) {
				ar[row] = arr[0] + arr[4] + arr[8];
				row++;
				ar[row] = arr[2] + arr[4] + arr[6];
			}
		}
	}
}
int sum = 0;
for(int n = 0; n<6; n++) {
	sum = sum + ar[n];
}
*/