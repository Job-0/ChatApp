package com.job.cetapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.job.cetapp.databinding.ActivityChatBinding;
import com.job.cetapp.models.User;
import com.job.cetapp.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverInfos();
    }

    private void loadReceiverInfos() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners() {
        binding.imageBack.setOnClickListener(view -> onBackPressed());
    }
}