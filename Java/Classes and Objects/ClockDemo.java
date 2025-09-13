import java.util.Scanner;

class Clock {
    int hours;
    int minutes;
    int seconds;

    Clock() {
        this.hours = 12;
        this.minutes = 00;
        this.seconds = 00;
    }

    Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Clock(int seconds) {
        setClock(seconds);
    }

    public void setClock(int seconds) {
        this.hours = (seconds / 3600) % 24;
        this.minutes = (seconds / 60) % 60;
        this.seconds = seconds % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick() {
        seconds += 1;
        if (seconds == 60) {
            seconds = 0;
            minutes += 1;
        }
        if (minutes == 60) {
            minutes = 0;
            hours += 1;
        }
        if (hours == 24) {
            hours = 0;
        }
    }

    public void addClock(Clock c) {
        seconds += c.seconds;
        if (seconds >= 60) {
            seconds -= 60;
            minutes += 1;
        }
        minutes += c.minutes;
        if (minutes >= 60) {
            minutes -= 60;
            hours += 1;
        }
        hours += c.hours;
        if (hours >= 24) {
            hours -= 24;
        }
    }

    public String toString() {
        return "(" + hours + " : " + minutes + " : " + seconds + ")";
    }

    public void tickDown() {
        seconds -= 1;
        if (seconds < 0) {
            seconds = 59;
            minutes -= 1;
        }
        if (minutes < 0) {
            minutes = 59;
            hours -= 1;
        }
        if (hours < 0) {
            hours = 23;
        }
    }

    public void subtractClock(Clock c) {
        seconds -= c.seconds;
        if (seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }
        minutes -= c.minutes;
        if (minutes < 0) {
            minutes += 60;
            hours -= 1;
        }
        hours -= c.hours;
        if (hours < 0) {
            hours += 24;
        }
    }

    public Clock diffClock(Clock c2) {
        int currentTotal = hours * 3600 + minutes * 60 + seconds;
        int newTotal = c2.hours * 3600 + c2.minutes * 60 + c2.seconds;

        int diff = currentTotal - newTotal;

        if (diff < 0) {
            diff += 24 * 3600;
        }

        Clock result = new Clock();
        result.setClock(diff);
        return result;
    }
}

public class ClockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds: ");
        int s1 = sc.nextInt();
        Clock firstClock = new Clock(s1);
        Clock originalFirstClock = new Clock(firstClock.getHours(), firstClock.getMinutes(), firstClock.getSeconds());

        System.out.println("First Clock Time: " + firstClock.toString());

        for (int i = 1; i <= 10; i++) {
            firstClock.tick();
            System.out.println("After tick " + i + ": " + firstClock.toString());
        }

        System.out.println();

        System.out.println("Enter hours: ");
        int h = sc.nextInt();
        System.out.println("Enter minutes: ");
        int m = sc.nextInt();
        System.out.println("Enter seconds: ");
        int s = sc.nextInt();
        Clock secondClock = new Clock(h, m, s);
        Clock originalSecondClock = new Clock(secondClock.getHours(), secondClock.getMinutes(),
                secondClock.getSeconds());
        System.out.println("\nSecond Clock Time: " + secondClock.toString());

        for (int j = 1; j <= 10; j++) {
            secondClock.tick();
            System.out.println("After tick " + j + ": " + secondClock.toString());
        }

        firstClock.addClock(secondClock);
        System.out.println("\nAdding firstClock and secondClock: " + firstClock.toString());

        System.out.println("\n\nFirst Clock Time: " + originalFirstClock.toString());
        System.out.println("Second Clock Time: " + originalSecondClock.toString());

        Clock thirdClock = originalFirstClock.diffClock(originalSecondClock);
        System.out.println("\nDifference between firstClock and secondClock: " + thirdClock.toString());

        sc.close();
    }
}
