package com.gmail.plaza.kaam.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gmail.plaza.kaam.fragments.HouseholdEmployeeFragment;
import com.gmail.plaza.kaam.fragments.HouseholdEmployerFragment;

public class AllTabAdapters extends FragmentPagerAdapter {

    public AllTabAdapters(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new HouseholdEmployerFragment();
        } else {
            fragment = new HouseholdEmployeeFragment();
        }
        assert fragment != null;
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Household Employer";
        } else {
            title = "Household Employee";
        }
        return title;
    }

}
