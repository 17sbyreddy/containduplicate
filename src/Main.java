//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean containsDuplicate(int[] nums) {

        // Use set to store numbers and then loop through array and check to see if the number is present in the set meaning it is a duplicate
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i < nums.length; i++){

            if(set.contains(nums[i]) == true){
                return true;
            }

            set.add(nums[i]);

        }

        return false;
    }
}