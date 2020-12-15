import java.util.Scanner;

class App {

    public static void Pause(Scanner input) {
        System.out.print("\nPress Enter to continue . . . ");
        input.nextLine();
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("3) ���������������� ��������� ������ ������������� � ����� ����������;");

        Vector2 arr[] = new Vector2[] { new Vector2(), new Vector2(2, 4), new Vector2(3, 6, Color.red) };

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("vector%d = %s\n", i, arr[i]);
        }

        Pause(input);

        System.out.println("1) � main ������������������ ������ � ���� � ���������� ��������� �������� ������ ������;");

        Vector2 twoDimArr[][] = new Vector2[10][30];
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                twoDimArr[i][j] = new Vector2(i,j,
                    new Color(i*(int)255/twoDimArr.length, 0, j*(int)255/twoDimArr[i].length)
                );
            }
        }

        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                System.out.print(twoDimArr[i][j].color);
            }
            System.out.println();
        }


        while (true) {
            Vector2 v1 = new Vector2();
            v1.read(input);
            v1.setColor(Color.red);
            System.out.print("v1 = ");
            v1.display();

            Vector2 v2 = new Vector2();
            v2.read(input);
            v2.setColor(Color.green);
            System.out.print("v2 = ");
            v2.display();

            System.out.printf("Angle between v1 and v2 = %.2f degrees\n", Vector2.angle(v1, v2));

            Vector2 sum = v1.add(v2);
            System.out.print("v1 + v2 = ");
            sum.setColor(Color.blue);
            sum.display();

            input.nextLine();
            Pause(input);
        }
    }
}