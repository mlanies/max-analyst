package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j18 extends tdc {
    public final /* synthetic */ c a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ MaterialCalendar c;

    public j18(MaterialCalendar materialCalendar, c cVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.a = cVar;
        this.b = materialButton;
    }

    @Override // defpackage.tdc
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.c;
        int iW0 = i < 0 ? ((LinearLayoutManager) materialCalendar.s1.getLayoutManager()).W0() : ((LinearLayoutManager) materialCalendar.s1.getLayoutManager()).Y0();
        c cVar = this.a;
        Calendar calendarB = jaf.b(cVar.o.a.a);
        calendarB.add(2, iW0);
        materialCalendar.o1 = new kc9(calendarB);
        Calendar calendarB2 = jaf.b(cVar.o.a.a);
        calendarB2.add(2, iW0);
        calendarB2.set(5, 1);
        Calendar calendarB3 = jaf.b(calendarB2);
        calendarB3.get(2);
        calendarB3.get(1);
        calendarB3.getMaximum(7);
        calendarB3.getActualMaximum(5);
        calendarB3.getTimeInMillis();
        this.b.setText(jaf.a("yMMMM", Locale.getDefault()).format(new Date(calendarB3.getTimeInMillis())));
    }
}
