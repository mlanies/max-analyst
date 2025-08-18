package defpackage;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class mr7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak6 b;

    public /* synthetic */ mr7(ak6 ak6Var, int i) {
        this.a = i;
        this.b = ak6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ak6 ak6Var = this.b;
        ak6Var.getClass();
        switch (i) {
            case 0:
                hm9.n("ak6", "stop");
                AtomicBoolean atomicBoolean = ak6Var.a;
                if (!atomicBoolean.get()) {
                    hm9.n("ak6", "stop: not started, return");
                }
                atomicBoolean.set(false);
                me6 me6Var = ak6Var.b;
                HashMap map = me6Var.b;
                le6 le6Var = (le6) map.get(ak6Var);
                if (le6Var != null) {
                    reg regVar = me6Var.a;
                    regVar.getClass();
                    String simpleName = le6.class.getSimpleName();
                    fp3.k(simpleName, "Listener type must not be empty");
                    regVar.b(new hm7(le6Var, simpleName), 2418).j(ok4.X, oz7.X);
                    map.remove(ak6Var);
                    break;
                }
                break;
            default:
                hm9.n("ak6", "start");
                if (ak6Var.a.get()) {
                    hm9.n("ak6", "start: already started, return");
                }
                if (!wmd.j(ak6Var.d, wmd.f)) {
                    hm9.n("ak6", "start: no permissions");
                    ak6Var.c.U0();
                    break;
                } else {
                    me6 me6Var2 = ak6Var.b;
                    kr7 kr7VarA = ak6Var.a();
                    me6Var2.getClass();
                    LocationRequest locationRequest = new LocationRequest();
                    int i2 = kr7VarA.b;
                    if (i2 != 0) {
                        int iS = au1.s(i2);
                        int i3 = 105;
                        if (iS != 0) {
                            if (iS == 1) {
                                i3 = HttpStatus.SC_PROCESSING;
                            } else if (iS != 2) {
                                Locale locale = Locale.ENGLISH;
                                hm9.p("me6", "Unknown priority " + zr6.r(kr7VarA.b) + " set to PRIORITY_NO_POWER", null);
                            } else {
                                i3 = 100;
                            }
                        }
                        ay7.U(i3);
                        locationRequest.a = i3;
                    }
                    Long l = kr7VarA.c;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        fp3.g("intervalMillis must be greater than or equal to 0", jLongValue >= 0);
                        long j = locationRequest.c;
                        long j2 = locationRequest.b;
                        if (j == j2 / 6) {
                            locationRequest.c = jLongValue / 6;
                        }
                        if (locationRequest.t0 == j2) {
                            locationRequest.t0 = jLongValue;
                        }
                        locationRequest.b = jLongValue;
                    }
                    Long l2 = kr7VarA.d;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        fp3.h(jLongValue2 >= 0, "illegal fastest interval: %d", l2);
                        locationRequest.c = jLongValue2;
                    }
                    le6 le6Var2 = new le6(ak6Var);
                    reg regVar2 = me6Var2.a;
                    regVar2.getClass();
                    Looper looperMyLooper = Looper.myLooper();
                    fp3.o(looperMyLooper, "invalid null looper");
                    rw4 rw4Var = new rw4(looperMyLooper, le6Var2, le6.class.getSimpleName());
                    td tdVar = new td(regVar2, rw4Var);
                    wva wvaVar = new wva(tdVar, 18, locationRequest);
                    pkg pkgVar = new pkg();
                    pkgVar.a = wvaVar;
                    pkgVar.c = tdVar;
                    pkgVar.o = rw4Var;
                    pkgVar.b = 2436;
                    hm7 hm7Var = (hm7) rw4Var.c;
                    fp3.o(hm7Var, "Key must not be null");
                    rw4 rw4Var2 = (rw4) pkgVar.o;
                    int i4 = pkgVar.b;
                    bdb bdbVar = new bdb(pkgVar, rw4Var2, i4);
                    nof nofVar = new nof(pkgVar, hm7Var);
                    fp3.o((hm7) rw4Var2.c, "Listener has already been released.");
                    ie6 ie6Var = regVar2.u0;
                    ie6Var.getClass();
                    qne qneVar = new qne();
                    ie6Var.e(qneVar, i4, regVar2);
                    udg udgVar = new udg(new ieg(new vdg(bdbVar, nofVar), qneVar), ie6Var.t0.get(), regVar2);
                    fc9 fc9Var = ie6Var.x0;
                    fc9Var.sendMessage(fc9Var.obtainMessage(8, udgVar));
                    me6Var2.b.put(ak6Var, le6Var2);
                    ak6Var.a.set(true);
                    break;
                }
        }
    }
}
