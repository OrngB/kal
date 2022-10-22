import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("KALKULATOR WYNGRODZEŃ \n");
        System.out.println("PODAJ RODZAJ UMOWY: ");
        System.out.println("(DUŻYMI LITERAMI):) ");
        System.out.println("PRACA [P] ");
        System.out.println("ZLECENIE [Z] ");
        System.out.println("DZIEŁO [D] ");
        Scanner scan = new Scanner(System.in);
        String U = scan.next();
        System.out.println("PODAJ ILOŚĆ PRZEPRCOWANYCH GODZIN: ");
        float B = scan.nextFloat();
        System.out.println("PODAJ STAWKĘ GODZINOWĄ BRUTTO: ");
        float C = scan.nextFloat();

        float em = 9 ;
        float rt = 2 ;
        float zd = 2 ;
        float pd = 12 ;
        float nt = 0 ;
        float bt = 0 ;




        if ( U.equals("P") )
        {
            bt = B * C;
            nt = bt * ((100-( em + rt + zd + pd))/100);
            System.out.println("DOSTRANIESZ:  " + nt);

        }
        if ( U.equals("Z") )
        {
            bt = B * C;
            nt = bt * ((100-( zd + pd))/100);
            System.out.println("DOSTRANIESZ:  " + nt);

        }
        if ( U.equals("D") )
        {
            bt = B * C;
            nt = bt * ((100-(pd))/100);
            System.out.println("DOSTRANIESZ:  " + nt);

        }




    }
}