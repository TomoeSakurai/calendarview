package works.ojo.calendarview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import works.ojo.calendarview.R;
import works.ojo.calendarview.adapter.CalendarPageAdapter;

/**
 * Created by SakuraMochiko on 16/01/24.
 */
public class MainActivity extends Activity{

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        viewPager=(ViewPager)findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter = new CalendarPageAdapter(this);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setAdapter(pagerAdapter);



    }
}
