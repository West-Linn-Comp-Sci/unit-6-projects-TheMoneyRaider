    public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int [][] mat, int row){
        int count=0;
        for(int col: mat[row]){
            if((col%2)==0)
            count++;
        } 
        if(count==mat[row].length)
        return true;
        return false;
    }
    public boolean oddColSum(int[][] nums, int col){
        int count=0;
        for(int i=0;i<nums.length;i++){
           for(int l=0; l<nums[i].length;l++){
               if(l==col)
               count+=nums[i][l];
            }
        }
        if((count%2)==1)
        return true;
        return false;
    }
    //returns true if the sum of the numbers the given col is odd.
    public int[] minRow(int [][] nums){
       int min=Integer.MAX_VALUE;
       int a=0;
       for(int i=0;i<nums.length;i++){
           for(int l=0; l<nums[i].length;l++){
           if(nums[i][l]<min){
           min=nums[i][l]; 
           a=i;
           }
           }
       }
       return nums[a];
    }


    


}






