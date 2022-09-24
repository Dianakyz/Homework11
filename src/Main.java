import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    checkLeapYear(2022);
    getDeviceLink(0, 2005);
        int deliveryDays = calculateDeliveryDays(60);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void getDeviceLink(int osType, int manufacturingYear) {
        int currentYear = LocalDate.now().getYear();
        String osString = osType == 0 ? "iOS" : "Android";
        String versionString = manufacturingYear > 2015 ? "полную" : "облегченную";
        System.out.println("Установите " + versionString + "версию для " + osString + " по ссылке");
        }

        public static int calculateDeliveryDays(int deliveryDistance){
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
        }
    }


