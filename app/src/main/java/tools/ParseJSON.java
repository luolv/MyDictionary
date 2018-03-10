package tools;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by luolv on 2018/3/10.
 */

public class ParseJSON {
    static public void parseJson(String json){
        Gson gson = new Gson();
        Log.d("hehe", json);
//        List<Word> wordList = gson.fromJson(json, new TypeToken<List<Word>>()
//                                {}.getType());
//        for (Word word : wordList){
//            Log.d("mainactivity", "name is" + word.getWord_name());
//            Log.d("mainactivity", "ph_an" + word.getPh_an());
//        }
    }
}
