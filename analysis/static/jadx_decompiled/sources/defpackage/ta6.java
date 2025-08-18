package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class ta6 {
    public final float b;
    public long e;
    public float f;
    public float g;
    public sa6 a = null;
    public boolean c = false;
    public boolean d = false;

    public ta6(Context context) {
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
