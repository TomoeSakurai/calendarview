package works.ojo.calendarview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import works.ojo.calendarview.R;

/**
 * calendarview
 */
public class CalendarView extends LinearLayout implements View.OnClickListener{

    private OnClickListener mDateOnClickListener;
    private OnClickListener mPageScrollOnClickListener;

    private int mMaxMonth=-1;
    private int mMaxYear=-1;
    private int mMinMonth=-1;
    private int mMinYear=-1;

    private int currentMonth=-1;
    private int currentYear=-1;



    public CalendarView(Context context) {
        super(context);
    }

    public CalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View layout= LayoutInflater.from(context).inflate(R.layout.calendar_main,this);
    }

    public OnClickListener getDateOnClickListener() {
        return mDateOnClickListener;
    }

    public void setDateOnClickListener(OnClickListener mDateOnClickListener) {
        this.mDateOnClickListener = mDateOnClickListener;
    }

    public int getmMaxMonth() {
        return mMaxMonth;
    }

    public void setmMaxMonth(int mMaxMonth) {
        this.mMaxMonth = mMaxMonth;
    }

    public int getmMaxYear() {
        return mMaxYear;
    }

    public void setmMaxYear(int mMaxYear) {
        this.mMaxYear = mMaxYear;
    }

    public int getmMinMonth() {
        return mMinMonth;
    }

    public void setmMinMonth(int mMinMonth) {
        this.mMinMonth = mMinMonth;
    }

    public int getmMinYear() {
        return mMinYear;
    }

    public void setmMinYear(int mMinYear) {
        this.mMinYear = mMinYear;
    }

    public int getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public void onClick(View v) {
        int date=v.getId();
        mDateOnClickListener.onClick(v);

    }
}
