package dwyer.com.mathflash;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.Button;

import dwyer.com.mathflash.helper.Config;

public class HomeFragment extends Fragment implements View.OnClickListener {

    protected View v;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home, container, false);

        getViews();
        
        setOnClickListeners();
        
        return v;
    }

    private void setOnClickListeners() {
        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
    }

    private void getViews() {
        btnAddition = v.findViewById(R.id.btnAddition);
        btnSubtraction = v.findViewById(R.id.btnSubtraction);
        btnMultiplication = v.findViewById(R.id.btnMultiplication);
        btnDivision = v.findViewById(R.id.btnDivision);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnAddition:
                Intent i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Add);
                startActivity(i);
                break;
            case R.id.btnSubtraction:
                i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Subtract);
                startActivity(i);
                break;
            case R.id.btnMultiplication:
                i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Multiply);
                startActivity(i);
                break;
            case R.id.btnDivision:
                i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Divide);
                startActivity(i);
                break;
        }
    }
}
