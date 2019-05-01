package com.timmyg.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    private List<Crime> mCrimes;

    public static CrimeLab get (Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
    }

    public Crime getCrime (UUID id){
        for (Crime crime : mCrimes ){
            if (crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}