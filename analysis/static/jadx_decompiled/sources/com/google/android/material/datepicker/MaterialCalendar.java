package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.bo6;
import defpackage.c44;
import defpackage.e0d;
import defpackage.fr0;
import defpackage.g18;
import defpackage.g34;
import defpackage.h18;
import defpackage.i18;
import defpackage.ivb;
import defpackage.j18;
import defpackage.jyb;
import defpackage.kc9;
import defpackage.lc9;
import defpackage.ph4;
import defpackage.stb;
import defpackage.t9g;
import defpackage.tx0;
import defpackage.vyb;
import defpackage.wmc;
import defpackage.zj0;
import defpackage.zmf;
import defpackage.zr6;

/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public int m1;
    public tx0 n1;
    public kc9 o1;
    public int p1;
    public ph4 q1;
    public RecyclerView r1;
    public RecyclerView s1;
    public View t1;
    public View u1;
    public View v1;
    public View w1;

    @Override // androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.o1);
    }

    public final void e1(kc9 kc9Var) {
        c cVar = (c) this.s1.getAdapter();
        int iD = cVar.o.a.d(kc9Var);
        int iD2 = iD - cVar.o.a.d(this.o1);
        boolean z = Math.abs(iD2) > 3;
        boolean z2 = iD2 > 0;
        this.o1 = kc9Var;
        if (z && z2) {
            this.s1.x0(iD - 3);
            this.s1.post(new zj0(iD, 2, this));
        } else if (!z) {
            this.s1.post(new zj0(iD, 2, this));
        } else {
            this.s1.x0(iD + 3);
            this.s1.post(new zj0(iD, 2, this));
        }
    }

    public final void f1(int i) {
        this.p1 = i;
        if (i == 2) {
            this.r1.getLayoutManager().y0(this.o1.c - ((t9g) this.r1.getAdapter()).o.n1.a.c);
            this.v1.setVisibility(0);
            this.w1.setVisibility(8);
            this.t1.setVisibility(8);
            this.u1.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.v1.setVisibility(8);
            this.w1.setVisibility(0);
            this.t1.setVisibility(0);
            this.u1.setVisibility(0);
            e1(this.o1);
        }
    }

    @Override // androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle == null) {
            bundle = this.Z;
        }
        this.m1 = bundle.getInt("THEME_RES_ID_KEY");
        zr6.n(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.n1 = (tx0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        zr6.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.o1 = (kc9) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(d0(), this.m1);
        this.q1 = new ph4(contextThemeWrapper, 7);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        kc9 kc9Var = this.n1.a;
        if (MaterialDatePicker.n1(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = vyb.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = vyb.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = U0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(stb.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(stb.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(stb.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(stb.mtrl_calendar_days_of_week_height);
        int i3 = lc9.o;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(stb.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(stb.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(stb.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(ivb.mtrl_calendar_days_of_week);
        zmf.j(gridView, new h18(0));
        int i4 = this.n1.X;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new c44(i4) : new c44()));
        gridView.setNumColumns(kc9Var.o);
        gridView.setEnabled(false);
        this.s1 = (RecyclerView) viewInflate.findViewById(ivb.mtrl_calendar_months);
        d0();
        this.s1.setLayoutManager(new i18(this, i2, i2));
        this.s1.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.n1, new wmc(this, false));
        this.s1.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(jyb.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ivb.mtrl_calendar_year_selector_frame);
        this.r1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.r1.setLayoutManager(new GridLayoutManager(integer, 0));
            this.r1.setAdapter(new t9g(this));
            this.r1.j(new bo6(this));
        }
        if (viewInflate.findViewById(ivb.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(ivb.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            zmf.j(materialButton, new fr0(3, this));
            View viewFindViewById = viewInflate.findViewById(ivb.month_navigation_previous);
            this.t1 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(ivb.month_navigation_next);
            this.u1 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.v1 = viewInflate.findViewById(ivb.mtrl_calendar_year_selector_frame);
            this.w1 = viewInflate.findViewById(ivb.mtrl_calendar_day_selector_frame);
            f1(1);
            materialButton.setText(this.o1.c());
            this.s1.m(new j18(this, cVar, materialButton));
            materialButton.setOnClickListener(new e0d(5, this));
            this.u1.setOnClickListener(new g18(this, cVar, 1));
            this.t1.setOnClickListener(new g18(this, cVar, 0));
        }
        if (!MaterialDatePicker.n1(contextThemeWrapper, R.attr.windowFullscreen)) {
            new g34(1).a(this.s1);
        }
        this.s1.x0(cVar.o.a.d(this.o1));
        zmf.j(this.s1, new h18(1));
        return viewInflate;
    }
}
