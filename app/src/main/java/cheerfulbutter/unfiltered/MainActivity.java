package cheerfulbutter.unfiltered;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(
//            new BottomNavigationView.OnNavigationItemSelectedListener() {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                    switch (item.getItemId()) {
//                        case R.id.menu_map:
//                            // TODO
//                            return true;
//                        case R.id.menu_currentLocation:
//                            // TODO
//                            return true;
//                        case R.id.menu_additionalInformation:
//                            // TODO
//                            return true;
//                    }
//                    return false;
//                }
//            });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.action_bar_button, menu);
        Button btn = (Button)findViewById(R.id.information_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, information.class));
            }
        });
        return true;
    }

}
