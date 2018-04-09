package iotapps.googlenowcardviewsample;

/**
 * Created by prashantkaushik on 24/02/17.
 */


import android.content.Context;
//import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class cardAdapter extends RecyclerView.Adapter<cardAdapter.cardviewholder> {

    private Context context;
    private List<card> cardList;


    // another class for view
    public class cardviewholder extends RecyclerView.ViewHolder
    {
        public  TextView title,count;
        public ImageView thumbnail, overflow;

        public cardviewholder(View view)
        {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }


    }

    public cardAdapter(Context context, List<card> cardList)
    {
        this.context = context;
        this.cardList = cardList;
    }

    @Override
    public cardviewholder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.carditem, parent, false);

        return new cardviewholder(itemView);
    }

    @Override
    public void onBindViewHolder(final cardviewholder holder, int position) {
        card card = cardList.get(position);
        holder.title.setText("Basic Cards");
        holder.count.setText("Some cards");



        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });
    }
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(context, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.cardmenu, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(context, "Add", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_play_next:
                    Toast.makeText(context, "Play", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }


    @Override
    public int getItemCount() {
        return cardList.size();
    }



}
