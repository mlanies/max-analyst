package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kz1 {
    public static final aa0 i = new aa0(Integer.TYPE, null, "camerax.core.captureConfig.rotation");
    public static final aa0 j = new aa0(Integer.class, null, "camerax.core.captureConfig.jpegQuality");
    public static final aa0 k = new aa0(Range.class, null, "camerax.core.captureConfig.resolvedFrameRate");
    public final List a;
    public final ce3 b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final nje g;
    public final pv1 h;

    public kz1(ArrayList arrayList, wma wmaVar, int i2, boolean z, ArrayList arrayList2, boolean z2, nje njeVar, pv1 pv1Var) {
        this.a = arrayList;
        this.b = wmaVar;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = njeVar;
        this.h = pv1Var;
        this.d = z;
    }

    public final int a() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Integer num = (Integer) this.b.f(o9f.p0, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Integer num = (Integer) this.b.f(o9f.q0, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
