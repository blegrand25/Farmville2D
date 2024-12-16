public class MyFarm {

    public Plot[][] grid;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        grid = new Plot[5][4];
        for (int a = 0; a < grid.length; a++){
            for (int b = 0; b < grid[0].length; b++){
                System.out.println("planting at row " + a + " column " + b );
                grid [a][b] = new Plot();
                grid [a][b].printPlotInfo();
            }
        }

        //totalPlants();
        //totalCarrots();
        //averageNumberOfPlants();
        numberOfTomatoPlots();

        /***
         * for each additional method you code, call it here
         */


    }

    public void totalPlants() {
        int total = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b = 0; b < grid[0].length; b++){
                total = total + grid[a][b].numberOfPlants;
            }
        }

        System.out.println("total plants: " + total);
    }

    public void totalCarrots() {
        int tcarrots = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b = 0; b < grid[0].length; b++){
                if (grid[a][b].plantName == "carrot"){
                    tcarrots = tcarrots + grid[a][b].numberOfPlants;
                }
            }
        }

        System.out.println("total carrots: " + tcarrots);

    }

    public void averageNumberOfPlants() {
        double total = 0;
        double aveplants = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b = 0; b < grid[0].length; b++){
                total = total + grid[a][b].numberOfPlants;
            }
        }
        aveplants = total/20;

        System.out.println("average number of plants across row: " + aveplants);
    }

    public void numberOfTomatoPlots() {
        int total = 0;
        int tplots;
        for (int a = 0; a < grid.length; a++){
            for (int b = 0; b < grid[0].length; b++){
                if (grid[a][b].plantName.equals("tomato")){
                    total =;
                }
            }
        }
        tplots = total;
        System.out.println("number of tomato plots: " + tplots);


        // how many plots have tomatos on them?

    }

    public void numberOfEmptyPlots() {
        // how many plots are empty?

    }

    public void everyOtherNeedsWater() {
        // change the value of needsWater to be true for every other plot
        // print the value or needs water for all plots row by row

    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?

    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?

    }

    public void greaterThan50() {
        // how many plots have more than 10 plants in the plot?

    }

    public void plantWithMaxNumberNeedsWater() {
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }


    /***
     * more challenging
     */


    public void averageRows() {
        // find the average number of plants for every row
        // place the average of every row into a new array

    }

    public void averageColumns() {
        // find the average number of plants for every col
        // place the average of every row into a new array

    }

    public void updateNeedsWater() {
        // if 2 or more of the adjacent plots need water (left, right, up, down),
        // make the current plot needs water to be true

    }


    /***
     * most challenging
     */


    public void greatestDifferenceNumberBetweenAnyAdjacentPlants() {
        // of every pair of adjacent plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right),
        // which two have the greatest difference in plant numbers?
        // what is that difference?

    }

    public void updateNumberOfPlants() {
        // change the value of number of plants so it is the average of the 8 surrounding plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right)
    }

    public void numberOfCarrotPlotsNextToCorn() {
        // how many carrot plots share a border with a corn plot?

    }

}
