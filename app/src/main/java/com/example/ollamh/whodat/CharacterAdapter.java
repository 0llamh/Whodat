package com.example.ollamh.whodat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import java.util.List;
import android.content.Context;
/**
 * Created by carleneberry on 7/25/17.
 */

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView characterName;
        public ImageButton characterFace;

        public ViewHolder(View itemView){
            super(itemView);
            characterName=(TextView)itemView.findViewById(R.id.character_name);
            characterFace=(ImageButton)itemView.findViewById(R.id.character_pic);
            //check charactername to set characterresource to correct mipmap

            characterFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), CharacterWiki.class);
                    intent.putExtra("character", characterName.toString());
                    intent.putExtra("season", season);
                    context.startActivity(intent);
                }
            });

        }

    }

    private List<Character> charactersList;
    private Context context;
    private String season;

    public CharacterAdapter(Context c, List<Character> characters,String s){

        context=c;
        charactersList=characters;
        season = s;
    }

    private Context getContext(){


        return context;
    }


    @Override
    public CharacterAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context2=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context2);

        View characterView = inflater.inflate(R.layout.character,parent,false);

        ViewHolder viewHolder = new ViewHolder(characterView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CharacterAdapter.ViewHolder holder, int position) {

        Character character = charactersList.get(position);

        TextView textView = holder.characterName;
        textView.setText(character.getName());
        ImageButton button=holder.characterFace;
        button.setImageResource(R.mipmap.jonsnow);

    }

    @Override
    public int getItemCount() {
        return charactersList.size();
    }


}
