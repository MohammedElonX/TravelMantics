package com.example.travelmantics;

import android.app.Activity;
import android.widget.Adapter;
import android.widget.Toast;

/*import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;*/
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FirebaseUtil {
    public static FirebaseStorage mStorage;
    public static StorageReference mStorageRef;
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtil firebaseUtil;
    ///public static FirebaseAuth mFirebaseAuth;
    ///public static FirebaseAuth.AuthStateListener mAuthListener;
    public static ArrayList<holidayDeal> mDeals;
   /* private static final int RC_SIGN_IN = 123;
    private static Activity caller;*/

    private FirebaseUtil(){}
    public static void openFbReference(String ref){  ///}), final Activity callerActivity){
        if (firebaseUtil == null){
            firebaseUtil = new FirebaseUtil();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
           /* mFirebaseAuth = FirebaseAuth.getInstance();
            caller = callerActivity;
            mAuthListener = new FirebaseAuth.AuthStateListener() {

                @Override
                public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                    if (firebaseAuth.getCurrentUser() == null){
                    FirebaseUtil.signIn();}
                    Toast.makeText(callerActivity.getBaseContext(), "Welcome Back", Toast.LENGTH_LONG).show();
                }
            };*/
           connectStorage();
        }
        mDeals = new ArrayList<holidayDeal>();
        mDatabaseReference = mFirebaseDatabase.getReference().child(ref);
        ///connectStorage();
    }

    /*private static void signIn(){
        // Choose authentication providers
        List<AuthUI.IdpConfig> providers = Arrays.asList(
                new AuthUI.IdpConfig.EmailBuilder().build(),
                ///  new AuthUI.IdpConfig.PhoneBuilder().build(),
                new AuthUI.IdpConfig.GoogleBuilder().build());
// Create and launch sign-in intent
        caller.startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .build(),
                RC_SIGN_IN);
    }*/

   /* public static void attachListener(){
        mFirebaseAuth.addAuthStateListener(mAuthListener);
    }

    public static void detachListener(){
        mFirebaseAuth.removeAuthStateListener(mAuthListener);
    }*/

   public static void connectStorage(){
       mStorage = FirebaseStorage.getInstance();
       mStorageRef = mStorage.getReference().child("deals_picture");
   }
}
