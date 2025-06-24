package com.example.infobook.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.infobook.R;

public class MuseumFragment extends Fragment {
    private static final String ARG_INFO = "info";
    private static final String ARG_IMAGE = "image";

    private String info;
    private int imageResId;

    public static MuseumFragment newInstance(String info, int imageResId) {
        MuseumFragment fragment = new MuseumFragment();
        Bundle args = new Bundle();
        args.putString(ARG_INFO, info);
        args.putInt(ARG_IMAGE, imageResId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        if (getArguments() != null) {
            info = getArguments().getString(ARG_INFO);
            imageResId = getArguments().getInt(ARG_IMAGE);
        }

        TextView textView = view.findViewById(R.id.textViewInfo);
        ImageView imageView = view.findViewById(R.id.imageViewFlag);

        textView.setText(info);
        imageView.setImageResource(imageResId);

        return view;
    }
}
