package cl.individual.images;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.squareup.picasso.Picasso;

import cl.individual.images.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Picasso.get().load("https://i.pinimg.com/originals/6b/28/d7/6b28d7fb925370efd08537f2cf29be78.png").into(binding.imageView);
    }
}