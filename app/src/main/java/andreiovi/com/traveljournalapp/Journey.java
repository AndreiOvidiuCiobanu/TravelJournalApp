package andreiovi.com.traveljournalapp;

import java.util.HashMap;
import java.util.Map;

public class Journey {
    private String mTitle;
    private String mLocation;
    private String mPicture;
    private boolean mIsFavourite;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    public boolean ismIsFavourite() {
        return mIsFavourite;
    }

    public void setmIsFavourite(boolean mIsFavourite) {
        this.mIsFavourite = mIsFavourite;
    }

    public Journey(String mTitle, String mLocation, String mPicture) {
        this.mTitle = mTitle;
        this.mLocation = mLocation;
        this.mPicture = mPicture;
    }
    public void add (String mTitle, String mLocation, String mPicture) {
        this.mTitle = mTitle;
        this.mLocation = mLocation;
        this.mPicture = mPicture;
    }


}
