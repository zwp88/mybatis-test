package addSalary;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Staff staff0 = new Staff("李白",8000, LocalDate.of(2018,2,4));
        Staff staff1 = new Staff("杜甫",12000, LocalDate.of(2012,5,6));
        Staff staff2 = new Staff("白居易",10000, LocalDate.of(2014,4,10));
        Staff staff3 = new Staff("陆游",9000, LocalDate.of(2016,10,11));

        Staff [] staffs = new Staff[4];
        staffs[0] = staff0;
        staffs[1] = staff1;
        staffs[2] = staff2;
        staffs[3] = staff3;

        System.out.println("展示员工初始信息:");
        EnterPrise enterPrise = new EnterPrise();
        enterPrise.showStaffInfo(staffs);

        System.out.println("员工加薪后的信息:");
        enterPrise.addSalary(staffs);
        enterPrise.showStaffInfo(staffs);
    }
}
