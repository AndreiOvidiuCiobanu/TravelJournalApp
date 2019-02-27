package andreiovi.com.traveljournalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

//create a class ViewHolder that extends RecyclerView.ViewHolder
//this class is associated to the item

public class JourneyViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextViewTitle;
    public TextView mTextViewLocation;
    public ImageView mImageView;

    public JourneyViewHolder(@NonNull View itemView) {
        super(itemView);

        //get the items from the journey_item.xml
        mImageView = itemView.findViewById(R.id.imageview_picture);
        mTextViewLocation = itemView.findViewById(R.id.textview_location);
        mTextViewTitle = itemView.findViewById(R.id.textview_title);
    }

}
