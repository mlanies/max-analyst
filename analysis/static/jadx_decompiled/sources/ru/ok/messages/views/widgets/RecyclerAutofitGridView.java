package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import defpackage.z15;

/* loaded from: classes2.dex */
public class RecyclerAutofitGridView extends z15 {
    public int j2;
    public int k2;
    public int l2;

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (2 == getContext().getResources().getConfiguration().orientation) {
            this.l2 = 8;
        } else {
            this.l2 = 4;
        }
        getContext();
        setLayoutManager(new GridLayoutManager(this.l2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a layoutManager = getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && this.j2 > 0) {
            int iMax = Math.max(2, getMeasuredWidth() / this.j2);
            int i3 = this.l2;
            if (iMax > i3) {
                iMax = i3;
            }
            ((GridLayoutManager) layoutManager).A1(iMax);
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || this.k2 <= 0) {
            return;
        }
        int iMax2 = Math.max(2, getMeasuredWidth() / this.k2);
        int i4 = this.l2;
        if (iMax2 > i4) {
            iMax2 = i4;
        }
        ((StaggeredGridLayoutManager) layoutManager).m1(iMax2);
    }

    public void setColumnWidth(int i) {
        this.j2 = i;
        requestLayout();
    }

    public void setMaxColumns(int i) {
        this.l2 = i;
    }

    public void setStaggeredColumnWidth(int i) {
        this.k2 = i;
        requestLayout();
    }
}
