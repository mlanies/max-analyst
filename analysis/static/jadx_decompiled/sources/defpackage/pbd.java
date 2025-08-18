package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pbd implements nbd {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final ComponentName g;
    public final IBinder h;
    public final Bundle i;

    static {
        int i = oaf.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
        r = Integer.toString(8, 36);
    }

    public pbd(int i, int i2, int i3, int i4, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = str2;
        this.g = componentName;
        this.h = iBinder;
        this.i = bundle;
    }

    @Override // defpackage.nbd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nbd
    public final ComponentName b() {
        return this.g;
    }

    @Override // defpackage.nbd
    public final Object c() {
        return this.h;
    }

    @Override // defpackage.nbd
    public final String d() {
        return this.f;
    }

    @Override // defpackage.nbd
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pbd)) {
            return false;
        }
        pbd pbdVar = (pbd) obj;
        return this.a == pbdVar.a && this.b == pbdVar.b && this.c == pbdVar.c && this.d == pbdVar.d && TextUtils.equals(this.e, pbdVar.e) && TextUtils.equals(this.f, pbdVar.f) && oaf.a(this.g, pbdVar.g) && oaf.a(this.h, pbdVar.h);
    }

    @Override // defpackage.nbd
    public final int f() {
        return this.d;
    }

    @Override // defpackage.nbd
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt(j, this.a);
        bundle.putInt(k, this.b);
        bundle.putInt(l, this.c);
        bundle.putString(m, this.e);
        bundle.putString(n, this.f);
        bundle.putBinder(p, this.h);
        bundle.putParcelable(o, this.g);
        bundle.putBundle(q, this.i);
        bundle.putInt(r, this.d);
        return bundle;
    }

    @Override // defpackage.nbd
    public final Bundle getExtras() {
        return new Bundle(this.i);
    }

    @Override // defpackage.nbd
    public final String getPackageName() {
        return this.e;
    }

    @Override // defpackage.nbd
    public final int getType() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.e + " type=" + this.b + " libraryVersion=" + this.c + " interfaceVersion=" + this.d + " service=" + this.f + " IMediaSession=" + this.h + " extras=" + this.i + "}";
    }
}
