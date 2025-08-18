package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class rd6 implements ol7 {
    public final Uri X;
    public final wm3 Y;
    public final List Z;
    public final long a;
    public final CharSequence b;
    public final w6b c;
    public final w6b o;
    public final boolean s0;
    public final int t0 = z8a.p;
    public final long u0;

    public rd6(long j, String str, w6b w6bVar, w6b w6bVar2, Uri uri, wm3 wm3Var, wz wzVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = w6bVar;
        this.o = w6bVar2;
        this.X = uri;
        this.Y = wm3Var;
        this.Z = wzVar;
        this.s0 = z;
        this.u0 = j;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.u0;
    }

    @Override // defpackage.ol7
    public final int l() {
        return this.t0;
    }
}
