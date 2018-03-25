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
                Intent intent_1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www1.nyc.gov/apps/311universalintake/form.htm?serviceName=DEP+Lead+Kit"));
                startActivity(intent_1 );
            }
        });
        link_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent("android.intent.action.VIEW", Uri.parse("https://waterservices.usgs.gov/"));
                startActivity(intent_2 );
            }
        });
        link_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.atsdr.cdc.gov/csem/csem.asp?csem=34&po=10"));
                startActivity(intent_3 );
            }
        });
        link_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_4 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.epa.gov/ground-water-and-drinking-water/national-primary-drinking-water-regulations"));
                startActivity(intent_4 );
            }
        });
        return v;
    }

}