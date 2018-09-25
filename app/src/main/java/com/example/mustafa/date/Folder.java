package com.example.mustafa.date;

import android.util.Log;

public class Folder {

    private int folder_ID;
    private String folderName;
    private CustomDate customDate;

    public Folder(CustomDate customDate) {
        this.customDate = customDate;
    }

    public Folder(int folder_ID, String folderName, CustomDate customDate) {
        this.folder_ID = folder_ID;
        this.folderName = folderName;
        this.customDate = customDate;

    }

    /**
     * Setter and Getter:
     */
    public int getFolder_ID() {
        return folder_ID;
    }

    public void setFolder_ID(int folder_ID) {
        // Important TODO:
        customDate.updateLastUpdateTime();

        this.folder_ID = folder_ID;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        // Important TODO:
        customDate.updateLastUpdateTime();

        this.folderName = folderName;
    }

    public CustomDate getCustomDate() {
        return customDate;
    }

    public void setCustomDate(CustomDate customDate) {
        // Important TODO:
        customDate.updateLastUpdateTime();

        this.customDate = customDate;
    }
}
