package treehut.togglebtn2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton toggleBtn = (ToggleButton) findViewById(R.id.toggleButton);

        toggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){//YOU CAN ADD ANY CODE HERE.TOAST IS USED JUST FOR EXAMPLE
                    Toast.makeText(getApplicationContext(),"ADD YOUR REQUIRED CODE INSTEAD OF TOAST", Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(getApplicationContext(),"USE TOGGLE BUTTON AS PER YOUR NEED", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}//run
