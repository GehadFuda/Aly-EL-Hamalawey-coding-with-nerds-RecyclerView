package com.example.moviesnerds.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.moviesnerds.R;
import com.example.moviesnerds.databinding.ActivityMainBinding;
import com.example.moviesnerds.pojo.MovieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);

        binding.setViewModel(movieViewModel);
        MovieListAdapter adapter = new MovieListAdapter();
        binding.recycler.setAdapter(adapter);
        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<ArrayList<MovieModel>>() {
            @Override
            public void onChanged(ArrayList<MovieModel> movieModels) {
                adapter.setList(movieModels);
            }
        });
        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        binding.setLifecycleOwner(this);
    }
}