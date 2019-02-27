package andreiovi.com.traveljournalapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

//create a class that extends RecyclerView.Adapter<GiftViewHolder>
public class JourneyAdapter extends  RecyclerView.Adapter<JourneyViewHolder>  {

    private List<Journey> mJourneys;

    public JourneyAdapter(List<Journey> mJourneys) {
        this.mJourneys = mJourneys;
    }

    @NonNull
    @Override
    public JourneyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View journeyview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.journey_item, viewGroup,false);

        return new JourneyViewHolder(journeyview);
    }

    @Override
    public void onBindViewHolder(@NonNull JourneyViewHolder journeyViewHolder, int i) {
        Journey journey = mJourneys.get(i);
        journeyViewHolder.mTextViewTitle.setText(journey.getmTitle());
        journeyViewHolder.mTextViewLocation.setText(journey.getmLocation());

        //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(journeyViewHolder.mImageView);
        Picasso.get().load(journey.getmPicture()).into(journeyViewHolder.mImageView);

        //TODO verificare is favourite
        if(journey.ismIsFavourite()) {
            // buttonul se umple
            // set background diferit
        } else {
            //buton este empty
        }
    }

    @Override
    public int getItemCount() {
        return mJourneys.size();
    }
}
