package andreiovi.com.traveljournalapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TripFragment extends Fragment {

    private boolean isFavourite;

    FirebaseStorage storage = FirebaseStorage.getInstance();

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    private RecyclerView mRecyclerViewJourneys;

    public TripFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_travel_journal_recycler, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mRecyclerViewJourneys = view.findViewById(R.id.recyclerview_journeys);

        //set the layout manager for the current recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerViewJourneys.setLayoutManager(layoutManager);

        //create the adapter
        JourneyAdapter journeyAdapter = new JourneyAdapter(getJourneysList());

        //set the adapter to the recycler view
        mRecyclerViewJourneys.setAdapter(journeyAdapter);

    }

    private void initFirestore() {
    }

    private List<Journey> getJourneysList() {

        List<Journey> journeys = new ArrayList<>();
        if(isFavourite) {
            //TODO iei lista de favorite din room
        } else {
            //TODO get trips from firebase
        }


        Journey j1 = new Journey("Holiday 2017", "Islands","https://croatia.hr/sites/default/files/styles/image_full_width/public/2017-08/02_slide_fs_02_1_0.jpg?itok=FcSOjcLI");
        Journey j2 = new Journey("Fall 2017", "Rome","https://cdn.britannica.com/s:300x300/46/154246-004-FB19BEB7.jpg");
        Journey j3 = new Journey("Summer 2017", "London","https://tiptrip.ro/wp-content/uploads/2017/12/londra1.jpg");
        Journey j4 = new Journey("Winter 2017", "Paris", "https://www.telegraph.co.uk/content/dam/Travel/hotels/europe/france/paris/paris-cityscape-overview-guide.jpg?imwidth=1400");
        Journey j5 = new Journey("Spring 2017", "San Francisco","https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2018/06/20/105284147-GettyImages-673632588.1910x1000.jpg?v=1529508124");
        Journey j6 = new Journey("Summer 2017", "Berlin","https://d2bgjx2gb489de.cloudfront.net/gbb-blogs/wp-content/uploads/2016/11/24111943/Berlin-city-view-870x400.jpg");

        journeys.add(j1);
        journeys.add(j2);
        journeys.add(j3);
        journeys.add(j4);
        journeys.add(j5);
        journeys.add(j6);

        return journeys;

    }

}
