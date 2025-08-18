package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class pdc extends ViewGroup.MarginLayoutParams {
    public dec a;
    public final Rect b;
    public boolean c;
    public boolean o;

    public pdc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.o = false;
    }

    public pdc(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.o = false;
    }

    public pdc(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.o = false;
    }

    public pdc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.o = false;
    }

    public pdc(pdc pdcVar) {
        super((ViewGroup.LayoutParams) pdcVar);
        this.b = new Rect();
        this.c = true;
        this.o = false;
    }
}
