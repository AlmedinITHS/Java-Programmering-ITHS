package ChatGTPOvning;

class Manager extends Employee {
    double bonus;
    
    Manager (String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    double getSalary() {
        return salary + bonus;
    }
}
