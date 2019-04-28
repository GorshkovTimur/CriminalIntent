package com.timmyg.criminalintent;

import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitile;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitile() {
        return mTitile;
    }

    public void setTitile(String mTitile) {
        this.mTitile = mTitile;
    }
}
