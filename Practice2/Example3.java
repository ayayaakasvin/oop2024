package Practice2;

class Time {
    private Integer hour, minute, second;

    public Time (Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String Universal () {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public String Standard () {
        int standardHour = this.hour % 12;
        if (standardHour == 0) {
            standardHour = 12;
        }
        return String.format("%d:%d:%d %s", this.hour % 12, this.minute, this.second, hour >= 12 ?"PM":"AM");
    }

    public void add(Time input) {
        this.second += input.second;
        if (this.second >= 60) {
            this.second -= 60;
            this.minute++;
        }

        this.minute += input.minute;
        if (this.minute >= 60) {
            this.minute -= 60;
            this.hour++;
        }

        this.hour += input.hour;
        if (this.hour >= 24) {
            this.hour -= 24;
        }
    }
    
    public static Time add(Time input1, Time input2) {
        Time result = new Time(0, 0, 0);

        result.second = input1.second + input2.second;
        if (result.second >= 60) {
            result.second -= 60;
            result.minute++;
        }

        result.minute += input1.minute + input2.minute;
        if (result.minute >= 60) {
            result.minute -= 60;
            result.hour++;
        }

        result.hour += input1.hour + input2.hour;
        if (result.hour >= 24) {
            result.hour -= 24;
        }

        return result;
    }

    public static void main(String[] args) {
        Time time1 = new Time(14, 59, 50);  // 2:59:50 PM
        Time time2 = new Time(1, 2, 15);    // 1:02:15 AM

        // Instance add
        time1.add(time2);
        System.out.println("After adding time2 to time1:");
        System.out.println("Universal: " + time1.Universal());
        System.out.println("Standard: " + time1.Standard());

        // Static add
        Time result = Time.add(new Time(23, 59, 59), new Time(0, 0, 1));
        System.out.println("\nAdding 23:59:59 and 00:00:01:");
        System.out.println("Universal: " + result.Universal());
        System.out.println("Standard: " + result.Standard());
    }
}