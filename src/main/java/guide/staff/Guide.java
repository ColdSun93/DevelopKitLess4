package guide.staff;

import java.util.*;

public class Guide {
    private List<Staff> staffList;

    public Guide() {
        staffList = new ArrayList<>();
    }

    /*
     * Метод добавление нового сотрудника в справочник
     * */
    public void addWorker(int id, String phone, String name, int seniority){
        Staff worker = new Staff(id, phone, name, seniority);
        staffList.add(worker);
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public void getStaff() {
        System.out.println("Staff: ");
        for (Staff worker: staffList) {
            System.out.println(worker);
        }
        System.out.println(0);
    }

    /*
    * Метод, который ищет сотрудника по стажу (может быть список)
    * */
    public List<String> getStaffSeniority(int seniority) {
        List<String> list = new ArrayList<>();
        for (Staff worker: staffList) {
            if (worker.getSeniority() == seniority) {
                list.add(worker.toString());
                //System.out.println(worker);
            }
        }
        return  list;
    }

    /*
     * Метод, который выводит номер телефона сотрудника по имени (может быть список)
     * */
    public List<String> getPhoneNumbe(String name) {
        List<String> list = new ArrayList<>();
        for (Staff worker: staffList) {
            if (worker.getName().contains(name) ) {
                list.add(worker.getName() + " " + worker.getPhone());
                //System.out.println(worker);
            }
        }
        return list;
    }

    /*
     * Метод, который ищет сотрудника по табельному номеру
     * */
    public String serchPersonnelNum(int perID) {
        for (Staff worker: staffList) {
            if (worker.getId() == perID) {
                return worker.toString();
                //System.out.println(worker);
            }
        }
        return "Сотрудник не найден";
    }

}
