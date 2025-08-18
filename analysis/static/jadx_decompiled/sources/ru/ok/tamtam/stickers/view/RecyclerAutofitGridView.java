package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hdc;
import defpackage.kg6;
import defpackage.pz4;

/* loaded from: classes2.dex */
public class RecyclerAutofitGridView extends RecyclerView {
    public final GridLayoutManager V1;
    public int W1;
    public int X1;
    public View Y1;
    public final pz4 Z1;

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W1 = 5;
        this.Z1 = new pz4(5, this);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.W1);
        this.V1 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
    }

    public final void F0() {
        if (this.Y1 == null) {
            return;
        }
        hdc adapter = getAdapter();
        this.Y1.setVisibility((adapter == null || adapter.j() <= 0) ? 0 : 8);
    }

    public int getSpanCount() {
        return this.W1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.X1 > 0) {
            this.V1.A1(Math.max(1, getMeasuredWidth() / this.X1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(hdc hdcVar) {
        hdc adapter = getAdapter();
        pz4 pz4Var = this.Z1;
        if (adapter != null) {
            adapter.B(pz4Var);
        }
        super.setAdapter(hdcVar);
        if (this.Y1 != null) {
            if (hdcVar != null) {
                hdcVar.z(pz4Var);
            }
            F0();
        }
    }

    public void setColumnWidth(int i) {
        this.X1 = i;
        requestLayout();
    }

    public void setDefaultColumns(int i) {
        this.W1 = i;
        this.V1.A1(i);
        setLayoutManager(null);
        setLayoutManager(this.V1);
    }

    public void setEmptyView(View view) {
        this.Y1 = view;
        hdc adapter = getAdapter();
        if (adapter != null) {
            adapter.z(this.Z1);
        }
        F0();
    }

    public void setSpanSizeLookup(kg6 kg6Var) {
        this.V1.K = kg6Var;
    }
}
