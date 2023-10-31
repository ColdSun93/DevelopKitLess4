package guide.staff;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Guide guide = new Guide();

        guide.addWorker(111,"2564-456","Иванов Иван Иванович", 10);
        guide.addWorker(112,"89253678214","Иванов Семён Семенович", 9);
        guide.addWorker(214,"256-45-456","Смирнов Семён Иванович", 8);
        guide.addWorker(213,"256-35-777","Сидоров Петр Петрович", 7);
        guide.addWorker(510,"89814526819","Петров Иван Сергеевич", 10);

        guide.getStaff(); //вывод списка сотрудников

        List<String> list = guide.getStaffSeniority(10); //вывод списка сотрудников, чей стаж равен 10
        System.out.println(list);
        List<String> list2 = guide.getPhoneNumbe("Семён");  //вывод списка с № телефонов сотрудников, с именем Семён
        System.out.println(list2);

        System.out.println(guide.serchPersonnelNum(213)); //вывод сотрудник, c табельным номером 213

    }


}
