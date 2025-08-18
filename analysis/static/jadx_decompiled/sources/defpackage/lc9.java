package defpackage;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class lc9 extends BaseAdapter {
    public final kc9 a;
    public ph4 b;
    public final tx0 c;
    public static final int o = jaf.d(null).getMaximum(4);
    public static final int X = (jaf.d(null).getMaximum(7) + jaf.d(null).getMaximum(5)) - 1;

    public lc9(kc9 kc9Var, tx0 tx0Var) {
        this.a = kc9Var;
        this.c = tx0Var;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.c.X;
        kc9 kc9Var = this.a;
        Calendar calendar = kc9Var.a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + kc9Var.o : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarB = jaf.b(this.a.a);
        calendarB.set(5, iA);
        return Long.valueOf(calendarB.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.X) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return X;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            ph4 r1 = r4.b
            if (r1 != 0) goto L10
            ph4 r1 = new ph4
            r2 = 7
            r1.<init>(r0, r2)
            r4.b = r1
        L10:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = defpackage.vyb.mtrl_calendar_day
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            kc9 r7 = r4.a
            int r2 = r7.X
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r4 = r4.getItem(r5)
            if (r4 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r4 = defpackage.jaf.c()
            r4.getTimeInMillis()
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc9.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
