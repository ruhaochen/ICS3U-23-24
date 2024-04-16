package lesson3;

public class LightBoard {
    private boolean [][] lights;

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[r].length; c++) {
                if ((int)Math.random()*10 < 4)
                    lights[r][c] = true;
            }
        }
    }

    public boolean evaluateLight(int row, int col){
        if (lights[row][col] == true){
            int count = 0;
            for (int r = 0; r < lights[row].length; r++) {
                if(lights[r][col] == true)
                    count++;
            }
            if(count%2 == 0)
                return false;
            else
                return lights[row][col];
        }else{
            int count = 0;
            for (int r = 0; r < lights[row].length; r++) {
                if(lights[r][col] == true)
                    count++;
            }
            if(count%3 == 0)
                return true;
            else
                return lights[row][col];
        }
    }
}
