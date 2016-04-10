package eu.execom.workshopdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eu.execom.workshopdemo.adapters.NavigationAdapter;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        final NavigationAdapter adapter = new NavigationAdapter(this, getSupportFragmentManager());
        final ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
        // Note that TabLayout belongs to the Design Support Library which is a topic of the 3th
        // workshop. It has been used here because the old way of making tabs is a bit more messy
        // and would only add to the confusion.
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(pager);
    }
}
