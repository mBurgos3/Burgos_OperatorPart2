package mcm.edu.ph.burgos_operatorspart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.context);


        int birthYear = 2002;
        int birthMonth = 12;
        int birthDay = 6;

        int currentYear = 2021;
        int currentMonth = 4;
        int currentDay = 16;

        int ageInYears, ageInMonths, ageInDays;

        if (birthMonth > currentMonth) {
            currentMonth += 12;
            currentYear -= 1;
        }

        if (birthDay > currentDay) {
            currentDay += 30;
            currentMonth -= 1;

        }

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("The Time that I've been on this Earth is\b" + String.valueOf(ageInYears)+"\bYears, \b" + String.valueOf(ageInMonths) + "\bMonths and\b" + String.valueOf(ageInDays) + "\bDays");
    }
    }