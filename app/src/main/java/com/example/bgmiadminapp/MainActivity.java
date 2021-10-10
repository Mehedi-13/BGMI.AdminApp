package com.example.bgmiadminapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.example.bgmiadminapp.delete.DeleteMatch_Fragment;
import com.example.bgmiadminapp.match.CreateMatch_Fragment;
import com.example.bgmiadminapp.upload.Upload_Fragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView create_MatchCard, uploadCard,deleteCard;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create_MatchCard=findViewById(R.id.create_matchCard);
        create_MatchCard.setOnClickListener(this);
        uploadCard=findViewById(R.id.uploadCard);
        uploadCard.setOnClickListener(this);
        deleteCard=findViewById(R.id.deleteCard);
        deleteCard.setOnClickListener(this);

        fragmentManager= getSupportFragmentManager();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.create_matchCard:
                CreateMatch_Fragment createMatch_fragment=new CreateMatch_Fragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,createMatch_fragment).addToBackStack("home").commit();
                break;

            case R.id.uploadCard:
                Upload_Fragment upload_fragment=new Upload_Fragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,upload_fragment).addToBackStack("home").commit();
                break;

            case R.id.deleteCard:
                DeleteMatch_Fragment deleteMatch_fragment=new DeleteMatch_Fragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,deleteMatch_fragment).addToBackStack("home").commit();
                break;
        }

    }
}