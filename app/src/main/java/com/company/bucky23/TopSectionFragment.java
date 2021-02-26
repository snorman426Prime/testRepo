package com.company.bucky23;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;


public class TopSectionFragment extends Fragment
{

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    //A user-defined (bucky) INTERFACE follows!
    TopSectionListener activityCommander;
    public interface TopSectionListener
    {
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);

        try
        {
            activityCommander = (TopSectionListener) activity;
        }catch(ClassCastException e)
        {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,
                container, false);


        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);

        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    private void buttonClicked(View v)
    {
        activityCommander.createMeme(topTextInput.getText().toString()
                , bottomTextInput.getText().toString());
    }
}
