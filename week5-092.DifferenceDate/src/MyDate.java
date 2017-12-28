public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        int numberOfDay = (this.month - 1) * 30 + this.day;
        int numberOfDayComp= (comparedDate.month - 1) * 30 + comparedDate.day;
        int numberOfYear = Math.abs(this.year - comparedDate.year);

        if(this.year >= comparedDate.year && numberOfDay - numberOfDayComp >= 0){
            return numberOfYear;
        }
        else if(this.year < comparedDate.year && numberOfDayComp - numberOfDay >=0){
            return numberOfYear;
        } else {
            return numberOfYear - 1;
        }


    }

}
