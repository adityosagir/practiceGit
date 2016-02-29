package com.example.asagir.oscars;

/**
 * Created by User_1_Benjamin_Rosenthal on 2/29/16.
 */
public class Actor {

    private String mName;
    private String mDOB;
    private int mOscarsWon;

    public Actor(String name, String DOB, String oscarsWon) {
        mName = name;
        mDOB = DOB;
        mOscarsWon = oscarsWon;
    }


    public String getDOB() {
        return mDOB;
    }

    public void setDOB(String DOB) {
        mDOB = DOB;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getOscarsWon() {
        return mOscarsWon;
    }

    public void setOscarsWon(String oscarsWon) {
        mOscarsWon = oscarsWon;
    }


}
