package challenge.technical.habib.smoothcomm.activity;

import android.os.Bundle;

import challenge.technical.habib.smoothcomm.R;
import challenge.technical.habib.smoothcomm.base.BaseActivity;
import challenge.technical.habib.smoothcomm.fragment.main.MainFragment;

;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        attachFragment(MainFragment.newInstance());

    }
}
