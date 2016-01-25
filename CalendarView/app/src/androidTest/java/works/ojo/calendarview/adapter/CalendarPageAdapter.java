package works.ojo.calendarview.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import works.ojo.calendarview.R;
import works.ojo.calendarview.view.CalendarView;

/**
 * Created by SakuraMochiko on 16/01/24.
 */
public class CalendarPageAdapter extends PagerAdapter{

    private LayoutInflater mInflater;
    private Context mContext;

    private final int MAX_MONTH=120;

    public CalendarPageAdapter(Context context){
        mInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContext=context;
    }

    @Override
    public int getCount() {
        return MAX_MONTH;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        ((ViewPager) container).removeView((View) object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view=new CalendarView(mContext);
        view.findViewById(R.id.)



        return view;
    }
}
