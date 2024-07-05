class Solution {
    public void setZeroes(int[][] matrix) {
        
        LinkedList<int []> zer= new LinkedList<>();

        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[0].length;col++)
            {
                if(matrix[row][col]==0)
                {
                    zer.add(new int[]{row , col});
                }
            }
        }

        for(int[] i: zer)
        {
            int zerr= i[0];
            int zerc= i[1];

            for(int col=0;col<matrix[0].length;col++)
            {
                matrix[zerr][col]=0;
            }

            for(int row=0;row<matrix.length;row++)
            {
                matrix[row][zerc]=0;
            }

            

            
        }
    }
}
