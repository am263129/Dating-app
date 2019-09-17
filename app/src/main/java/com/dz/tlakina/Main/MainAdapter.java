package com.dz.tlakina.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dz.tlakina.Chats.ChatsFragment;
import com.dz.tlakina.Feeds.FeedsFragment;
import com.dz.tlakina.Profile.ProfileFragment;
import com.dz.tlakina.Swipe.SwipeFragment;
import com.dz.tlakina.Users.UsersFragment;

public class MainAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MainAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ProfileFragment tab0 = new ProfileFragment();

                return tab0;
            case 1:

                UsersFragment tab1 = new UsersFragment();

                return tab1;
            case 2:

                SwipeFragment tab2 = new SwipeFragment();

                return tab2;

            case 3:

                ChatsFragment tab3 = new ChatsFragment();

                return tab3;
            case 4:

                FeedsFragment tab4 = new FeedsFragment();

                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }


}