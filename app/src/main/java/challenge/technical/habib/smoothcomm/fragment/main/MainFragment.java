package challenge.technical.habib.smoothcomm.fragment.main;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import challenge.technical.habib.smoothcomm.R;
import challenge.technical.habib.smoothcomm.activity.MainApplication;
import challenge.technical.habib.smoothcomm.adapter.BrandAdapter;
import challenge.technical.habib.smoothcomm.base.BaseFragment;
import challenge.technical.habib.smoothcomm.model.Node;


public class MainFragment extends BaseFragment implements MainView {
    private RecyclerView recyclerView;
    private BrandAdapter adapter;
    private mainPresenter mainPresenter;
    private List<Node> responseList;

    public MainFragment() {
        // Required empty public constructor
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mainfragment, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        mainPresenter = new MainPresenterImpl(this);
        recyclerView = view.findViewById(R.id.recyclerview);
        responseList = new ArrayList<>();
        mainPresenter.getBrands();

    }


    @Override
    public void displayBrands(Node response) {
        responseList.add(response);
        adapter = new BrandAdapter(responseList.get(0).getSmoothcommerce() ,getActivity() ,MainFragment.newInstance());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainApplication.getInstance());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void toast() {
        Toast.makeText(getContext() , getString(R.string.internet) ,Toast.LENGTH_LONG).show();
    }

}
