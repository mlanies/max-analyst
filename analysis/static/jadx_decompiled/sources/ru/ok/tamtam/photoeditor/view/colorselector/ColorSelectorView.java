package ru.ok.tamtam.photoeditor.view.colorselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.f3c;
import defpackage.m63;
import defpackage.o63;

/* loaded from: classes2.dex */
public class ColorSelectorView extends RecyclerView {
    public final m63 V1;
    public final int W1;

    public ColorSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W1 = 0;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f3c.ColorSelectorView);
        this.W1 = typedArrayObtainStyledAttributes.getInt(f3c.ColorSelectorView_color_selector_orientation, 0);
        typedArrayObtainStyledAttributes.recycle();
        getContext();
        int i = this.W1;
        setLayoutManager(new LinearLayoutManager(i == 0 ? 0 : 1, i == 0));
        m63 m63Var = new m63(getContext(), this.W1);
        this.V1 = m63Var;
        setAdapter(m63Var);
    }

    public void setColors(int[] iArr) {
        m63 m63Var = this.V1;
        m63Var.X = iArr;
        m63Var.m();
    }

    public void setListener(o63 o63Var) {
        this.V1.u0 = o63Var;
    }
}
