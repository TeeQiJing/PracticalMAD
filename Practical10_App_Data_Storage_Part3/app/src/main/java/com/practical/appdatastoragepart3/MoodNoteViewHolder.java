package com.practical.appdatastoragepart3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class MoodNoteViewHolder extends RecyclerView.ViewHolder {
    private final TextView noteDate;
    private final TextView noteContent;
    private final ImageView noteMood;
    private final ImageView noteDayNight;

    private MoodNoteViewHolder(View itemView) {
        super(itemView);

        noteDate = itemView.findViewById(R.id.TVDateContent);
        noteContent = itemView.findViewById(R.id.TVNoteContent);
        noteMood = itemView.findViewById(R.id.IVMood);
        noteDayNight = itemView.findViewById(R.id.IVDayNight);
    }

    public void bind(String date, int mood, boolean daynight, String note) {
        noteDate.setText(date);
        noteContent.setText(note);
        if (mood == 1)
            noteMood.setImageResource(R.drawable.ic_love);
        else if (mood == 2)
            noteMood.setImageResource(R.drawable.ic_satisfied);
        else
            noteMood.setImageResource(R.drawable.ic_dissatisfied);

        if (daynight == true)
            noteDayNight.setImageResource(R.drawable.ic_sun);
        else
            noteDayNight.setImageResource(R.drawable.ic_moon);
    }

    static MoodNoteViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.individual_item_view, parent, false);
        return new MoodNoteViewHolder(view);
    }
}