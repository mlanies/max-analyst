package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class g18 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ MaterialCalendar c;

    public /* synthetic */ g18(MaterialCalendar materialCalendar, c cVar, int i) {
        this.a = i;
        this.c = materialCalendar;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MaterialCalendar materialCalendar = this.c;
                int iY0 = ((LinearLayoutManager) materialCalendar.s1.getLayoutManager()).Y0() - 1;
                if (iY0 >= 0) {
                    Calendar calendarB = jaf.b(this.b.o.a.a);
                    calendarB.add(2, iY0);
                    materialCalendar.e1(new kc9(calendarB));
                    break;
                }
                break;
            default:
                MaterialCalendar materialCalendar2 = this.c;
                int iW0 = ((LinearLayoutManager) materialCalendar2.s1.getLayoutManager()).W0() + 1;
                if (iW0 < materialCalendar2.s1.getAdapter().j()) {
                    Calendar calendarB2 = jaf.b(this.b.o.a.a);
                    calendarB2.add(2, iW0);
                    materialCalendar2.e1(new kc9(calendarB2));
                    break;
                }
                break;
        }
    }
}
