package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class coa {
    public final BitmapDrawable a;
    public final Rect c;
    public Interpolator d;
    public long e;
    public final Rect f;
    public int g;
    public long j;
    public boolean k;
    public boolean l;
    public h7b m;
    public float b = 1.0f;
    public float h = 1.0f;
    public float i = 1.0f;

    public coa(BitmapDrawable bitmapDrawable, Rect rect) {
        this.a = bitmapDrawable;
        this.f = rect;
        Rect rect2 = new Rect(rect);
        this.c = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.b * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
