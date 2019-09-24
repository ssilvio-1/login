package com.example.login_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OutstandingRequestsActivity extends AppCompatActivity {

    int tot_requests = 0;
    String next_appointment = "NO UPCOMING" + "\n" + "APPOINTMENTS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outstanding_requests);

        final TextView counter_requests = (TextView) findViewById(R.id.request_counter);
        final TextView branch_appointment = (TextView) findViewById(R.id.branch_appointment);

        counter_requests.setText(Integer.toString(tot_requests));
        branch_appointment.setText(next_appointment);

    }
}
