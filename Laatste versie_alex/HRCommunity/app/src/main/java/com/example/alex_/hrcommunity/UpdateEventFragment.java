package com.example.alex_.hrcommunity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateEventFragment extends Fragment {

    private EditText Titel, Start_tijd, Eind_tijd, Datum;
    private Button Opslaan;

    public UpdateEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_update_event, container, false);

        Titel = view.findViewById(R.id.titel);
        Start_tijd = view.findViewById(R.id.start_tijd);
        Eind_tijd = view.findViewById(R.id.eind_tijd);
        Datum = view.findViewById(R.id.datum);

        Opslaan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String titel = Titel.getText().toString();
                String start_tijd = Start_tijd.getText().toString();
                String eind_tijd = Eind_tijd.getText().toString();
                String datum = Datum.getText().toString();

                Events events = new Events();
                events.setTitel(titel);
                events.setStart_tijd(start_tijd);
                events.setEind_tijd(eind_tijd);
                events.setDatum(titel);

                MainActivity.myAppDatabase.myDao().updateEvent(events);

                Toast.makeText(getActivity(), "Events succesfully updated",Toast.LENGTH_SHORT).show();
                Titel.setText("");
                Start_tijd.setText("");
                Eind_tijd.setText("");
                Datum.setText("");

            }
        });
        return view;

    }

}