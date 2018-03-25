package cheerfulbutter.unfiltered;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class addtional_information extends Fragment {


    public static addtional_information newInstance() {
        addtional_information fragment = new addtional_information();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_addtional_information, container, false);
        LinearLayout link_1 = (LinearLayout) v.findViewById(R.id.link_1);
        LinearLayout link_2 = (LinearLayout) v.findViewById(R.id.link_2);
        LinearLayout link_3 = (LinearLayout) v.findViewById(R.id.link_3);
        LinearLayout link_4 = (LinearLayout) v.findViewById(R.id.link_4);

        link_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent(getActivity(),InfoWebView.class);
                startActivity(intent_1 );
            }
        });
        link_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent(getActivity(),InfoWebView.class);
                startActivity(intent_2 );
            }
        });
        link_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3 = new Intent(getActivity(),InfoWebView.class);
                startActivity(intent_3 );
            }
        });
        link_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_4 = new Intent(getActivity(),InfoWebView.class);
                startActivity(intent_4 );
            }
        });
        return v;
    }

}