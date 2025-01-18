//Given a route containing 4 directions (E,W,N,S), find the shortest path to reach the destinations
//"WNEENESENNN"
public class shortestpath {
    public static float getShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //West
            if(dir == 'W'){
                x--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //South
            else{
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]){
        String path  = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
