package ITPSoft.app.remembernow;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	ImageView imvChoiNgay, imvCaiDat, imvCongThuc, imvDiemCao, imvGioiThieu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
		actionEvent();
	}
	
	public void init(){
		imvChoiNgay = (ImageView)findViewById(R.id.imvChoiNgay);
		imvCaiDat = (ImageView)findViewById(R.id.imvCaiDat);
		imvCongThuc = (ImageView)findViewById(R.id.imvCongThuc);
		imvDiemCao = (ImageView)findViewById(R.id.imvDiemCao);
		imvGioiThieu = (ImageView)findViewById(R.id.imvGioiThieu);
	}
	
	public void actionEvent(){
		// su khien khi nhan vao nut choi ngay
		imvChoiNgay.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "nhan vao nut choi ngay", Toast.LENGTH_LONG).show();
				
			}
		});
		
		// su kien khi nhan vao nut Cong thuc
		
		imvCongThuc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// su kien khi nhan vao nut cai dat
		imvCaiDat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// su kien khi nhan vao nut diem cao
		imvDiemCao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// su kien khi nhan vao nut gioi thieu
		imvGioiThieu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	
}
