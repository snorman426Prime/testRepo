package com.company.bucky23;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class BottomPictureFragment extends Fragment
{

    private static TextView topMemeText, bottomMemeText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.bottom_picture_fragment,
                container, false);

        topMemeText = view.findViewById(R.id.topMemeText);
        bottomMemeText = view.findViewById(R.id.bottomMemeText);
        
        return view;
    }

    public void setMemeText(String top, String bottom)
    {
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
