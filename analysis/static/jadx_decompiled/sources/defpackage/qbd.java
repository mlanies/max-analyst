package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Arrays;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class qbd implements nbd {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final int b;
    public final ComponentName c;
    public final String d;
    public final Bundle e;

    static {
        int i2 = oaf.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
    }

    public qbd(int i2, ComponentName componentName) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        this.a = i2;
        this.b = HttpStatus.SC_SWITCHING_PROTOCOLS;
        this.c = componentName;
        this.d = packageName;
        this.e = bundle;
    }

    @Override // defpackage.nbd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nbd
    public final ComponentName b() {
        return this.c;
    }

    @Override // defpackage.nbd
    public final Object c() {
        return null;
    }

    @Override // defpackage.nbd
    public final String d() {
        ComponentName componentName = this.c;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // defpackage.nbd
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qbd)) {
            return false;
        }
        qbd qbdVar = (qbd) obj;
        int i2 = qbdVar.b;
        int i3 = this.b;
        if (i3 != i2) {
            return false;
        }
        if (i3 == 100) {
            return oaf.a(null, null);
        }
        if (i3 != 101) {
            return false;
        }
        return oaf.a(this.c, qbdVar.c);
    }

    @Override // defpackage.nbd
    public final int f() {
        return 0;
    }

    @Override // defpackage.nbd
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, null);
        bundle.putInt(g, this.a);
        bundle.putInt(h, this.b);
        bundle.putParcelable(i, this.c);
        bundle.putString(j, this.d);
        bundle.putBundle(k, this.e);
        return bundle;
    }

    @Override // defpackage.nbd
    public final Bundle getExtras() {
        return new Bundle(this.e);
    }

    @Override // defpackage.nbd
    public final String getPackageName() {
        return this.d;
    }

    @Override // defpackage.nbd
    public final int getType() {
        return this.b != 101 ? 0 : 2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, null});
    }

    public final String toString() {
        return "SessionToken {legacyToken=null}";
    }
}
