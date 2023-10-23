

public class Penguin{



    public static void printWorld(int[][] world, int pinguRow, int pinguColumn) {
        for (int i = 0; i <world.length ; i++) {
            for (int j = 0; j <world[i].length ; j++) {

                switch (world[i][j]){
                    case 0:
                        System.out.print("L");
                    break;
                    case 1:
                        System.out.print("I");
                    break;
                    case 2:
                        System.out.print("W");
                        break;
                    case 3:
                        System.out.print("S");
                        break;
                    case 4:
                        System.out.print("F");
                        break;
                    default:
                        System.out.print("-");

                }

                if( i == pinguRow && j == pinguColumn){
                    System.out.print("(P)");
                }else if( j != world[i].length -1 ){
                    System.out.print('\t');
                }


            }

            System.out.println();

        }
    }

    public static boolean isFishReachable(int[][] world, int pinguRow, int pinguColumn){
        //TODO
//        first element of the arr defines move on the row, second element defiens move on the column
        int[][] landMoves = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
        int[][] iceMoves = new int[][]{{1,1}, {1,-1}, {-1,1}, {-1,-1}};
        int[][] waterMoves = new int[][]{{3,3}, {3,-3}, {-3,3}, {-3,-3}};

        switch(world[pinguRow][pinguColumn]){
            case 0:
                for (int i = 0; i <landMoves.length ; i++) {
                    if(pinguRow + landMoves[i][0] >= 0 &&  pinguRow + landMoves[i][0] < world[0].length && pinguColumn + landMoves[i][1] >=0 && pinguColumn + landMoves[i][1] < world.length){

                    }
                }
                break;
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("W");
                break;
            case 3:
                 return  false;
            case 4:
                System.out.print("F");
                break;
            default:
                System.out.print("-");

        }

        return false;
    }

    /**
     * returns the example world 1.
     * Do not modify this method.
     * @return An example world
     */
    public static int[][] generateExampleWorldOne(){
        return new int[][] {{2,3,3,3,3,3}, {3,0,3,3,4,3}, {3,3,3,3,3,1}, {3,3,3,0,1,3}, {3,3,3,3,3,3}};
    }

    /**
     * returns the example world 1.
     * Do not modify this method.
     * @return An example world
     */
    public static int[][] generateExampleWorldTwo(){
        return new int[][] {{0,0,0,2}, {0,0,0,1}, {0,1,3,4}, {3,4,3,3}};
    }

    /**
     *  You may use the main method for testing your program.
     */
    public static void main(String[] args){
        int pinguRow = 0;
        int pinguColumn = 0;
        int[][] world = generateExampleWorldOne();
        printWorld(world, pinguRow, pinguColumn);
//        System.out.println(""+isFishReachable(world, pinguRow, pinguColumn));
    }

}
