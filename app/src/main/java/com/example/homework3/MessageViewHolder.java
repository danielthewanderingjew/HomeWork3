package com.example.homework3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MessageViewHolder extends RecyclerView.ViewHolder {public CardView messageCard;
    public ImageView userImage;
    public TextView userName;
    public TextView message;
    public CardView messageCard_new;
    public ImageView userImage_new;
    public TextView userName_new;
    public TextView message_new;


    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);

        messageCard = itemView.findViewById(R.id.message);
        userImage = itemView.findViewById(R.id.userImage);
        userName = itemView.findViewById(R.id.userTV);
        message = itemView.findViewById(R.id.messageText);
        messageCard_new = itemView.findViewById(R.id.message_new);
        userImage_new = itemView.findViewById(R.id.userImage_new);
        userName_new = itemView.findViewById(R.id.userTV_new);
        message_new = itemView.findViewById(R.id.messageText_new);
    }
}
