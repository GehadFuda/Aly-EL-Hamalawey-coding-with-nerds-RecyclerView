package com.example.moviesnerds.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesnerds.pojo.MovieModel;

import java.util.ArrayList;

public class MovieViewModel extends ViewModel {
    public MutableLiveData<ArrayList<MovieModel>> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName() {
        movieNameMutableLiveData.setValue(getMovieFromDatabase());
    }

    private ArrayList<MovieModel> getMovieFromDatabase() {
        ArrayList<MovieModel> arrayList =new ArrayList<>();
        arrayList.add(new MovieModel("cast away 1", "21-9-1996", "very sad movie", 1));
        arrayList.add(new MovieModel("cast away 2", "21-9-1996", "very sad movie", 2));
        arrayList.add(new MovieModel("cast away 3", "21-9-1996", "very sad movie", 3));
        arrayList.add(new MovieModel("cast away 4", "21-9-1996", "very sad movie", 4));
        return arrayList;
    }

}
