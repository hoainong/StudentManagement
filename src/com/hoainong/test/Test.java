package com.hoainong.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hoainong.model.*;
public class Test {
	public static void main(String[] args) {
		List<ClassRoom> classRooms = createClassRooms();
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Danh sách lớp học:");
				int index = 1;
				for (ClassRoom classRoom : classRooms) {
					System.out.println(index + ". " + classRoom.getNameClass());
					index++;
				}

				System.out.print("Chọn một lớp học: ");
				int choice = scanner.nextInt();
				if (choice < 1 || choice > classRooms.size()) {
					System.out.println("Lựa chọn không hợp lệ");
					return;
				}
				ClassRoom selectedClassRoom = classRooms.get(choice - 1);
				System.out.println("1.Thêm sinh viên:");
				System.out.println("2.Danh Sách sinh viên :");
				System.out.print("Chọn chức năng : ");
				int choice2 = scanner.nextInt();
				switch (choice2) {
					case 1 :
						System.out.print("Nhập ID sinh viên: ");
						String id = scanner.next();
						System.out.print("Nhập tên sinh viên: ");
						String name = scanner.next();
						System.out.print("Nhập điểm GPA: ");
						Double gpa = scanner.nextDouble();
						Student student = new Student(id, name, gpa);
						selectedClassRoom.getListStudents().add(student);
						break;
					case 2 :
						System.out.println("Danh sách sinh viên trong lớp "
								+ selectedClassRoom.getNameClass() + ":");
						List<Student> students = selectedClassRoom
								.getListStudents();
						for (Student s : students) {
							System.out.println("ID: " + s.getId() + ", Tên: "
									+ s.getName() + ", GPA: " + s.getGpa()
									+ ", Categorize: " + s.categorize(s.getGpa()));
						}
						break;
					default :
						break;
				}

			}
		}

	}

	private static List<ClassRoom> createClassRooms() {
		List<Student> students1 = new ArrayList<>();
		students1.add(new Student("1", "Sinh viên 1", 8.5));
		students1.add(new Student("2", "Sinh viên 2", 7.2));
		ClassRoom classRoom1 = new ClassRoom("Lớp 1", students1);

		List<Student> students2 = new ArrayList<>();
		students2.add(new Student("3", "Sinh viên 3", 6.9));
		students2.add(new Student("4", "Sinh viên 4", 9.1));
		ClassRoom classRoom2 = new ClassRoom("Lớp 2", students2);

		List<Student> students3 = new ArrayList<>();
		students3.add(new Student("5", "Sinh viên 5", 7.8));
		students3.add(new Student("6", "Sinh viên 6", 6.3));
		ClassRoom classRoom3 = new ClassRoom("Lớp 3", students3);

		List<ClassRoom> classRooms = new ArrayList<>();
		classRooms.add(classRoom1);
		classRooms.add(classRoom2);
		classRooms.add(classRoom3);

		return classRooms;
	}
}
