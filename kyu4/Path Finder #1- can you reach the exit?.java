import java.util.*;
public class Finder {
    static char[][] c;
    static int size;
    static boolean find(int x,int y){

        if(x<0 || y<0 || x>=size || y>=size)  return false;
        else if(c[x][y]!='.')  return false;
        if(c[x][y]=='W')  return false;  


        if(x==size-1 && y==size-1 && c[x][y]=='.')
          return true;
          
        c[x][y]='W';
        
        return (find(x+1,y) || find(x-1,y) || find(x,y+1) || find(x,y-1));

    }
    static boolean pathFinder(String maze) {

        c = new char[(int)Math.sqrt(maze.length())][(int)Math.sqrt(maze.length())];
        int mi = 0;
        size = c.length;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++,mi++)
            {
                c[i][j] = maze.charAt(mi);    
            }
            mi++;
        }
        
        return find(0,0);
    }
}