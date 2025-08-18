package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class jwe extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public jwe(int i) {
        super(i, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public jwe(jwe jweVar) {
        super((ViewGroup.MarginLayoutParams) jweVar);
        this.a = 0;
        this.a = jweVar.a;
    }

    public jwe(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
