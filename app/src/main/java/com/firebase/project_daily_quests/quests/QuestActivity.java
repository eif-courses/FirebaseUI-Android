package com.firebase.project_daily_quests.quests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.project_daily_quests.R;
import com.firebase.project_daily_quests.modes.ModesActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import butterknife.OnClick;

public class QuestActivity extends AppCompatActivity {
    private AdView mAdView;
    String[] mobileArray = {"Complete 5 bounties in 5 minutes.","Complete Act I in Hardcore mode Torment VI diffuculty","Spend 3000 blood shards!!!","Complete Greater rift 1 min. 30 sec.",
            "Craft ring with max stats, any quality.","Complete challenge mode using only single spell.","Login into diablo game and create new character any mode.","Complete bounties with 5 different classes."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        MobileAds.initialize(this,
//                "ca-app-pub-3940256099942544~3347511713");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.single_quest_list_item, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewQuests);
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    @OnClick(R.id.button4)
    public void openCategoryActivity(View view){
        Intent intent = new Intent(this, ModesActivity.class);
        startActivity(intent);
    }
}
