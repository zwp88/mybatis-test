package addSalary;

public class EnterPrise {
    public void addSalary(Staff[] staffs){
        for(Staff staff : staffs){
            if(staff.getWorkDate()>=100){
                staff.setSalary(staff.getSalary() + 1000);
            }
        }
    }
    public void showStaffInfo(Staff[] staffs){
        for(Staff staff : staffs){
            System.out.println(staff.toString());
        }
    }
}
