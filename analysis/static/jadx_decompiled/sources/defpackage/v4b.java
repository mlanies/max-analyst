package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes.dex */
public final class v4b {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ x4b g;

    public v4b(x4b x4bVar, int i, int i2, int i3, String str, Handler handler) {
        this.g = x4bVar;
        this.f = handler;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new rqf(this, this.a, this.b, this.d, this.c);
            } else {
                this.e = new jl1(this, this.a, this.b, this.d);
            }
        }
        return this.e;
    }
}
