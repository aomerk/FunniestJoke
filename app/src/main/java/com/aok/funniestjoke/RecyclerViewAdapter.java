package com.aok.funniestjoke;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<String> values;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader;
        public TextView txtFooter;
        public ImageView icon;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            icon = (ImageView) v.findViewById(R.id.icon);
        }
    }

    public void add(int position, String item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecyclerViewAdapter(List<String> myDataset) {
        values = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.row_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final String name = values.get(position);
        holder.txtHeader.setText(name);
switch (holder.getAdapterPosition()){
    case 0:
        holder.icon.setImageResource(R.drawable.ic_snail);
        break;
    case 1:
        holder.icon.setImageResource(R.drawable.ic_person);
        break;
        case 2:
        holder.icon.setImageResource(R.drawable.ic_heart);
        break;
        case 3:
        holder.icon.setImageResource(R.drawable.ic_earth);
        break;
        case 4:
        holder.icon.setImageResource(R.drawable.ic_magnifier);
        break;
        case 5:
        holder.icon.setImageResource(R.drawable.ic_briefcase);
        break;
        case 6:
        holder.icon.setImageResource(R.drawable.ic_haircutting_scissors);
        break;
        case 7:
        holder.icon.setImageResource(R.drawable.ic_asian_temple);
        break;
        case 8:
        holder.icon.setImageResource(R.drawable.ic_tent);
        break;
        case 9:
        holder.icon.setImageResource(R.drawable.ic_radiation);
        break;
        case 10:
            holder.icon.setImageResource(R.drawable.ic_android_black_24dp);
        break;


}
        holder.txtHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("onclick", "onClick: ");
                Context context = holder.layout.getContext();
                String message = String.valueOf(holder.getAdapterPosition());

                switch (holder.getAdapterPosition()){
                        case 0:
                        message = "A guy is sitting at home when he hears a knock at the door. He opens the door and sees a snail on the porch. He picks up the snail and throws it as far as he can. Three years later there’s a knock on the door. He opens it and sees the same snail. The snail says: ‘What the hell was that all about?’\n";
                        break;
                        case 1:
                        message = "Three guys stranded on a desert island find a magic lantern containing a genie, who grants them each one wish. The first guy wishes he was off the island and back home. The second guy wishes the same. The third guy says: ‘I’m lonely. I wish my friends were back here.’";
                        break;
                        case 2:
                        message = "It’s the World Cup Final, and a man makes his way to his seat right next to the pitch. He sits down, noticing that the seat next to him is empty. He leans over and asks his neighbour if someone will be sitting there. ‘No,’ says the neighbour. ‘The seat is empty.’ ‘This is incredible,’ said the man. ‘Who in their right mind would have a seat like this for the Final and not use it?’ The neighbour says, ‘Well actually the seat belongs to me. I was supposed to come with my wife, but she passed away. This is the first World Cup Final we haven’t been to together since we got married.’ ‘Oh, I’m so sorry to hear that. That’s terrible….But couldn’t you find someone else, a friend, relative or even a neighbour to take her seat?’ The man shakes his head. ‘No,’ he says. ‘They’re all at the funeral.’\n";
                        break;
                        case 3:
                            message = "Sid and Irv are business partners. They make a deal that whichever one dies first will contact the living one from the afterlife. So Irv dies. Sid doesn’t hear from him for about a year, figures there is no afterlife. Then one day he gets a call. It’s Irv. ‘So there is an afterlife! What’s it like?’ Sid asks. ‘Well, I sleep very late. I get up, have a big breakfast. Then I have sex, lots of sex. Then I go back to sleep, but I get up for lunch, have a big lunch. Have some more sex, take a nap. Huge dinner. More sex. Go to sleep and wake up the next day.’ ‘Oh, my God,’ says Sid. ‘So that’s what heaven is like?’ ‘Oh no,’ says Irv. ‘I’m not in heaven. I’m a bear in Yellowstone Park.’\n";
                        break;
                        case 4:
                        message = "Sid and Irv are business partners. They make a deal that whichever one dies first will contact the living one from the afterlife. So Irv dies. Sid doesn’t hear from him for about a year, figures there is no afterlife. Then one day he gets a call. It’s Irv. ‘So there is an afterlife! What’s it like?’ Sid asks. ‘Well, I sleep very late. I get up, have a big breakfast. Then I have sex, lots of sex. Then I go back to sleep, but I get up for lunch, have a big lunch. Have some more sex, take a nap. Huge dinner. More sex. Go to sleep and wake up the next day.’ ‘Oh, my God,’ says Sid. ‘So that’s what heaven is like?’ ‘Oh no,’ says Irv. ‘I’m not in heaven. I’m a bear in Yellowstone Park.’\n";
                        break;
                        case 5:
                            message = "A guy dies and is sent to hell. Satan meets him, shows him doors to three rooms, and says he must choose one to spend eternity in. In the first room, people are standing in dirt up to their necks. The guy says, ‘No, let me see the next room.’ In the second room, people are standing in dirt up to their noses. Guy says no again. Finally Satan opens the third room. People are standing with dirt up to their knees, drinking coffee and eating pastries. The guy says, ‘I pick this room.’ Satan says Ok and starts to leave, and the guy wades in and starts pouring some coffee. On the way out Satan yells, ‘OK, coffee break’s over. Everyone back on your heads!’\n";
                            break;
                        case 6:
                            message = context.getString(R.string.joke7_message);
                        break;
                        case 7:
                            message = context.getString(R.string.joke8_message);
                        break;
                        case 8:
                            message = context.getString(R.string.joke9_message);
                        break;
                        case 9:
                            message = context.getString(R.string.joke10_message);
                            break;

                }

                new AlertDialog.Builder(context,R.style.CustomDialogTheme)
                        .setTitle(name)
                        .setMessage(message)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.d("MainActivity", "OK");
                            }
                        })
                        .show();
            }
        });

//        holder.txtFooter.setText("Footer: " + name);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}