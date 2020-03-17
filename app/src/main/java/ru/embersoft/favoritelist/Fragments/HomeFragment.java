package ru.embersoft.favoritelist.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ru.embersoft.favoritelist.Adapters.CoffeeAdapter;
import ru.embersoft.favoritelist.Helpers.CoffeeItem;
import ru.embersoft.favoritelist.R;

public class HomeFragment extends Fragment {

    private ArrayList<CoffeeItem> coffeeItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CoffeeAdapter(coffeeItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        coffeeItems.add(new CoffeeItem(R.drawable.coffee01, "Latte","0","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee02, "Kapucino","1","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee03, "Raf","2","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee04, "Milk Shake","3","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee05, "Magic Coffee","4","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee06, "Swedish Coffee","5","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee07, "Mint Coffee","6","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee08, "Espresso","7","0"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee09, "Americano","8","0"));

        return root;
    }
}