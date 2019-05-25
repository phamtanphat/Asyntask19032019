package khoapham.ptp.phamtanphat.asyntask1903;

import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDownload;
    ProgressBar progressBar;
    TextView txtprogress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDownload = findViewById(R.id.buttonDownload);
        progressBar = findViewById(R.id.progressbar);
        txtprogress = findViewById(R.id.textviewProgress);

        txtprogress.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Xử lý down load
        // 1 : Khi click vào button download
//                + Progressbar hiển thị
//                + Textview hiển thị phần trăm download
        //  2 : Khi download:
//                + Cứ mỗi giây sẽ down được 10 %
//                + Hiển thị phần trăm download lên cho giao diện
        // 3 : Khi download kết thúc :
//                +Thông báo down load đã xong
//


    }
    //Param : Tham số truyền vào cho phần xử lý logic(trong doInbackGround)
    //Progress : Tham số truyền vào cho phần cập nhật dữ liệu khi xử lý logic(onpressupdate)
    // Result : Tham số return của doInbackground gửi cho onPostexcute()
     class  Xulydownload extends AsyncTask<Void,Integer,String> {

        @Override
        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);
            txtprogress.setVisibility(View.VISIBLE);
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... voids) {
            int a = 0;
            for (int i = 0 ; i<10 ; i++){
                a+= 10;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(a);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            int progress = values[0];
            progressBar.setProgress(progressBar.getProgress() + progress);
            super.onProgressUpdate(values);
        }
    }

}
