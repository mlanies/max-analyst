package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class ux1 {
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final l0f d;
    public final HashMap e;
    public int f;

    public ux1(l0f l0fVar) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = l0fVar;
            this.f = this.c;
        }
    }

    public static void c(fv1 fv1Var, zw1 zw1Var) {
        if (hye.a()) {
            Trace.setCounter(c37.F("CX:State[" + fv1Var + "]"), zw1Var.ordinal());
        }
    }

    public final sx1 a(String str) {
        HashMap map = this.e;
        for (fv1 fv1Var : map.keySet()) {
            if (str.equals(fv1Var.a().d())) {
                return (sx1) map.get(fv1Var);
            }
        }
        return null;
    }

    public final void b() {
        boolean zU = mqd.u(3, "CameraStateRegistry");
        StringBuilder sb = this.a;
        if (zU) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (mqd.u(3, "CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((fv1) entry.getKey()).toString(), ((sx1) entry.getValue()).a != null ? ((sx1) entry.getValue()).a.toString() : "UNKNOWN"));
            }
            zw1 zw1Var = ((sx1) entry.getValue()).a;
            if (zw1Var != null && zw1Var.a) {
                i++;
            }
        }
        if (mqd.u(3, "CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(wg0.h("Open count: ", i, " (Max allowed: ", this.c, ")"));
        }
        this.f = Math.max(this.c - i, 0);
    }

    public final boolean d(fv1 fv1Var) {
        boolean z;
        synchronized (this.b) {
            try {
                sx1 sx1Var = (sx1) this.e.get(fv1Var);
                c54.o(sx1Var, "Camera must first be registered with registerCamera()");
                z = true;
                if (mqd.u(3, "CameraStateRegistry")) {
                    this.a.setLength(0);
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    Integer numValueOf = Integer.valueOf(this.f);
                    zw1 zw1Var = sx1Var.a;
                    sb.append(String.format(locale, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", fv1Var, numValueOf, Boolean.valueOf(zw1Var != null && zw1Var.a), sx1Var.a));
                }
                if (this.f > 0) {
                    zw1 zw1Var2 = zw1.OPENING;
                    sx1Var.a = zw1Var2;
                    c(fv1Var, zw1Var2);
                } else {
                    zw1 zw1Var3 = sx1Var.a;
                    if (zw1Var3 != null && zw1Var3.a) {
                        zw1 zw1Var22 = zw1.OPENING;
                        sx1Var.a = zw1Var22;
                        c(fv1Var, zw1Var22);
                    } else {
                        z = false;
                    }
                }
                if (mqd.u(3, "CameraStateRegistry")) {
                    StringBuilder sb2 = this.a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                    this.a.getClass();
                }
                if (z) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean e(String str, String str2) {
        synchronized (this.b) {
            try {
                boolean z = true;
                if (this.d.b != 2) {
                    return true;
                }
                sx1 sx1VarA = a(str);
                zw1 zw1Var = sx1VarA != null ? sx1VarA.a : null;
                sx1 sx1VarA2 = str2 != null ? a(str2) : null;
                zw1 zw1Var2 = sx1VarA2 != null ? sx1VarA2.a : null;
                zw1 zw1Var3 = zw1.OPEN;
                boolean z2 = zw1Var3.equals(zw1Var) || zw1.CONFIGURED.equals(zw1Var);
                boolean z3 = zw1Var3.equals(zw1Var2) || zw1.CONFIGURED.equals(zw1Var2);
                if (!z2 || !z3) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}
