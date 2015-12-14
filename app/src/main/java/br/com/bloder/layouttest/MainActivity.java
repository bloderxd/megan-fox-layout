package br.com.bloder.layouttest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.toolbar_layout)
public class MainActivity extends AppCompatActivity {

    @ViewById protected MaterialViewPager videoList;

    @AfterViews
    protected void afterViews(){
        videoList.getViewPager().setAdapter(new ChannelsFragmentAdapter(getSupportFragmentManager()));
        videoList.getPagerTitleStrip().setViewPager(videoList.getViewPager());
        setupMeganFoxHeader();
        setupToolbar();
    }

    public void setupMeganFoxHeader(){
        videoList.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {

                return HeaderDesign.fromColorResAndUrl(
                        R.color.red,
                        "http://www.lovethispic.com/uploaded_images/34789-Megan-Fox.jpg");
            }
        });
    }

    public void setupToolbar(){
        Toolbar toolbar = videoList.getToolbar();

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayUseLogoEnabled(false);
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
