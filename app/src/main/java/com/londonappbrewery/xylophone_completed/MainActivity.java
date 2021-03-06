package com.londonappbrewery.xylophone_completed;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Member Variables
    SoundPool mSoundPool;
    int mCSoundId;
    int mDSoundId;
    int mESoundId;
    int mFSoundId;
    int mGSoundId;
    int mASoundId;
    int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         	Updated way to create a SoundPool for API levels newer than Android Lollipop
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            mSoundPool = new SoundPool.Builder()
//                    .setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS)
//                    .build();
//        } else {
//            // Deprecated way of creating a SoundPool before Android API 21.
//            mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
//        }

        mSoundPool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);


        // Get the resource IDs to identify the sounds and store them in variables
        mCSoundId=mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId=mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId=mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId=mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId=mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mBSoundId=mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
        mASoundId=mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);

    }

    // Individual methods linked to onClick properties in the XML layout file

    public void playA(View v){
        Log.d("test","workinnng");
        mSoundPool.play(mASoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playB(View v){
        Log.d("test","workinnng");
        mSoundPool.play(mBSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playC(View v){
        Log.d("test","workinnng");
        mSoundPool.play(mCSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playD(View v){
        Log.d("test","workinnng");
        mSoundPool.play(mDSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playE(View v){
        Log.d("test","workinnng");
        mSoundPool.play(mESoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playF(View v){
        Log.d("test","workinnng");
        mSoundPool.play(mFSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playG(View v){
        Log.d("test","workinnng");
        mSoundPool.play(mGSoundId,1.0f,1.0f,0,0,1.0f);

    }

}
