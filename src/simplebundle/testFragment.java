package simplebundle;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class testFragment extends Fragment {

	private LinearLayout m_main;
	private EditText m_text;
	private Button m_button;
	private TextView m_result;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Context context = container.getContext();

		m_main = new LinearLayout(context);
		m_main.setOrientation(LinearLayout.VERTICAL);

		m_text = new EditText(context);
		m_text.setLines(1);

		m_button = new Button(context);
		m_button.setText("echo");
		m_button.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				m_result.setText(m_text.getText());
			}

		});

		m_result = new TextView(context);

		m_main.addView(m_text);
		m_main.addView(m_button);
		m_main.addView(m_result);
		m_main.setVisibility(View.VISIBLE);

		return m_main;
	}

}
