package khoapham.ptp.phamtanphat.asyntask1903;

import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // outer class
        // inner class

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

        //anonymous class
        new Xulydongbo().execute();

    }
    //Param : Tham số truyền vào cho phần xử lý logic(trong doInbackGround)
    //Progress : Tham số truyền vào cho phần cập nhật dữ liệu khi xử lý logic(onpressupdate)
    // Result : Tham số return của doInbackground gửi cho onPostexcute()
     class  Xulydongbo extends AsyncTask<String,String,String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

    }

}
