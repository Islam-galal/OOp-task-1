import javax.swing.JOptionPane;

public class StudentsResults {

	public static void main(String[] args) {

		String numberOfStudentsString = JOptionPane.showInputDialog("Please enter number of students ");
		int numberOfStudents = Integer.parseInt(numberOfStudentsString);

		Students[] students = new Students[numberOfStudents];

		for (int i = 0; i < students.length; i++) {

			String studentName = JOptionPane.showInputDialog("Please enter name of Student number " + (i + 1));
			String studentEmail = JOptionPane.showInputDialog("Please enter Email  of Student number " + (i + 1));
			String studentPhone = JOptionPane.showInputDialog("Please enter Phone of Student number " + (i + 1));
			String faculty = JOptionPane.showInputDialog("Please enter faculty name of Student number " + (i + 1));

			Students studentsObject = new Students(studentName, studentEmail, studentPhone, faculty);

			String numberOfSubjectsString = JOptionPane.showInputDialog("Please enter number of Subjects have");

			int numberOfSubjects = Integer.parseInt(numberOfSubjectsString);

			Grade[] grades = new Grade[numberOfSubjects];

			for (int j = 0; j < grades.length; j++) {

				String subjectName = JOptionPane.showInputDialog("Please enter Subject name of  " + (j + 1));
				String subjectGradeString = JOptionPane.showInputDialog("Please enter grade of subject " + (j + 1));
				double subjectGrade = Double.parseDouble(subjectGradeString);

				Grade g = new Grade(subjectName, subjectGrade);

				grades[j] = g;

			}

			studentsObject.setGrade(grades);

			students[i] = studentsObject;

		}

		String studentResults = "";
		String studentGradeMoreThan75 = "";

		for (int i = 0; i < students.length; i++) {

			studentResults += "Student number  " + (i + 1) + "   Name    " + students[i].getName() + "\n";
			studentResults += "Student number  " + (i + 1) + "   Email    " + students[i].getEmail() + "\n";
			studentResults += "Student number  " + (i + 1) + "   Phone    " + students[i].getPhone()+ "\n";
			studentResults += "Student number  " + (i + 1) + "   Faculty   " + students[i].getFaculty()+ "\n";

			if (students[i].getGrade() != null) {

				studentResults += "Student number " + (i + 1) + "   Grades is     \n";

				for (int j = 0; j < students[i].getGrade().length; j++) {

					studentResults += "Object name is " + students[i].getGrade()[j].getName() +"\n" + " Grade number "
							+ students[i].getGrade()[j].getMark()+"\n";
					
					

				}
				
				studentResults+= "---------------------------------------\n";
				
				JOptionPane.showMessageDialog(null, studentResults);

			}

		}

	}

}
