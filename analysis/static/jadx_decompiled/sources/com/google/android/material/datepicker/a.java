package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.lc9;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ c b;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = cVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        lc9 lc9VarA = materialCalendarGridView.a();
        if (i < lc9VarA.a() || i > lc9VarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((MaterialCalendar) this.b.X.a).n1.c.a) {
            throw null;
        }
    }
}
