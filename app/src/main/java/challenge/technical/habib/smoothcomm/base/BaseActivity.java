package challenge.technical.habib.smoothcomm.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import challenge.technical.habib.smoothcomm.R;


public abstract class BaseActivity extends AppCompatActivity {
    public void attachFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment, fragment.getClass().getName());
        transaction.commit();
    }

}
