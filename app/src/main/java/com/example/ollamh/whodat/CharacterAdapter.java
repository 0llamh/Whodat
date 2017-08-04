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
                    intent.putExtra("character", characterName.getText().toString());
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
        String name = textView.getText().toString();
        if(name.equals("Jon Snow"))
        {
            button.setImageResource(R.mipmap.jonsnow);
        }
        else if(name.equals("Daenerys Targaryen"))
        {
            button.setImageResource(R.mipmap.daenerys);
        }
        else if(name.equals("Viserys Targaryen"))
        {
            button.setImageResource(R.mipmap.viserys);
        }
        else if(name.equals("Robb Stark"))
        {
            button.setImageResource(R.mipmap.viserys);
        }
        else if(name.equals("Jaime Lannister"))
        {
            button.setImageResource(R.mipmap.jaime);
        }
        else if(name.equals("Eddard \"Ned\" Stark"))
        {
            button.setImageResource(R.mipmap.nedstark);
        }
        else if(name.equals("Robert Baratheon"))
        {
            button.setImageResource(R.mipmap.robertbaratheon);
        }
        else if(name.equals("Tyrion Lannister"))
        {
            button.setImageResource(R.mipmap.tyrion);
        }
        else if(name.equals("Cersei Lannister"))
        {
            button.setImageResource(R.mipmap.cersei);
        }
        else if(name.equals("Sansa Stark"))
        {
            button.setImageResource(R.mipmap.cersei);
        }
        else
        {
            button.setImageResource(R.mipmap.placeholder);
        }

    }

    @Override
    public int getItemCount() {
        return charactersList.size();
    }


}
