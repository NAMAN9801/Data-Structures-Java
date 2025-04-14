package Strings;

public class PathCrossing {
    static void getShortestPath(String path){
        int x=0,y=0;

        //WNEENESENNN is the path
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') y++;
            if (path.charAt(i) == 'S') y--;
            if (path.charAt(i) == 'E') x++;
            if (path.charAt(i) == 'W') x--;
        }

        System.out.println(Math.sqrt(x*x+y*y));
    }

    public static void main(String[] args) {
        getShortestPath("WNEENESENNN");
    }
}
