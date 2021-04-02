package com.example.notesapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class FragmentViewAddNewNote extends Fragment {

    private TextInputLayout textNameNotes;
    private TextInputLayout textBodyNotes;
    private TextInputEditText editTextNoteName;
    private TextInputEditText editTextNoteBody;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_view_add_new_note, container, false);

        Button btnBack = view.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                fragmentManager.popBackStack();
                showToast("Переходим на назад!");
            }
        });
        Button btnSave = view.findViewById(R.id.btnSave);
        textNameNotes = (TextInputLayout) view.findViewById(R.id.notesNameTextInputLayout);
        textBodyNotes = (TextInputLayout) view.findViewById(R.id.notesBodyTextInputLayout);
        editTextNoteName = (TextInputEditText) view.findViewById(R.id.editTextNoteName);
        editTextNoteBody = (TextInputEditText) view.findViewById(R.id.editTextNoteBody);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (!(editTextNoteName.getText().toString().isEmpty()) && !(editTextNoteBody.getText().toString().isEmpty())) {
                //Note note = new Note(editTextNoteName.getText().toString(),editTextNoteBody.getText().toString());
                //showToast(editTextNoteBody.getText().toString());
/*                    FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new com.example.notesapp.FragmentButtonAddNotes());
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();*/
                //Toast.makeText(getActivity(), "Переходим на назад!", Toast.LENGTH_LONG).show();
                //}
            }
        });
        return view;
    }

    private void showToast(String msg){
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
