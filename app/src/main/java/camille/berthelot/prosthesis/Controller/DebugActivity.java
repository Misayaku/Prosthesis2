package camille.berthelot.prosthesis.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import camille.berthelot.prosthesis.R;

public class DebugActivity extends AppCompatActivity {

    private TextView mTitletext;
    private TextView mModetext;
    private Button mEmgbutton;
    private Button mHapticbutton;
    private Button mControlbutton;
    private Button mMechanicsbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        mTitletext = (TextView) findViewById(R.id.activity_debug_header_text);
        mModetext = (TextView) findViewById(R.id.activity_debug_mode_text);
        mEmgbutton = (Button) findViewById(R.id.activity_debug_emg_button);
        mHapticbutton = (Button) findViewById(R.id.activity_debug_Haptic_button);
        mControlbutton = (Button) findViewById(R.id.activity_debug_control_button);
        mMechanicsbutton = (Button) findViewById(R.id.activity_debug_mechanics_button);

        mEmgbutton.setEnabled(true);
        mHapticbutton.setEnabled(true);
        mControlbutton.setEnabled(true);
        mMechanicsbutton.setEnabled(true);

        mEmgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Open User activity
                Intent userActivityIntent = new Intent(DebugActivity.this, EmgActivity.class);
                startActivity(userActivityIntent);
            }
        });

        mHapticbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open User activity
                Intent userActivityIntent = new Intent(DebugActivity.this, HapticActivity.class);
                startActivity(userActivityIntent);
            }
        });

        mControlbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent controlActivityIntent = new Intent(DebugActivity.this, ControlActivity.class);
                startActivity(controlActivityIntent);
            }
        });

        mMechanicsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mechaActivityIntent = new Intent(DebugActivity.this, MechaActivity.class);
                startActivity(mechaActivityIntent);
            }
        });
    }
}
