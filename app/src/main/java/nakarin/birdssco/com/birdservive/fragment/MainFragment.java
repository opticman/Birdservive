package nakarin.birdssco.com.birdservive.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nakarin.birdssco.com.birdservive.R;

/**
 * Created by opticman on 28-Oct-17.
 */

public class MainFragment extends Fragment{

//    Create Main Method
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//      RegisterCrontroller
        registerCrontroller();


    } // main method

    private void registerCrontroller() {
        TextView textView = getView().findViewById(R.id.txtNewRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Move to RegisterFragment
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentFragmentMain, new RegisterFragment())
                        .addToBackStack(null).commit();
            }
        });
    }

    //    Creat view Group
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
} //Main Class
