package com.waywern.templateforvideostreamingfromyoutube;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;


/**
 * Created by slisovtsov on 9/29/2016.
 */
public class Template_For_Fragment_LiveStream extends Fragment {

    private Button mPlayButton;
    private Button mStopButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.template_for_fragment_livestream, parent, false);
        String vidAddress = "https://youtu.be/Gy5PC5Auoak?list=PLsrdvvUQRdC7bXS_RQb_XpW5JlmmT6oft";
        Uri vidUri = Uri.parse(vidAddress);
        VideoView vv = (VideoView)v.findViewById(R.id.videoView);

        vv.setVideoURI(vidUri);






        mPlayButton = (Button)v.findViewById(R.id.hellomoon_playButton);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayer.play(getActivity());
            }
        });
        mStopButton = (Button)v.findViewById(R.id.hellomoon_stopButton);
        mStopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayer.stop();
            }
        });
        return v;
    }
}
