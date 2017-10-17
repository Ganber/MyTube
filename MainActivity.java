package com.example.erana.mytube;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private String mDisplayVideoName;
    private ListView mVideoListView;
    private DatabaseReference mDatabaseReference;
    //TODO: private VideoListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupDisplayName();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference();

        mVideoListView = (ListView) findViewById(R.id.video_list_view);
    }

    private void setupDisplayName() {

        SharedPreferences prefs = getSharedPreferences(RegisterActivity.CHAT_PREFS, MODE_PRIVATE);
        //TODO: get the video display name instead
        //mDisplayVideoName = prefs.getString(RegisterActivity.DISPLAY_NAME_KEY, null);

        if (mDisplayVideoName == null)
            mDisplayVideoName = "Unknown";
    }


    @Override
    public void onStart(){
        super.onStart();

        //mAdapter = new VideoListAdapter(this, mDatabaseReference, mDisplayName);
        //mChatListView.setAdapter(mAdapter);
    }

    @Override
    public void onStop() {
        super.onStop();

        //mAdapter.cleanUp();
    }
}

