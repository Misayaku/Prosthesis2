package camille.berthelot.prosthesis.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import camille.berthelot.prosthesis.R;

public class UserActivity extends AppCompatActivity {

    // Variable declaration
    private TextView mTitletext;
    private TextView mModetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mTitletext = (TextView) findViewById(R.id.activity_user_header_text);
        mModetext = (TextView) findViewById(R.id.activity_user_mode_text);
    }
}
