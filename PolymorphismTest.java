public class  PolymorphismTest
{
public static void main(String[]args)
}
CommissionEmployee = new commissionEmployee
("Sue", "Jones", "22-22-2222", "1000", .06);
BasePlusCommissionEmployee BasePlusCommissionEmployee = new BasePlusCommissionEmployee ("Bob","Lewis", "333-33-3333","5000",.04, 300);

System.out.println("%s %s: %n%n%s%n%n, "Call CommissionEmployee's toString with superclass "reference to superclass object",CommissionEmployee.toString());

System.out.println("%s %s: %n%n%s%n%n, "Call BasePlusCommissionEmployee's toString with superclass "reference to superclass object", basePlusCommissionEmployee.toString());

CommissionEmployee commissionEmployee2= basePlusCommissionEmployee;
System.out.println("%s %s: %n%n%s%n", Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass objetc", commissionEmployee2.toString());}
}
