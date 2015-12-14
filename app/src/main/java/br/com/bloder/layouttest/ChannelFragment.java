package br.com.bloder.layouttest;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.WindowManager;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.florent37.materialviewpager.adapter.RecyclerViewMaterialAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

@EFragment(R.layout.fragment_layout)
public class ChannelFragment extends Fragment {

    @ViewById protected RecyclerView videoListExample;

    @AfterViews
    protected void createAdapterViews(){
        videoListExample.setLayoutManager(new LinearLayoutManager(getActivity()));
        videoListExample.setHasFixedSize(false);
        videoListExample.setAdapter(new RecyclerViewMaterialAdapter(new VideoListAdapter(getActivity())));
        registerRecycler();
    }

    @Background
    protected void registerRecycler(){
        MaterialViewPagerHelper.registerRecyclerView(getActivity(), videoListExample, null);
    }
}
