import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner userInputScanner = new Scanner(System.in);) {
			List<String> programList = Arrays.asList(
					"Two Sum", 
					"Remove Duplicates", 
					"Remove Element", 
					"Search Insert", 
					"Plus One", 
					"Merge Sorted Array",
					"Convert Sorted Array to Binary Search Tree",
					"Exit"
					);
			String userInput;
			
			PROGRAM_ITERATOR : do {
				programList
				.stream()
				.map(programName -> (programList.indexOf(programName) + 1) + "." + programName)
				.forEach(System.out::println);
			
				System.out.println("\nPlease enter the serial number of the program you want to run...\n");
				userInput = userInputScanner.next();
				
				try {
					int[] nums, nums1, nums2;
					int m, n;

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
							nums = new int[]{1, 3, 5, 6};

							System.out.println("################### Sample 1 ###################");
							System.out.println("Input: nums = [1,3,5,6], target = 5");
							System.out.println("Expected Output: 2");
							System.out.println("Actual Output: " + searchInsert(nums, 5));
							System.out.println();

							System.out.println("################### Sample 2 ###################");
							System.out.println("Input: nums = [1,3,5,6], target = 2");
							System.out.println("Expected Output: 1");
							System.out.println("Actual Output: " + searchInsert(nums, 2));
							System.out.println();

							System.out.println("################### Sample 3 ###################");
							System.out.println("Input: nums = [1,3,5,6], target = 7");
							System.out.println("Expected Output: 4");
							System.out.println("Actual Output: " + searchInsert(nums, 7));
							System.out.println();
							
							nums = new int[]{1};

							System.out.println("################### Sample 4 ###################");
							System.out.println("Input: nums = [1], target = 1");
							System.out.println("Expected Output: 0");
							System.out.println("Actual Output: " + searchInsert(nums, 0));
							System.out.println();
							break;
							
						case 5:
							nums = new int[]{1, 2, 3};

							System.out.println("################### Sample 1 ###################");
							System.out.println("Input: digits = [1,2,3]");
							System.out.println("Expected Output: [1,2,4]");
							System.out.println("Actual Output: " + Arrays.toString(plusOne(nums)));
							System.out.println();

							nums = new int[]{4, 3, 2, 1};

							System.out.println("################### Sample 2 ###################");
							System.out.println("Input: digits = [4,3,2,1]");
							System.out.println("Expected Output: [4,3,2,2]");
							System.out.println("Actual Output: " + Arrays.toString(plusOne(nums)));
							System.out.println();

							nums = new int[]{9};

							System.out.println("################### Sample 3 ###################");
							System.out.println("Input: digits = [9]");
							System.out.println("Expected Output: [1,0]");
							System.out.println("Actual Output: " + Arrays.toString(plusOne(nums)));
							System.out.println();
							break;
							
						case 6:
							nums1	= new int[] {1,2,3,0,0,0};
							nums2	= new int[] {2,5,6};
							m		= 3;
							n		= 3;

							System.out.println("################### Sample 1 ###################");
							System.out.println("Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3");
							System.out.println("Expected Output: [1,2,2,3,5,6]");
							mergeSortedArray(nums1, m, nums2, n);
							System.out.println("Actual Output: " + Arrays.toString(nums1));
							System.out.println();

							nums1	= new int[] {1};
							nums2	= new int[] {};
							m		= 1;
							n		= 0;

							System.out.println("################### Sample 2 ###################");
							System.out.println("Input: nums1 = [1], m = 1, nums2 = [], n = 0");
							System.out.println("Expected Output: [1]");
							mergeSortedArray(nums1, m, nums2, n);
							System.out.println("Actual Output: " + Arrays.toString(nums1));
							System.out.println();

							nums1	= new int[] {0};
							nums2	= new int[] {1};
							m		= 0;
							n		= 1;

							System.out.println("################### Sample 3 ###################");
							System.out.println("Input: nums1 = [0], m = 0, nums2 = [1], n = 1");
							System.out.println("Expected Output: [1]");
							mergeSortedArray(nums1, m, nums2, n);
							System.out.println("Actual Output: " + Arrays.toString(nums1));
							System.out.println();
							break;
							
						case 7:
							nums = new int[]{-10,-3,0,5,9};

							System.out.println("################### Sample 1 ###################");
							System.out.println("Input: nums = [-10,-3,0,5,9]");
							System.out.println("Output: [0,-10,5,null,-3,null,9]");
							System.out.println("Actual Output: " + sortedArrayToBST(nums));
							System.out.println();

							nums = new int[]{1,3};

							System.out.println("################### Sample 2 ###################");
							System.out.println("Input: nums = [1,3]");
							System.out.println("Expected Output: [1,null,3]");
							System.out.println("Actual Output: " + sortedArrayToBST(nums));
							System.out.println();

	
						case 8:
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
		
		return j;
    }
	
	 private static int searchInsert(int[] nums, int target) {
		 int start = 0,
			end = nums.length - 1,
			mid = 0 == end ? 0 : end / 2,
			indexOfTarget = -1;
		 
		 while(start < end) {
			 if(target == nums[mid]) {
				 indexOfTarget = mid;				 
				 break;
			 } else if(target < nums[mid])
				 end = mid;
			 else
				 start = mid + 1;

			 mid = start + (end - start)/2;
		 }
		 
		 if(-1 < indexOfTarget) return indexOfTarget;
		 
		 indexOfTarget = target == nums[start] || target < nums[start] ? start : start + 1;
		 
		 return indexOfTarget;
	}
	 
	private static int[] plusOne(int[] digits) {
		
		DIGITS_ITERATOR : for(int i = digits.length - 1; i >= 0; i--) {
			switch(digits[i] + 1) {
				case 10:
					digits[i] = 0;
					break;
				
				default:
					digits[i] += 1;
					break DIGITS_ITERATOR;
			}
		}
		
		if(0 != digits[0]) return digits;
		
		int[] result = new int[digits.length + 1];
		
		for(int i = result.length - 1; i > 0; i--)
			result[i] = digits[i - 1];
		
		result[0] = 1;
		
		return result;
    }
	
	private static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m - 1, j = n - 1, k = nums1.length - 1; k >= 0 ; k--)
        	if(0 <= i && 0 <= j)
        		nums1[k] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        	else if(0 > i)
        		nums1[k] = nums2[j--];
    }
	
	private static TreeNode sortedArrayToBST(int[] nums) {
		
		TreeNode treeNode = buildBST(nums, 0, nums.length - 1);
		
        return treeNode;
    }
	
	private static TreeNode buildBST(int[] nums, int start, int end) {
		if(start > end) return null;

		TreeNode treeNode = new TreeNode();
		
		int mid = start + ((0 == end-start) ? 0 : (end-start)/2);
		
		treeNode.val = nums[mid];
		treeNode.left = buildBST(nums, start, mid-1);
		treeNode.right = buildBST(nums, mid + 1, end);
		
		return treeNode;
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    private String getLeftNodeVal() {
    	return (null == this.left ? null : String.valueOf(this.left.val)) + ",";
    }
    
    private String getRightNodeVal() {
    	return (null == this.right ? null : String.valueOf(this.right.val)) + ",";
    }
    
    private boolean hasNoChildren(TreeNode treeNode) {
    	return null == treeNode.left && null == treeNode.right;
    }
    
    private String getChildren(TreeNode treeNode) {
    	if(null == treeNode || hasNoChildren(treeNode)) return "";
    	
    	String result = treeNode.getLeftNodeVal() + treeNode.getRightNodeVal();
    	
    	result += getChildren(treeNode.left);
    	result += getChildren(treeNode.right);
    	
    	return result;
    }
    
	@Override
	public String toString() {
		return "[" + this.val + "," + getChildren(this).replaceAll(",$", "") + "]";
	}
}
