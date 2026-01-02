package LeetcodeDaily;

public class Problem2257CountUnguardedCellsintheGrid {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int [][] vis= new int[m][n];
        int [][] dir={{-1,0},{0,1},{1,0},{0,-1}};
        for(int j=0;j<walls.length;j++){
            vis[walls[j][0]][walls[j][1]]=-1;
        }

        for(int j=0;j<guards.length;j++){
            int k=guards[j][0];
            int l = guards[j][1];
             vis[k][l]=1;
             //up
             while (k>=0){
                 if(vis[k][l]==-1)
                     break;
                 if(vis[k][l]!=1)
                     vis[k][l]=1;
                 k=k-1;
             }
             k=guards[j][0];
             l = guards[j][1];
             //right
            while (l<n){
                if(vis[k][l]==-1)
                    break;
                if(vis[k][l]!=1)
                    vis[k][l]=1;
                l=l+1;
            }
            k=guards[j][0];
            l = guards[j][1];
            //down
            while (k<m){
                if(vis[k][l]==-1)
                    break;
                if(vis[k][l]!=1)
                    vis[k][l]=1;
                k=k+1;
            }
            k=guards[j][0];
            l = guards[j][1];
            //left
            while (l>=0){
                if(vis[k][l]==-1)
                    break;
                if(vis[k][l]!=1)
                    vis[k][l]=1;
                l=l-1;
            }

        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]!=1&&vis[i][j]!=-1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String []args){
        Problem2257CountUnguardedCellsintheGrid solution = new Problem2257CountUnguardedCellsintheGrid();
        int [][] guards={{0,0},{1,1},{2,3}};
        int [][] walls={{0,1},{2,2},{1,4}};
        int m=4;
        int n=6;
        int res = solution.countUnguarded(m,n,guards,walls);
        System.out.println(res);
    }
}
