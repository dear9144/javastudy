package practice;

import java.util.Arrays;

public class Practice {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//math.random 이 0.1xx ~ 0.9xx ~까지 뽑히는 난수형이라
		//int 형 변경은 알겠는데 왜 str으로 변환하는가?
		int[] numArr = {0,1,2};
		/*numArr[0] = 0;
		numArr[1] = 1;
		numArr[2] = 2;
		numArr[3] = 3;
		numArr[4] = 4;
		numArr[5] = 5;
		numArr[6] = 6;
		numArr[7] = 7;
		numArr[8] = 8;
		numArr[9] = 9;
*/
		
		//System.out.println(numArr);
		
		for(int i = 0; i<2; i++) {
			int n = (int)(Math.random() * 3);
			int tmp = numArr[0];
			numArr[0]= numArr[n];
			numArr[n] = tmp;
		}
		int idx1 = 
		System.out.println(Arrays.toString(numArr));
		//System.out.println(tmp);
	}

}
