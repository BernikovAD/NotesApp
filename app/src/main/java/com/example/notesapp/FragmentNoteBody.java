package com.example.notesapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentNoteBody extends Fragment {

    public static final String ARG_NOTE = "note";
    private Note note;

    public FragmentNoteBody() {
    }

    public static FragmentNoteBody newInstance(Note note) {
        FragmentNoteBody f = new FragmentNoteBody();
        Bundle args = new Bundle();
        args.putParcelable(ARG_NOTE, note);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            note = getArguments().getParcelable(ARG_NOTE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_note_body, container, false);
        TextView noteNameView = view.findViewById(R.id.textView);
        noteNameView.setText(note.getNoteBody());
        return view;
    }
}