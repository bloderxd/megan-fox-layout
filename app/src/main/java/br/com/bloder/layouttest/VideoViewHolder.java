package br.com.bloder.layouttest;


import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import org.androidannotations.annotations.EViewGroup;

@EViewGroup(R.layout.video_layout)
public class VideoViewHolder extends LinearLayout {

    public VideoViewHolder(Context context) {
        super(context);
    }

    public void bind(){

    }
}
