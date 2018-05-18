package cn.sunjian.sort;
/**
 * 排序算法：
 * 
 * 		之--选择排序；
 * 		
 * @author jack
 *
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = new int[20];//定义一个整型的数组长度为100
		
		for(int i=0;i<20;i++){//初始化数组
			arr[i] = 1+(int)(Math.random()*1000);
		}
		
		System.out.println("排序之前：");
		for(int num : arr){
			System.out.print(num+"、");
		}
		
		//选择优化排序
		for(int i=0;i<arr.length-1;i++){//第i趟排序
			
			int k = i;//记录最小值的角标
			for(int j=k+1;j<arr.length;j++){
				if (arr[j]<arr[k]) {//如果第二个小于第一个
					k = j;//记录第二个的角标
				}
			}
			
			//找到本轮最小的数以后，进行交换
			if (i != k) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		
		System.out.println("\n排序之后：");
		for(int num : arr){
			System.out.print(num+"、");
		}
	}

}
