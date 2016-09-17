import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1, 3, 6, 30, 2};
		int target = 36;
		int[] main_result;
		TwoSum now = new TwoSum();
		main_result = now.twoSum(num,target);
		//System.out.println("[ ");
		for(int i = 0; i < main_result.length; i++ ){
			if(i == 0){
				System.out.print("[ " + main_result[i] + " ]");
			}
			System.out.print(", [ " + main_result[i] + " ]");
		}

	}
	
	public int[] twoSum(int[] numbers, int target){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		for(int i = 0; i < numbers.length; i++){
			if(map.containsKey(numbers[i])){
				int index = map.get(numbers[i]);
				result[0] = index;
				result[1] = i;
				System.out.println(result[0]);
				break;
			}
			else{
				map.put(target - numbers[i], i);
			}
		}
		return result;
	}

}
