package andreiovi.com.traveljournalapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TravelJournal extends AppCompatActivity {

    private EditText mEditTextTripTitle;
    private EditText getmEditTextDestination;
    private Button mButtonStart;
    private Button mButtonEnd;

    private ImageView mImageView;

    private static final int PERMISSION_REQUEST_CODE = 200;
    private static final int REQUEST_CODE = 1;

    private ImageView mImageViewTaken;
    private Bitmap mBitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_journal);

        mEditTextTripTitle = findViewById(R.id.edittext_triptitle);
        getmEditTextDestination = findViewById(R.id.edittext_destination);
        mButtonStart = findViewById(R.id.button_startdate);
        mButtonEnd = findViewById(R.id.button_enddate);

        mButtonStart.setText("irina");

    }


    /// take name location image and bookmark and add them to the main recyclerview
    public void btnSaveJourney(View view) {

        //TODO add trip in firebase
        // add trip in firebase
        // addTrip(Trip trip)
        finish();

        //////// ADDDDD TAKE ALL THE DATAAA
    }

    public void btnDatePickerOnClick(View view) {
        DialogFragment newFragment = new CustomDatePickerFragment();
        ((CustomDatePickerFragment) newFragment).setButton(mButtonStart);
        newFragment.show(getSupportFragmentManager(), "DatePicker");
        /*
        this.mButtonStart.setText = (Text(getActivity(), "The selected date is " + view.getYear() +
                    " / " + (view.getMonth() + 1) +
                    " / " + view.getDayOfMonth())
        }
        */
    }

    public void btnChoosePictureOnClick(View view) {
        Intent intent = new Intent(getApplicationContext(), CameraActivity.class);
        startActivity(intent);
    }


    public void btnTakePicture(View view) {
        Intent intent = new Intent(getApplicationContext(), TakePhotoActivity.class);
        startActivity(intent);
    }

}
