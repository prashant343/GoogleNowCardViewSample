package iotapps.googlenowcardviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static android.os.Looper.prepare;


public class MainActivity extends Activity {

    private RecyclerView recyclerView;
    private cardAdapter adapter;
    private List<card> cardList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        cardList = new ArrayList<>();
        adapter = new cardAdapter(this, cardList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
       // recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        fillcard();




    }





    private void fillcard() {
        int[] covers = new int[]{
                R.drawable.bird1,
                R.drawable.bird2,
                R.drawable.bird3,
                R.drawable.bird4,
                R.drawable.bird5,
                R.drawable.bird6,
                };

        card a = new card("True Romance","","", 13, 12,12);
        cardList.add(a);

        card b = new card("True Romance","","", 13, 12,12);
        cardList.add(a);
/*
        a = new Album("Maroon 5", 11, covers[2]);
        albumList.add(a);

        a = new Album("Born to Die", 12, covers[3]);
        albumList.add(a);

        a = new Album("Honeymoon", 14, covers[4]);
        albumList.add(a);

        a = new Album("I Need a Doctor", 1, covers[5]);
        albumList.add(a);

        a = new Album("Loud", 11, covers[6]);
        albumList.add(a);

        a = new Album("Legend", 14, covers[7]);
        albumList.add(a);

        a = new Album("Hello", 11, covers[8]);
        albumList.add(a);

        a = new Album("Greatest Hits", 17, covers[9]);
        albumList.add(a);
*/

        adapter.notifyDataSetChanged();
    }
}
