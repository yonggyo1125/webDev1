package exam01;

public class Ex01 {
    public static void main(String[] args) {
       // Company c1 = new Company();
        //Company c2 = new Company();
        Company c1 = Company.getInstance();
        System.out.println(c1);

        Company c2 = Company.getInstance();
        System.out.println(c2);

        System.out.println(c1 == c2);

    }
}
