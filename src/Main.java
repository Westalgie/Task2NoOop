import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x = getSquareSide();

        float squareS = getSquareArea(x);
        float circleS = getCircleArea(x);
        float cornerPieceS = getCornerPieceArea(squareS, circleS);

        float figure1 = cornerPieceS * 2;
        float figure2 = cornerPieceS * 2 + circleS;
        float figure3 = cornerPieceS + getSquareArea(x/2);

        printResult("1", figure1);
        printResult("2", figure2);
        printResult("3", figure3);
    }

    private static float getSquareSide() {
        System.out.print("Введите размер стороны квадрата: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static float getSquareArea(float x) {
        return x * x;
    }

    private static float getCircleArea(float x) {
        return (float)Math.PI * x * x / 4;
    }

    private static float getCornerPieceArea(float squareS, float circleS) {
        return (squareS - circleS) / 4;
    }

    private static void printResult(String figureName, float figure) {
        System.out.printf("Площадь %s фигуры: %.3f\n", figureName, figure);
    }
}