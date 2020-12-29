# Aly-EL-Hamalawey-coding-with-nerds-RecyclerView
Recycler Adapter Template 

#if(${PACKAGE_NAME}&&${PACKAGE_NAME}!="")package ${PACKAGE_NAME};#end

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesnerds.R;
import com.example.moviesnerds.pojo.${Model_Name};

import java.util.ArrayList;

public class ${NAME} extends RecyclerView.Adapter<${NAME}.${ViewHolder_Name}> {
    private ArrayList<${Model_Name}> moviesList = new ArrayList<>();
    @NonNull
    @Override
    public ${ViewHolder_Name} onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ${ViewHolder_Name}(LayoutInflater.from(parent.getContext()).inflate(R.layout.${item_Name}, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ${ViewHolder_Name} holder, int position) {
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void setList(ArrayList<${Model_Name}> moviesList){
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }

    public class ${ViewHolder_Name} extends RecyclerView.ViewHolder {
        public ${ViewHolder_Name}(@NonNull View itemView) {
            super(itemView);
        }
    }
}
