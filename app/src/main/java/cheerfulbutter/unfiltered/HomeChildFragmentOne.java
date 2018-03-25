package cheerfulbutter.unfiltered;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HomeChildFragmentOne extends Fragment {
    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static HomeChildFragmentOne newInstance(int page, String title) {
        HomeChildFragmentOne homeChildFragmentOne = new HomeChildFragmentOne();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        homeChildFragmentOne.setArguments(args);
        return homeChildFragmentOne;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_child_fragment_one, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.home_child_one_text);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
