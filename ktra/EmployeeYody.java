package ktra;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class EmployeeYody {
    private String id;
    private String name;
    private LocalDate dateOfBrith;
    private String queQuan;
    private String group;
    private List<LocalDateTime> dsChamCong;

    public EmployeeYody() {

    }

    public EmployeeYody(String id, String name, LocalDate dateOfBrith, String queQuan, String group, List<LocalDateTime> dsChamCong) {
        this.id = id;
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.queQuan = queQuan;
        this.group = group;
        this.dsChamCong = dsChamCong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<LocalDateTime> getDsChamCong() {
        return dsChamCong;
    }

    public void setDsChamCong(List<LocalDateTime> dsChamCong) {
        this.dsChamCong = dsChamCong;
    }

    @Override
    public String toString() {
        return "EmployeeYody{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBrith=" + dateOfBrith +
                ", queQuan='" + queQuan + '\'' +
                ", group='" + group + '\'' +
                ", dsChamCong=" + dsChamCong +
                '}';
    }
}
