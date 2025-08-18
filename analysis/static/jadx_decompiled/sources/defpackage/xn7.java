package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class xn7 {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final z24 b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public xn7(long j, z24 z24Var, long j2) {
        this(j, z24Var, z24Var.a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public xn7(long j, z24 z24Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = j;
        this.b = z24Var;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
