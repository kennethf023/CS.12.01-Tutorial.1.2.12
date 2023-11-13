public class Successors {

    public static Position findPosition(int num, int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==num){
                    Position pos=new Position(i,j);
                    return pos;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] a){
        Position[][] pos=new Position[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                pos[i][j]=findPosition(a[i][j]+1,a);
            }
        }
        return pos;
    }

}
