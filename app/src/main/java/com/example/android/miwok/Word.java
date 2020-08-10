package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String miwok_translation="";
    private String english_translation="";
    private int image_resource_id=0;
    private int audio_resource_id=0;


    Word(String miwok_translation,String english_translation,int audio_resource_id)
    {
        this.miwok_translation=miwok_translation;
        this.english_translation=english_translation;
        this.audio_resource_id=audio_resource_id;
    }
    Word(String miwok_translation,String english_translation,int image_resource_id,int audio_resource_id)
    {
        this.miwok_translation=miwok_translation;
        this.english_translation=english_translation;
        this.image_resource_id=image_resource_id;
        this.audio_resource_id=audio_resource_id;
    }
    public int getImage_resource_id()
    {
        return image_resource_id;
    }
    public int getAudio_resource_id()
    {
        return audio_resource_id;
    }
    public String getMiwokTranslation()
    {
        return miwok_translation;
    }
    public String getEnglishTranslation(){return english_translation;}
}
