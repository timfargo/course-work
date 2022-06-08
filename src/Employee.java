public class Employee {


    private String name;
    private String surname;
    private String patronymic;
    private double salary;
    private  int department;
    private int id;

    public  Employee(String name,String surname,String patronymic,double salary,int department){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getPatronymic(){
        return patronymic;
    }

    public double getSalary(){
        return salary;
    }

    public int getDepartment(){
        return department;
    }

    public int getId(){
        return id;
    }
}
