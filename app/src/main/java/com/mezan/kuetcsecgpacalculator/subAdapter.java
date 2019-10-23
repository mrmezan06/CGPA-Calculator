package com.mezan.kuetcsecgpacalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class subAdapter extends BaseAdapter {



    ArrayList<String>Code,Sub,Credit = new ArrayList<>();
    Context context;
    public  subAdapter(){

    }
    public subAdapter( ArrayList<String>Code , ArrayList<String>Sub, ArrayList<String>Credit,Context context){
       this.Code = Code;
       this.Sub = Sub;
       this.Credit = Credit;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Code.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup root) {
        view= LayoutInflater.from(context).inflate(R.layout.sublayout,root,false);
        TextView txtSub,txtCode,txtCredit;
        txtSub = view.findViewById(R.id.itemSub);
        txtCode = view.findViewById(R.id.itemCode);
        txtCredit = view.findViewById(R.id.itemCredit);

        txtCode.setText(Code.get(i));
        txtCredit.setText(Credit.get(i));
        txtSub.setText(Sub.get(i));

        return view;
    }
}