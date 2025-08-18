package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.dec;
import defpackage.hdc;
import defpackage.ivb;
import defpackage.jaf;
import defpackage.kc9;
import defpackage.lc9;
import defpackage.pdc;
import defpackage.stb;
import defpackage.tx0;
import defpackage.vyb;
import defpackage.wmc;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class c extends hdc {
    public final wmc X;
    public final int Y;
    public final tx0 o;

    public c(ContextThemeWrapper contextThemeWrapper, tx0 tx0Var, wmc wmcVar) {
        kc9 kc9Var = tx0Var.a;
        kc9 kc9Var2 = tx0Var.o;
        if (kc9Var.a.compareTo(kc9Var2.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (kc9Var2.a.compareTo(tx0Var.b.a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.Y = (contextThemeWrapper.getResources().getDimensionPixelSize(stb.mtrl_calendar_day_height) * lc9.o) + (MaterialDatePicker.n1(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(stb.mtrl_calendar_day_height) : 0);
        this.o = tx0Var;
        this.X = wmcVar;
        A(true);
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.o.Z;
    }

    @Override // defpackage.hdc
    public final long k(int i) {
        Calendar calendarB = jaf.b(this.o.a.a);
        calendarB.add(2, i);
        return new kc9(calendarB).a.getTimeInMillis();
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        b bVar = (b) decVar;
        tx0 tx0Var = this.o;
        Calendar calendarB = jaf.b(tx0Var.a.a);
        calendarB.add(2, i);
        kc9 kc9Var = new kc9(calendarB);
        bVar.F0.setText(kc9Var.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.G0.findViewById(ivb.month_grid);
        if (materialCalendarGridView.a() == null || !kc9Var.equals(materialCalendarGridView.a().a)) {
            new lc9(kc9Var, tx0Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(vyb.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.n1(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new pdc(-1, this.Y));
        return new b(linearLayout, true);
    }
}
