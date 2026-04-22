package employeesalarysystem;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }



    public double raiseSalary() {
        int yearCount = 2021 - this.hireYear;
        if (yearCount < 10) {
            return this.salary * 0.05;
        } else if (yearCount > 9 && yearCount < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double taxAndBonusSalary = this.salary - tax() + bonus();
        double totalSalary = taxAndBonusSalary + raiseSalary();

        return  "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + taxAndBonusSalary + "\n" +
                "Toplam Maaş : " + totalSalary;
    }
}
