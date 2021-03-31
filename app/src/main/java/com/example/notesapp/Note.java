package com.example.notesapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Note implements Parcelable {
    private String noteBody;

    public Note(String noteBody){
        this.noteBody=noteBody;
    }
    protected Note(Parcel in) {
        noteBody = in.readString();
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(noteBody);
    }

    public String getNoteBody() {
        return noteBody;
    }
}