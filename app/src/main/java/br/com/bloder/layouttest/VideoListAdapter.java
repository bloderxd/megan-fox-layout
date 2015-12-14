package br.com.bloder.layouttest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.InternalViewHolder> {

    private Context context;

    public VideoListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public InternalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_layout, parent, false);
        return new InternalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InternalViewHolder holder, int position) {}

    @Override
    public int getItemCount() {
        return 20;
    }

    public class InternalViewHolder extends RecyclerView.ViewHolder {
        public InternalViewHolder(View view) {
            super(view);
        }
    }
}
