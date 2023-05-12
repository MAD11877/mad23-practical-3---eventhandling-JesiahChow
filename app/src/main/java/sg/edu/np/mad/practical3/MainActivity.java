package sg.edu.np.mad.practical3;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.net.UnknownServiceException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        User user = new User("Jesiah", "Hello");
        ToggleButton Follow = (ToggleButton)findViewById(R.id.button);
        Button message = findViewById(R.id.button2);
        Follow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged (CompoundButton Follow, boolean isChecked) {
                if (isChecked) {
                    Follow.setChecked(true);
                    String text = "Followed";
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();

                } else {
                    String text1 = "Unfollowed";
                    Follow.setChecked(false);
                    Toast.makeText(getApplicationContext(), text1, Toast.LENGTH_SHORT).show();
                }
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent clickIntent = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(clickIntent);
            }
        });
        randomInt();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
    }
    private void randomInt(){
        TextView text = findViewById(R.id.text1);
        text.setText("MAD " + getRandomNumber());
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "on start!!");


    }
    private int getRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(1000000000);
        return number;

    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG, "On Pause!!");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "Destroy!!");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG, "On Stop!!!");
    }
}

