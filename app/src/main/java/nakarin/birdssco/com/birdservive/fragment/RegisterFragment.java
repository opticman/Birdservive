package nakarin.birdssco.com.birdservive.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nakarin.birdssco.com.birdservive.R;

/**
 * Created by opticman on 28-Oct-17.
 */

public class RegisterFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_new_register, container ,false);
        return view;
    }

} //Main Class
