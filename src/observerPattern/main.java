package observerPattern;

public class main {
    public static void main(String[] args) {
        // Tạo lớp trưởng
        ClassLeader leader = new ClassLeader();

        // Tạo sinh viên
        Student student1 = new Student("Nguyễn Văn A");
        Student student2 = new Student("Trần Thị B");
        Student student3 = new Student("Lê Văn C");

        // Sinh viên đăng ký nhận thông báo
        leader.registerObserver(student1);
        leader.registerObserver(student2);
        leader.registerObserver(student3);

        // Lớp trưởng gửi thông báo
        System.out.println("Lớp trưởng gửi thông báo:");
        leader.notifyObservers("Lớp mình mai có kiểm tra 15 phút nhé!");

        // Một sinh viên rời khỏi danh sách nhận thông báo
        leader.removeObserver(student2);

        // Lớp trưởng gửi thông báo mới
        System.out.println("\nLớp trưởng gửi thông báo lần 2:");
        leader.notifyObservers("Thay đổi địa điểm học sang phòng B202.");
    }
}
