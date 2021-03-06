/*package com.example.alex_.hrcommunity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteEventFragment extends Fragment {
    private EditText deleteId;
    private Button deleteButton;

    public DeleteEventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_event, container, false);

        deleteId = view.findViewById(R.id.delete_id);
        deleteButton = view.findViewById(R.id.delete);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = Integer.parseInt(deleteId.getText().toString());

                Events events = new Events();
                events.setId(id);

                MainActivity.myAppDatabase.myDao().deleteEvent(events);

                Toast.makeText(getActivity(), "Events succesfully removed",Toast.LENGTH_SHORT).show();
                deleteId.setText("");

            }
        });
        return view;
    }

}
*/