package dwyer.com.mathflash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.Button;

public class HomeFragment extends Fragment implements View.OnClickListener {

    protected View v;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home, container, false);

        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v) {

    }
}
