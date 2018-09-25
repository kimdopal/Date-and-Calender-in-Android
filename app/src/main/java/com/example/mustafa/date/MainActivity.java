package com.example.mustafa.date;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String TAG = "Main Activity";

    Button logBtn, logBtn2;

    Folder folder = new Folder(1,"New Folder",new CustomDate());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logBtn = findViewById(R.id.LOG);

        // to check Create Time
        Log.e(TAG, "Folder Details: \n id:"+ folder.getFolder_ID()+
                "\nName: "+folder.getFolderName()+
                "\n Create Time: "+folder.getCustomDate().getDateOfCreateAsString()+
                "\n LastUpdate Time: "+ folder.getCustomDate().getDateOfUpdateAsString()
        );
    }

    @Override
    public void onClick(View view) {

        int match = view.getId();

        switch (match){
            case R.id.LOG :
                printlog();
                break;
        }
    }



    private void printlog() {
        //to check on Update Time :
        folder.setFolderName("New Folder2");

        // to check Create Time
        Log.e(TAG, "Folder Details:\nName: "+folder.getFolderName()+
                "\n Create Time: "+folder.getCustomDate().getDateOfCreateAsString()+
                "\n LastUpdate Time: "+ folder.getCustomDate().getDateOfUpdateAsString()
        );
    }

}
