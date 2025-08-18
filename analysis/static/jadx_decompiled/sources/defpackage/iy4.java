package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class iy4 {
    public static final Rect c = new Rect();
    public final khe a;
    public final khe b = new khe(new es3(9, this));

    public iy4(Context context) {
        this.a = new khe(new hy4(this, context));
    }

    public final float a() {
        return ((Number) this.a.getValue()).floatValue();
    }
}
