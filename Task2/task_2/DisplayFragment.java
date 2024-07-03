package com.example.task_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DisplayFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);

        TextView displayText = view.findViewById(R.id.display_text);
        if (getArguments() != null) {
            String text = getArguments().getString("inputText");
            displayText.setText(text);
        }

        return view;
    }
}

