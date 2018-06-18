package challenge.technical.habib.smoothcomm.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import challenge.technical.habib.smoothcomm.R;
import challenge.technical.habib.smoothcomm.fragment.details.DetailsFragment;

public abstract class BaseFragment extends Fragment {
    public void switchFragment(FragmentActivity fragmentActivity , String fragName  ) {
        FragmentTransaction transaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_layout, DetailsFragment.newInstance());
        transaction.addToBackStack(fragName);
        transaction.commit();
    }
}
