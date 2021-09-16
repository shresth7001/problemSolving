
public class Main { 
    static int N; 
    //function to print solution matrix
    void printPath(int path[][]) 
    { 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print( 
                    " " + path[i][j] + " "); 
            System.out.println(); 
        } 
    } 
     //function to check if x, y is valid index for N * N Maze
   
  
    boolean findPath(int matrix[][]) 
    {       int n = matrix.length;

        int path[][] = new int[n][n];
        boolean ans = findPathInMaze(matrix,0,0,path);
        if(ans == false)
        return false;
        printPath(path);
         //Practise Yourself : Write your code Here
         return true;
    } 
    public static boolean findPathInMaze(int matrix[][],int x,int y,int path[][]){
        if(x==matrix.length-1 && y == matrix.length-1){
            path[x][y] = 1;
            return true;
        } 
        if (isValid(matrix,x,y)==true){
            path[x][y]=1;
            if(findPathInMaze(matrix,x+1,y,path))
            return true;
            if(findPathInMaze(matrix,x,y+1,path))
            return true;
            path[x][y]=0;
            return false;
        }
        
        return false;
        
        
    }
    public static boolean isValid(int matrix[][],int x,int y){
    if(x<matrix.length && y<matrix.length && matrix[x][y] != 1)
    return true;
    return false;
    }
    public static void main(String args[]) 
    { 
        Main rat = new Main(); 
        int matrix[][] = { { 0, 1, 0, 1, 1 }, 
                           { 0, 0, 0, 0, 0 }, 
                           { 1, 0, 1, 0, 1 }, 
                           { 0, 0, 1, 0, 0 },
                           { 1, 0, 0, 1, 0 }
        }; 
  
        N = matrix.length; 
        rat.findPath(matrix); 
    } 
} 