package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t9g extends hdc {
    public final MaterialCalendar o;

    public t9g(MaterialCalendar materialCalendar) {
        this.o = materialCalendar;
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.o.n1.Y;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        MaterialCalendar materialCalendar = this.o;
        int i2 = materialCalendar.n1.a.c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((s9g) decVar).F0;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(jaf.c().get(1) == i2 ? String.format(context.getString(wzb.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(wzb.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        ph4 ph4Var = materialCalendar.q1;
        if (jaf.c().get(1) == i2) {
            Object obj = ph4Var.b;
        } else {
            Object obj2 = ph4Var.a;
        }
        throw null;
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new s9g((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(vyb.mtrl_calendar_year, viewGroup, false));
    }
}
