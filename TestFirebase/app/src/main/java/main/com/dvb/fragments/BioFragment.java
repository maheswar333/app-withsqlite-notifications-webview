package main.com.dvb.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import main.com.dvb.R;

/**
 * Created by SREEVATSAVA on 30-07-2016.
 */
public class BioFragment extends Fragment{

    private WebView text1,text2,text3;
    ArrayList<String> resultList = new ArrayList<>();

    public static BioFragment bioFragment;
    public BioFragment() {
        // Required empty public constructor
        bioFragment = BioFragment.this;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.bio_fragment, container, false);
        text1 = (WebView) view.findViewById(R.id.biographytext1);
        text2 = (WebView) view.findViewById(R.id.biographytext2);
        text3 = (WebView) view.findViewById(R.id.biographytext3);
        String bio1=getResources().getString(R.string.biography1);
        String bio2=getResources().getString(R.string.biography2);
        String bio3=getResources().getString(R.string.biography3);
        text1.loadData("<p style=\"text-align: justify\">"+ bio1 +"</p>", "text/html", "UTF-8");
        text2.loadData("<p style=\"text-align: justify\">"+ bio2 +"</p>", "text/html", "UTF-8");
        text3.loadData("<p style=\"text-align: justify\">"+ bio3 +"</p>", "text/html", "UTF-8");
        prepareList();
        return view;
    }

    public void prepareList(){
        for(int i =0;i<8;i++){
            resultList.add("Weekly "+i);
        }
    }

}
