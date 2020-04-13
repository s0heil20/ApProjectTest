package models.discount;

import java.util.Date;

public abstract class Discount {
    private Date start;
    private Date end;
    protected int percent;

    public Discount(Date start, Date end, int percent) {
        this.start = start;
        this.end = end;
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
