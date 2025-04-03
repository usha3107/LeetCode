class Solution {
    public int projectionArea(int[][] grid) {
        		int xy = 0;
        int xz = 0;
        int yz = 0;
        
        for(int i = 0; i < grid.length; i++){
            int maxxz = 0;
            int maxyz = 0;
            for(int j = 0; j < grid[0].length; j++){
                maxxz = Math.max(maxxz, grid[i][j]);
                maxyz = Math.max(maxyz, grid[j][i]);
                if(grid[i][j] > 0) xy++;
            }
            xz += maxxz;
            yz += maxyz;
        }
        
        return xy + xz + yz;
    }
}