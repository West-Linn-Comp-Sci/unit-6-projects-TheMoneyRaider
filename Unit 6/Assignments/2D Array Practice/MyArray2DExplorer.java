
public class MyArray2DExplorer
{
    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();


        System.out.print("]");

        System.out.println();

        System.out.print("Test minRow: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRow(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
                System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }
    
    public int minRow(int[][] nums, int row){
    int small=Integer.MAX_VALUE;
        for(int i=0;i<nums[row].length;i++){
            if(nums[row][i]<small)
            small=nums[row][i];
        }
        return small;
    }
    public int[] colMaxs(int[][] matrix){
    int[] large = new int[matrix[0].length];
    for(int[] row: matrix){
        for(int i =0;i<row.length;i++){
            if(row[i]>large[i])
                large[i]=row[i];
        }
    }
    return large;
    }
    public int[] allRowSums(int[][] data){
    int[] sums = new int[data.length];
    int sum=0;
    for(int i=0;i<data.length;i++){
        sum=0;
        for(int l=0;l<data[i].length;l++){
            sum+=data[i][l];
        }
        sums[i]=sum;
    }
    return sums;
    }
    public double[] averageCol(int[][] nums){
    double[] average = new double[nums[0].length];
    double temp=0;
    for(int i =0;i<nums.length;i++){
        for(int l =0;l<nums[i].length;l++){
        temp=(int)nums[i][l];
        temp/=nums.length;
        average[l]+=temp;
        }
    }
    return average;
    }
    public int smallEven(int[][] matrix){
    int min=Integer.MAX_VALUE;
    for(int i=0;i<matrix.length;i++){
           for(int l=0; l<matrix[i].length;l++){
           if(matrix[i][l]<min&& (matrix[i][l]%2)==0){
           min=matrix[i][l]; 
           }
           }
       }
    return min;
    }
    public static int biggestRow(int[][] nums){
    int bigsum=0;
    int bigsumindex=0;
    int sum=0;
    for(int i =0;i<nums.length;i++){
        sum=0;
        for(int l =0; l<nums[i].length;l++){
        sum+=nums[i][l];
        }
        if(sum>bigsum){
            bigsum=sum;
            bigsumindex=i;
        }
    }
    return bigsumindex;
    }
}