import javax.swing.*;

class GradeCalculatorApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            String inputSubjects = JOptionPane.showInputDialog(null, "Enter number of subjects:");
            int n = Integer.parseInt(inputSubjects);


            String inputTotal = JOptionPane.showInputDialog(null, "Enter total marks of each subject:");
            int total = Integer.parseInt(inputTotal);


            int[] marks = new int[n];


            for (int i = 0; i < n; i++) {
                String inputMarks = JOptionPane.showInputDialog(null, "Enter marks of subject " + (i + 1) + ":");
                marks[i] = Integer.parseInt(inputMarks);
            }


            int totalMarks = total * n;

            // Calculate sum of marks
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }


            float percentage = ((float) sum / totalMarks) * 100;


            String percentageStr = String.format("%.2f%%", percentage);


            String grade;
            if (percentage >= 90 && percentage <= 100) {
                grade = "A";
            } else if (percentage >= 80 && percentage < 90) {
                grade = "B";
            } else if (percentage >= 60 && percentage < 80) {
                grade = "C";
            } else {
                grade = "D";
            }


            String message = "Percentage: " + percentageStr + "\n" +
                    "Grade: " + grade;


            JOptionPane.showMessageDialog(null, message, "Grade Calculator Result", JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
