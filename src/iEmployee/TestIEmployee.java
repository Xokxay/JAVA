package iEmployee;

public class TestIEmployee {
    public static void main(String[] args){
        Employee e1 = new PartTimeEmployee("XOKXAY", 10, 4);
        Employee e2 = new FullTimeEmployee("THAVATXAY", 15);
        e1.display();
        e2.display();
    }
}