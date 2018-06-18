package challenge.technical.habib.smoothcomm.fragment.details;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import challenge.technical.habib.smoothcomm.R;
import challenge.technical.habib.smoothcomm.base.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends BaseFragment {


    public DetailsFragment() {
        // Required empty public constructor
    }
    public static DetailsFragment newInstance() {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

}
