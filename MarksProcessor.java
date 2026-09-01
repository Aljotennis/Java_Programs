public class MarksProcessor {

    public static void main(String[] args) {

        int[] marks = new int[5];

        try {

            marks[0] = 80;
            marks[1] = 75;
            marks[2] = 90;
            marks[3] = 85;
            marks[4] = 70;

            int total = 0;

            for (int i = 0; i < 5; i++) {
                total = total + marks[i];
            }

            int subjectCount = 5;

            double average = total / subjectCount;

            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index is out of bounds.");
        }

        catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        }

        finally {

            System.out.println("Processing complete");
        }
    }
}