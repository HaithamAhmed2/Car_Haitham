package com.example.task_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        EditText editText = view.findViewById(R.id.edit_text);
        Button sendButton = view.findViewById(R.id.send_button);

        sendButton.setOnClickListener(v -> {
            String text = editText.getText().toString();
            if (text.isEmpty()) {
                Snackbar.make(view, "Для отправки текста требуется заполнить поле", Snackbar.LENGTH_SHORT).show();
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("inputText", text);
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_homeFragment_to_displayFragment, bundle);
            }
        });

        return view;
    }
}