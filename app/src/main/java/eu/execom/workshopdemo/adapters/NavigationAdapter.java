package eu.execom.workshopdemo.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import eu.execom.workshopdemo.R;
import eu.execom.workshopdemo.fragments.HomeFragment;
import eu.execom.workshopdemo.fragments.ParticipantsFragment;

/**
 * {@link NavigationAdapter Adapter} that handles providing {@link Fragment fragments} to a
 * {@link android.support.v4.view.ViewPager view pager}.
 * Created by Alex on 4/10/16.
 */
public class NavigationAdapter extends FragmentStatePagerAdapter {

    private static final int NUMBER_OF_TABS = 2;

    private Context context;

    public NavigationAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    /**
     * This method provides our {@link android.support.v4.view.ViewPager view pager} with a {@link
     * Fragment fragment} based on a position.
     * @param position position of the requested {@link Fragment fragment}.
     * @return {@link Fragment fragment} based on the position provided.
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new ParticipantsFragment();
        }
        return null;
    }

    /**
     * @return number of fragments currently available to this {@link FragmentStatePagerAdapter
     * adapter}.
     */
    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }

    /**
     * @param position position of the requested page title.
     * @return requested page title.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        // This method is used to provide titles for tabs.
        // Note that strings aren't hardcoded, but retrieved from strings.xml via current Context
        switch (position) {
            case 0:
                return context.getString(R.string.home);
            case 1:
                return context.getString(R.string.participants);
        }
        return null;
    }
}
