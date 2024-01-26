import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner userInputScanner = new Scanner(System.in);) {
			List<String> programList = Arrays.asList("Two Sum", "Remove Duplicates", "Remove Element", "Exit");
			String userInput;
			
			PROGRAM_ITERATOR : do {
				programList
				.stream()
				.map(programName -> (programList.indexOf(programName) + 1) + "." + programName)
				.forEach(System.out::println);
			
				System.out.println("\nPlease enter the serial number of the program you want to run...\n");
				userInput = userInputScanner.next();
				
				try {
	
					int[] nums;
					
					switch(Integer.parseInt(userInput)) {
						case 1:
							System.out.println("################### Sample 1 ###################");
							System.out.println("Input: nums = [2,7,11,15], target = 9");
							System.out.println("Expected Output: [0,1]");
							System.out.println("Actual Output: " + Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
							System.out.println();
							
							System.out.println("################### Sample 2 ###################");
							System.out.println("Input: nums = [3,2,4], target = 6");
							System.out.println("Expected Output: [1,2]");
							System.out.println("Actual Output: " + Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
							System.out.println();
							
							System.out.println("################### Sample 3 ###################");
							System.out.println("Input: nums = [3,3], target = 6");
							System.out.println("Expected Output: [0,1]");
							System.out.println("Actual Output: " + Arrays.toString(twoSum(new int[]{3,3}, 6)));
							System.out.println();
							break;
	
						case 2:
							System.out.println("################### Sample 1 ###################");
							System.out.println("Input: nums = [1,1,2]");
							System.out.println("Expected Output: 2, nums = [1,2,_]");
							nums = new int[]{1,1,2};
							System.out.println("Actual Output: " + removeDuplicates(nums) + ", " + Arrays.toString(nums));
							System.out.println();
							
							System.out.println("################### Sample 2 ###################");
							System.out.println("Input: nums = [0,0,1,1,1,2,2,3,3,4]");
							System.out.println("Expected Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]");
							nums = new int[]{0,0,1,1,1,2,2,3,3,4};
							System.out.println("Actual Output: " + removeDuplicates(nums) + ", " + Arrays.toString(nums));
							System.out.println();
							break;
							
						case 3:
							System.out.println("################### Sample 1 ###################");
							System.out.println("Input: nums = [3,2,2,3], val = 3");
							System.out.println("Expected Output: 2, nums = [2,2,_,_]");
							nums = new int[]{3,2,2,3};
							System.out.println("Actual Output: " + removeElement(nums, 3) + ", " + Arrays.toString(nums));
							System.out.println();
							
							System.out.println("################### Sample 2 ###################");
							System.out.println("Input: nums = [0,1,2,2,3,0,4,2], val = 2");
							System.out.println("Expected Output: 5, nums = [0,1,4,0,3,_,_,_]");
							nums = new int[]{0,1,2,2,3,0,4,2};
							System.out.println("Actual Output: " + removeElement(nums, 2) + ", " + Arrays.toString(nums));
							System.out.println();
							break;
	
						case 4:
							break PROGRAM_ITERATOR;
	
						default:
							System.out.println("Wrong serial number. Try again!\n");
					}
				} catch(NumberFormatException e) {
					System.out.println("Wrong input, only numbers are allowed. Try again!\n");
				}
				
				System.out.println("Do you want to continue (yes/no) / (y/n) ?\n");
				userInput = userInputScanner.next();
			} while(userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("y"));
			
			System.out.println("Program terminated !!!");
		}
	}
	
	private static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		
		Map<Integer, Integer> numComplement = new LinkedHashMap<>();
		
		for(int i = 0; i < nums.length; i++)
			if(numComplement.containsKey(target - nums[i])) {
				result[0] = numComplement.get(target - nums[i]);
				result[1] = i;
				break;
			} else 
				numComplement.put(nums[i], i);

        return result;
    }
	
	private static int removeDuplicates(int[] nums) {
        int j = 0;
        
        for(int i = 1; i < nums.length; i++)
            if(0 < nums[i] - nums[j])
                nums[++j] = nums[i];
             
        return j + 1;
    }
	
	private static int removeElement(int[] nums, int val) {
		int j = 0;
		
		for(int i = 0; i < nums.length; i++)
			if(val != nums[i])
				nums[j++] = nums[i];
		
		return j++;
    }
}
