package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dec;
import defpackage.ivb;
import defpackage.kmf;
import defpackage.twb;
import defpackage.zmf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends dec {
    public final TextView F0;
    public final MaterialCalendarGridView G0;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(ivb.month_title);
        this.F0 = textView;
        WeakHashMap weakHashMap = zmf.a;
        new kmf(twb.tag_accessibility_heading, Boolean.class, 0, 28, 2).g(textView, Boolean.TRUE);
        this.G0 = (MaterialCalendarGridView) linearLayout.findViewById(ivb.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
