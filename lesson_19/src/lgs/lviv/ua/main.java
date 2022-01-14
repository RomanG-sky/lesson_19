package lgs.lviv.ua;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class main {

		public static void main(String[] args) throws IOException, ClassNotFoundException {

			File fileEmployee = new File("Employee.obj");
			Employee employee = new Employee(22, "Ivan", 10000);
			System.out.println("Worker:");
			System.out.println(employee);

			System.out.println("Worker after Serializable:");
			Methods.serialize(employee, fileEmployee);
			System.out.println(Methods.deserealize(fileEmployee));

			System.out.println();

			File fileEmployeeList = new File("EmployeeList.obj");
			List<Employee> employeeList = new ArrayList<Employee>();
			employeeList.add(employee);
			employeeList.add(new Employee(33, "Vano", 20000));
			employeeList.add(new Employee(44, "Ivan", 30000));
			employeeList.add(new Employee(55, "Vano", 40000));
			employeeList.add(new Employee(66, "Ivan", 50000));
			employeeList.add(new Employee(77, "Vano", 60000));

			System.out.println("List of workers:");
			for (Employee eachEmployee : employeeList) {
				System.out.println(eachEmployee);
			}

			System.out.println();

			System.out.println("List of workers after Serializable:");
			Methods.serialize((Serializable) employeeList, fileEmployeeList);

			List<Employee> employeeListDeserialized = new ArrayList<Employee>();
			employeeListDeserialized = (List<Employee>) Methods.deserealize(fileEmployeeList);

			for (Employee eachEmployee : employeeListDeserialized) {
				System.out.println(eachEmployee);
			}

		}

	}