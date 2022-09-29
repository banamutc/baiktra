package ktra;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class YodyBacNinh {
    public static void main(String[] args) {
        List<EmployeeYody> employeeYodyList = new ArrayList<>();
        employeeYodyList.add(new EmployeeYody("1","nam",LocalDate.parse("2001-12-14"),"HD","1",
                List.of(LocalDateTime.parse("2022-09-19T07:30:20"),LocalDateTime.parse("2022-09-29T08:15:45"),
                        LocalDateTime.parse("2022-09-29T08:15:45"),LocalDateTime.parse("2022-09-29T08:15:45"),
                        LocalDateTime.parse("2022-09-29T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("2","hiep",LocalDate.parse("2001-12-14"),"HD","3",
                List.of(LocalDateTime.parse("2022-09-09T07:20:20"),LocalDateTime.parse("2022-09-19T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("3","thang",LocalDate.parse("2001-12-14"),"HD","4",
                List.of(LocalDateTime.parse("2022-09-10T07:30:20"),LocalDateTime.parse("2022-09-29T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("4","cong",LocalDate.parse("2001-12-14"),"HD","9",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("11","tien",LocalDate.parse("2001-12-14"),"HD","1",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("5","quan",LocalDate.parse("2001-12-14"),"HD","10",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("6","tan",LocalDate.parse("2001-12-14"),"HD","2",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("7","duc",LocalDate.parse("2001-12-14"),"HD","7",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("8","nghia",LocalDate.parse("2001-12-14"),"HD","5",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("9","thinh",LocalDate.parse("2001-12-14"),"HD","8",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        employeeYodyList.add(new EmployeeYody("10","huy",LocalDate.parse("2001-12-14"),"HD","6",
                List.of(LocalDateTime.parse("2022-09-15T07:30:20"),LocalDateTime.parse("2022-09-25T08:15:45"))));
        System.out.println("danh sach:");
        System.out.println(employeeYodyList);
        YodyBacNinh yodyBacNinh = new YodyBacNinh();
        System.out.println();
        System.out.println("Danh sach cong nhan theo to la:");
        System.out.println(yodyBacNinh.dsTheoGroup(employeeYodyList));
        System.out.println();
        System.out.println("Danh sach sau khi lay ra 2 log:");
//        System.out.println(yodyBacNinh.dsChomCong(employeeYodyList));

    }
    public Map<String, List<EmployeeYody>> dsTheoGroup (List<EmployeeYody> employeeYodies) {
        Map<String, List<EmployeeYody>> yody1 = new HashMap<>();
        employeeYodies.forEach(employee -> {
            List<EmployeeYody> nGroup = yody1.get(employee.getGroup());
            if (nGroup == null) {
                nGroup = new ArrayList<>() {
                    {
                        add(employee);
                    }
                };
            } else {
                nGroup.add(employee);
            }
            yody1.put(employee.getGroup(), nGroup);
        });
        return yody1;
    }

//    public Map<LocalDateTime, List<EmployeeYody>> dsChomCong (List<EmployeeYody> employeeYodies) {
////        var yody3 = employeeYodies.stream()
////                .collect(Collectors.groupingBy(EmployeeYody::getGroup,
////                        HashMap::new,
////                        Collectors.mapping(Function.identity(), Collectors.toList())));
//
//        Map<LocalDateTime, List<EmployeeYody>> inDS = new HashMap<>();
//        employeeYodies.forEach(employeeYody -> {
//            List<LocalDateTime> localDateTimes = employeeYody.getDsChamCong();
//            localDateTimes.stream().limit(2).skip(3).forEach(employeeYody -> System.out.println(employeeYody));
//        });
//    }

}
