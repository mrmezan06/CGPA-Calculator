package com.mezan.kuetcsecgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.jaredrummler.materialspinner.MaterialSpinnerAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class SubjectActivity extends AppCompatActivity {

    ArrayList<String> year = new ArrayList<>();
    ArrayList<String> term = new ArrayList<>();
    MaterialSpinner yearSpinner,termSpinner ;
    Button showSub;
    MaterialSpinnerAdapter adapterYear,adapterTerm;
    int iy = -1;
    int it = -1;

    LinearLayout root;
    ListView subList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        yearSpinner = findViewById(R.id.yearSpinner);
        termSpinner = findViewById(R.id.termSpinner);
        showSub = findViewById(R.id.showSubBtn);
        root = findViewById(R.id.root);
        subList = findViewById(R.id.subList);

        adapterYear = new MaterialSpinnerAdapter(this,year);
        adapterTerm = new MaterialSpinnerAdapter(this,term);

        yearSpinner.setAdapter(adapterYear);
        termSpinner.setAdapter(adapterTerm);

        yearSpinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                iy = position;
            }
        });
        termSpinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                it = position;
            }
        });
        prepareDataForSpinner();
        prepareDataForSubArrayList();

        showSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subAdapter adapter = new subAdapter(oneoneCode,oneoneSub,oneoneCredit,getApplicationContext());
                subList.setAdapter(adapter);
                if (iy == -1){
                    Snackbar.make(root,"Year is not selected",Snackbar.LENGTH_LONG).show();
                }else if (it == -1){
                    Snackbar.make(root,"Term is not selected",Snackbar.LENGTH_LONG).show();
                }else {
                    if (iy == 0 && it == 0){
                        //11
                       adapter = new subAdapter(oneoneCode,oneoneSub,oneoneCredit,getApplicationContext());
                        subList.setAdapter(adapter);


                    }
                    if (iy == 0 && it == 1){
                        //12
                       adapter = new subAdapter(onetwoCode,onetwoSub,onetwoCredit,getApplicationContext());
                        subList.setAdapter(adapter);
                    }
                    if (iy == 1 && it == 0){
                        //21
                        adapter = new subAdapter(twooneCode,twooneSub,twooneCredit,getApplicationContext());
                        subList.setAdapter(adapter);

                    }
                    if (iy == 1 && it == 1){
                        //22
                       adapter = new subAdapter(twotwoCode,twotwoSub,twotwoCredit,getApplicationContext());
                        subList.setAdapter(adapter);
                    }
                    if (iy == 2 && it == 0){
                        //31
                        adapter = new subAdapter(threeoneCode,threeoneSub,threeoneCredit,getApplicationContext());
                        subList.setAdapter(adapter);
                    }
                    if (iy == 2 && it == 1){
                        //32
                        adapter = new subAdapter(threetwoCode,threetwoSub,threetwoCredit,getApplicationContext());
                        subList.setAdapter(adapter);
                    }
                    if (iy == 3 && it == 0){
                        //41
                        adapter = new subAdapter(fouroneCode,fouroneSub,fouroneCredit,getApplicationContext());
                        subList.setAdapter(adapter);
                    }
                    if (iy == 3 && it == 1){
                        //42
                        adapter = new subAdapter(fourtwoCode,fourtwoSub,fourtwoCredit,getApplicationContext());
                        subList.setAdapter(adapter);

                    }
                    adapter.notifyDataSetChanged();

                }
            }
        });
    }

    ArrayList<String> oneoneSub = new ArrayList<>();
    ArrayList<String> onetwoSub = new ArrayList<>();
    ArrayList<String> twooneSub = new ArrayList<>();
    ArrayList<String> twotwoSub = new ArrayList<>();
    ArrayList<String> threeoneSub = new ArrayList<>();
    ArrayList<String> threetwoSub = new ArrayList<>();
    ArrayList<String> fouroneSub = new ArrayList<>();
    ArrayList<String> fourtwoSub = new ArrayList<>();

    ArrayList<String> oneoneCode = new ArrayList<>();
    ArrayList<String> onetwoCode = new ArrayList<>();
    ArrayList<String> twooneCode = new ArrayList<>();
    ArrayList<String> twotwoCode = new ArrayList<>();
    ArrayList<String> threeoneCode = new ArrayList<>();
    ArrayList<String> threetwoCode = new ArrayList<>();
    ArrayList<String> fouroneCode = new ArrayList<>();
    ArrayList<String> fourtwoCode = new ArrayList<>();

    ArrayList<String> oneoneCredit = new ArrayList<>();
    ArrayList<String> onetwoCredit = new ArrayList<>();
    ArrayList<String> twooneCredit = new ArrayList<>();
    ArrayList<String> twotwoCredit = new ArrayList<>();
    ArrayList<String> threeoneCredit = new ArrayList<>();
    ArrayList<String> threetwoCredit = new ArrayList<>();
    ArrayList<String> fouroneCredit = new ArrayList<>();
    ArrayList<String> fourtwoCredit = new ArrayList<>();

    private void prepareDataForSubArrayList() {
       /*one one*/
       oneoneCode.add("CSE 1100");
       oneoneSub.add("Introduction to Computer Systems");
       oneoneCredit.add("1.50");

        oneoneCode.add("CSE 1107");
        oneoneSub.add("Discrete Mathematics");
        oneoneCredit.add("3.00");

        oneoneCode.add("EEE 1107");
        oneoneSub.add("Basic Electrical Engineering");
        oneoneCredit.add("3.00");

        oneoneCode.add("EEE 1108");
        oneoneSub.add("Basic Electrical Engineering Laboratory");
        oneoneCredit.add("1.50");

        oneoneCode.add("HUM 1107");
        oneoneSub.add("English and Human Communication");
        oneoneCredit.add("3.00");

        oneoneCode.add("HUM 1108");
        oneoneSub.add("English Skills Laboratory");
        oneoneCredit.add("0.75");

        oneoneCode.add("MATH 1107");
        oneoneSub.add("Differential and Integral Calculus");
        oneoneCredit.add("3.00");

        oneoneCode.add("PHY 1107");
        oneoneSub.add("Physics");
        oneoneCredit.add("3.00");

        oneoneCode.add("PHY 1108");
        oneoneSub.add("Physics Laboratory");
        oneoneCredit.add("1.50");

       /* one two */
        onetwoSub = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.onetwoSub)));
        onetwoCode = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.onetwoCode)));
        onetwoCredit = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.onetwoCredit)));

        /* two one */
        twooneCode = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.twooneCode)));
        twooneCredit = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.twooneCredit)));
        twooneSub = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.twooneSub)));

        /* two two */
        twotwoCode = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.twotwoCode)));
        twotwoCredit = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.twotwoCredit)));
        twotwoSub = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.twotwoSub)));

        /*three one */
        threeoneCode = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.threeoneCode)));
        threeoneCredit = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.threeoneCredit)));
        threeoneSub = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.threeoneSub)));
        /* three two */
        threetwoCode = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.threetwoCode)));
        threetwoCredit = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.threetwoCredit)));
        threetwoSub = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.threetwoSub)));
        /* four one */
        fouroneCode = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.fouroneCode)));
        fouroneCredit = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.fouroneCredit)));
        fouroneSub = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.fouroneSub)));
        /*four two*/
        fourtwoCode = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.fourtwoCode)));
        fourtwoCredit = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.fourtwoCredit)));
        fourtwoSub = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.fourtwoSub)));
    }

    private void prepareDataForSpinner() {
        if (year.isEmpty()){
            year.add("1st");
            year.add("2nd");
            year.add("3rd");
            year.add("4th");
        }
        if (term.isEmpty()){
            term.add("1st");
            term.add("2nd");
        }

        adapterYear.notifyDataSetChanged();
        adapterTerm.notifyDataSetChanged();

        yearSpinner.setSelectedIndex(0);
        termSpinner.setSelectedIndex(0);
    }
}
