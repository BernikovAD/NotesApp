package com.example.notesapp;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FragmentButtonAddNewNote extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button_add_new_note, container, false);
        FloatingActionButton fab = view.findViewById(R.id.addNotes);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                    fragmentTransaction.replace(R.id.FrameLayoutNoteBody, new FragmentViewAddNewNote());
                }
                else{
                    fragmentTransaction.replace(R.id.fragment_notes, new FragmentViewAddNewNote());
                }
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                Toast.makeText(getActivity(), "Переходим на фрагмент добавления заметки!",   Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}