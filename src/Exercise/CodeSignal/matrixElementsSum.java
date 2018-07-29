package Exercise.CodeSignal;

public class matrixElementsSum {



    /*After they became famous, the CodeBots all decided to move to a new building and live together.
    The building is represented by a rectangular matrix of rooms.
    Each cell in the matrix contains an integer that represents the price of the room.
    Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are afraid of them.
    That is why any room that is free or is located anywhere below a free room in the same column is not considered suitable for the bots to live in.\
    Help the bots calculate the total price of all the rooms that are suitable for them.

     */




    int matrixExercise(int[][] matrix) {

//int p = matrix[0].length;
        int suma = 0;

        for (int x = 0; x < matrix[0].length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                if (matrix[y][x] == 0)
                    break;
                suma = suma + matrix[y][x];

            }

        }
        return suma;

    }
}
