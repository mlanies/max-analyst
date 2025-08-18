package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class kx1 {
    public float a;
    public float b;
    public Object c;

    public void a() {
        View view = (View) this.c;
        view.setPivotX(this.a * view.getMeasuredWidth());
        view.setPivotY(this.b * view.getMeasuredHeight());
    }
}
