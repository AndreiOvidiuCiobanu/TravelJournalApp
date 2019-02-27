package andreiovi.com.traveljournalapp;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;



//    private EditText mEditTextEmail;
//    private EditText mEditTextPhone;
//    private CheckBox mCheckBoxAccept;
//    private TextView mTextViewResult;
//    //datele pe care le am ...ce gen de date fol
//    private Authentication mAuthentication;
//    // Firebase instance variables
//    private FirebaseAuth mFirebaseAuth;
//    private static final int RC_SIGN_IN = 9001;
//    private GoogleApiClient mGoogleApiClient;
//
//    private GoogleSignInClient  mGoogleSignInClient;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        //mAuthentication = new Authentication();
//
//        // Initialize FirebaseAuth
//        // mFirebaseAuth = FirebaseAuth.getInstance();
//        initView();
//
//        findViewById(R.id.sign_in_button).setOnClickListener(this);
//        initLoginGoogle();
//    }
//
//    private void initView() {
//        mEditTextEmail = findViewById(R.id.edittext_email);
//        mEditTextPhone = findViewById(R.id.edittext_phone);
//        mCheckBoxAccept = findViewById(R.id.checkbox_accept);
//        mTextViewResult = findViewById(R.id.textview_result);
//    }
//
//    private boolean isEmailValid() {
//        String email = mEditTextEmail.getText().toString();
//        if (EmailHelper.isEmailValid(email)) {
//            //ma folosesc de UTIL -> clasa cu functii speciale
//            mAuthentication.setEmail(email);
//            return true;
//        } else {
//            mEditTextEmail.setError(getResources().getString(R.string.error_email_input));
//            return false;
//        }
//    }

//    public void btnSubmitOnClick() {
//        if (isEmailValid()) {
//            //                signIn();
//
//            Intent newIntent = new Intent(getApplicationContext(), NavigationDrawerActivity.class);
//            //newIntent.putExtra(MESSAGE, name);
//            startActivity(newIntent);
//        }
//    }

//    private void signIn() {
//        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
//        startActivityForResult(signInIntent, RC_SIGN_IN);
//    }
//
//    public void btnSubmitOnClick(View view) {
//        if (isEmailValid()) {
//            //                signIn();
//
//            Intent newIntent = new Intent(getApplicationContext(), NavigationDrawerActivity.class);
//            //newIntent.putExtra(MESSAGE, name);
//            startActivity(newIntent);
//        }
//    }
//
//
//    public void buildActionCodeSettings() {
//        ActionCodeSettings actionCodeSettings =
//                ActionCodeSettings.newBuilder()
//                        // URL you want to redirect back to. The domain (www.example.com) for this
//                        // URL must be whitelisted in the Firebase Console.
//                        .setUrl("https://traveljournalapp.page.link/47bd")
//                        // This must be true
//                        .setHandleCodeInApp(true)
//                        .setIOSBundleId("com.example.ios")
//                        .setAndroidPackageName(
//                                "com.example.android",
//                                true, /* installIfNotAvailable */
//                                "12"    /* minimumVersion */)
//                        .build();
//    }
//
//    public void sendSignInLink(String email, ActionCodeSettings actionCodeSettings) {
//        FirebaseAuth auth = FirebaseAuth.getInstance();
//        auth.sendSignInLinkToEmail(email, actionCodeSettings)
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        if (task.isSuccessful()) {
//                            Log.d("TAG", "EmailSent");
//                        }
//                    }
//                });
//    }
//
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
//        if (requestCode == RC_SIGN_IN) {
//            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
//            if (result.isSuccess()) {
//                // Google Sign-In was successful, authenticate with Firebase
//                GoogleSignInAccount account = result.getSignInAccount();
//                firebaseAuthWithGoogle(account);
//            } else {
//                // Google Sign-In failed
//                Log.e("ceva", "Google Sign-In failed.");
//            }
//        }
//    }
//
//    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
//        Log.d("", "firebaseAuthWithGooogle:" + acct.getId());
//        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
//        mFirebaseAuth.signInWithCredential(credential)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Log.d("", "signInWithCredential:onComplete:" + task.isSuccessful());
//
//                        // If sign in fails, display a message to the user. If sign in succeeds
//                        // the auth state listener will be notified and logic to handle the
//                        // signed in user can be handled in the listener.
//                        if (!task.isSuccessful()) {
//                            Log.w("", "signInWithCredential", task.getException());
//                            Toast.makeText(LoginActivity.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//                        } else {
//                            startActivity(new Intent(LoginActivity.this, NavigationDrawerActivity.class));
//                            finish();
//                        }
//                    }
//                });
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.sign_in_button:
//                signInWithGoogle();
//                break;
//            // ...
//        }
//    }
//
//    private void initLoginGoogle() {
////        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
////                .requestIdToken("129634743003-eik1botpg9c930e9jm35i1rv41k08l1c.apps.googleusercontent.com")
////                .requestEmail()
////                .build();
////
////        mGoogleSignInClient = GoogleSignIn.getClient(LoginActivity.this, gso);
////        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
//
//
//    }
//
//    private void signInWithGoogle() {
//        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
//        startActivityForResult(signInIntent, RC_SIGN_IN);
//    }
//}

//public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
//    public class Logging {
//        public static void show(Object obj, String message) {
//            if (BuildConfig.DEBUG) {
//                Log.e(obj.getClass().getName(), message);
//            }
//        }
//    }
//}