package labs_examples.arrays;

public class MultiDimArray {

    public static void main(String[] args) {

        int[][] vals = new int[5][5];

        int count = 0;

        //populate array
        for (int i = 0; i < vals.length; i++){
            for(int x = 0; x < vals[i].length; x++){
                vals[i][x] = count;
                count++;
            }
        }

        for (int i = 0; i < vals.length; i++){
            for(int x = 0; x < vals[i].length; x++){
                System.out.print(vals[i][x] + " | ");
            }
            System.out.println();
        }

    }
}
