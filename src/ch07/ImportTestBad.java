package ch07;

public class ImportTestBad {
    public static void main(String[] args) {
        java.util.Date today = new java.util.Date();

        java.text.SimpleDateFormat date = new java.text.SimpleDateFormat("yyyy/MM/dd");
        java.text.SimpleDateFormat time = new java.text.SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜 : " + date.format(today));
        System.out.println("지금 시간 : " + time.format(today));
    }
}
