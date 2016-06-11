package reviews.udacity.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppPortfolioActivity extends AppCompatActivity implements View.OnClickListener {

    private Button popMoviesAppBtn;
    private Button stockHawkBtn;
    private Button buildItBiggerBtn;
    private Button appMaterialBtn;
    private Button ubiquitousBtn;
    private Button capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.initializeUiElements();

    }

    private void showToastMessage(int resId) {
        Toast.makeText(AppPortfolioActivity.this, resId,
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.app_main_btn_1:
                showToastMessage(R.string.popular_movies_app_msg);
                break;

            case R.id.app_main_btn_2:
                showToastMessage(R.string.stock_hawk_app_msg);
                break;

            case R.id.app_main_btn_3:
                showToastMessage(R.string.build_it_bigger_app_msg);
                break;

            case R.id.app_main_btn_4:
                showToastMessage(R.string.material_app_msg);
                break;

            case R.id.app_main_btn_5:
                showToastMessage(R.string.ubiquitous_app_msg);
                break;

            case R.id.app_main_btn_6:
                showToastMessage(R.string.capstone_app_msg);
                break;
        }
    }

    private void initializeUiElements() {
        popMoviesAppBtn = (Button) findViewById(R.id.app_main_btn_1);
        stockHawkBtn = (Button) findViewById(R.id.app_main_btn_2);
        buildItBiggerBtn = (Button) findViewById(R.id.app_main_btn_3);
        appMaterialBtn = (Button) findViewById(R.id.app_main_btn_4);
        ubiquitousBtn = (Button) findViewById(R.id.app_main_btn_5);
        capstoneBtn = (Button) findViewById(R.id.app_main_btn_6);

        popMoviesAppBtn.setOnClickListener(this);
        stockHawkBtn.setOnClickListener(this);
        buildItBiggerBtn.setOnClickListener(this);
        appMaterialBtn.setOnClickListener(this);
        ubiquitousBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);

    }
}
