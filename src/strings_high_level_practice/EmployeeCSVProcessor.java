package strings_high_level_practice;

class EmployeeCSVProcessor {

    public static void main(String[] args) {

        String csvData = """
                101,Jay,Java Developer,85000
                102,Ravi,QA Engineer,72000
                103,Neha,Data Analyst,78000
                104,Amit,Senior Java Developer,105000
                """;

        String[] rows = csvData.strip().split("\n");

        int totalSalary = 0;
        int employeeCount = 0;

        System.out.println("Employee Report");
        System.out.println("----------------");

        for (String row : rows) {

            String[] columns = row.split(",");

            int id = Integer.parseInt(columns[0].trim());
            String name = columns[1].trim();
            String role = columns[2].trim();
            int salary = Integer.parseInt(columns[3].trim());

            totalSalary += salary;
            employeeCount++;

            String level = salary >= 100000 ? "Senior Level" : "Mid Level";

            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Role: " + role);
            System.out.println("Salary: $" + salary);
            System.out.println("Level: " + level);
            System.out.println();
        }

        double averageSalary = totalSalary / (double) employeeCount;

        System.out.println("Average Salary: $" + String.format("%.2f", averageSalary));
    }
}