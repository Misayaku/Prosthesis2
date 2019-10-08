package camille.berthelot.prosthesis.Controller;

/**
 *   Created by Camille Berthelot
 *   For the hand prosthesis project
 *   MIQ5 - 2019/2020
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import camille.berthelot.prosthesis.R;

public class MainActivity extends AppCompatActivity {

    // Variable declaration
    private TextView mTitleText;
    private TextView mGreetingtext;
    private TextView mSelectmodetext;
    private Button mUsermode;
    private Button mDebugmode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ID settings
        mTitleText = (TextView) findViewById(R.id.activity_main_header_text);
        mGreetingtext = (TextView) findViewById(R.id.activity_main_greeting_text);
        mSelectmodetext = (TextView) findViewById(R.id.activity_main_mode_choice_text);
        mUsermode = (Button) findViewById(R.id.activity_main_user_button);
        mDebugmode = (Button) findViewById(R.id.activity_main_debug_button);

        mUsermode.setEnabled(true);
        mDebugmode.setEnabled(true);

         mUsermode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Open User activity
                Intent userActivityIntent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(userActivityIntent);
            }
        });

        mDebugmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Open Debug activity
                Intent debugActivityIntent = new Intent(MainActivity.this, DebugActivity.class);
                startActivity(debugActivityIntent);
            }
        });




    }
}
