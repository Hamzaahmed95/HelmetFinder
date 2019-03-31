package secretworld.helmetfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    EditText emergencyNumberEditText;
    Button emergencyNumberButton;

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference DatabaseEmergencyNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emergencyNumberButton = (Button)findViewById(R.id.emergency_number_button);
        emergencyNumberEditText = (EditText) findViewById(R.id.emergency_number_input);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseEmergencyNumber = mFirebaseDatabase.getReference().child("DatabaseEmergencyNumber");
        emergencyNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emergencyNumber = "";
                emergencyNumber = emergencyNumberEditText.getText().toString();
                if(emergencyNumber.equals("") || emergencyNumber==null){
                    Toast.makeText(MainActivity.this,"Please enter emergency number",Toast.LENGTH_SHORT).show();
                }else{
                    DatabaseEmergencyNumber.push().setValue(emergencyNumberEditText.getText().toString());
                    Toast.makeText(MainActivity.this,"=>"+emergencyNumberEditText.getText().toString(),Toast.LENGTH_SHORT).show();
                    emergencyNumberEditText.setText("");
                    startActivity(new Intent(MainActivity.this, MapsActivity.class));
                    finish();
                }
            }
        });


    }
}
