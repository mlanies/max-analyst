package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class fd2 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Set set;
        switch (this.a) {
            case 0:
                ld2 ld2Var = (ld2) this.b;
                ld2Var.t.j(-1);
                ld2Var.v.j(-1);
                break;
            case 1:
                oe3 oe3Var = (oe3) this.b;
                int iDiff = configuration.diff(oe3Var.b);
                oe3Var.b = new Configuration(configuration);
                ConcurrentHashMap concurrentHashMap = oe3Var.a;
                for (Integer num : concurrentHashMap.keySet()) {
                    if ((num.intValue() & iDiff) != 0 && (set = (Set) concurrentHashMap.get(num)) != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((ne3) it.next()).a();
                        }
                    }
                }
                break;
            default:
                ((wva) this.b).getClass();
                int i = configuration.uiMode & 48;
                l63 l63Var = i != 16 ? i != 32 ? l63.c : l63.b : l63.a;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "SystemThemeObserver", "onConfigurationChanged scheme=" + l63Var + ", uiMode=0x" + Integer.toHexString(configuration.uiMode & 48), null);
                }
                ((q0e) ((wva) this.b).b).m(null, l63Var);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                ld2 ld2Var = (ld2) this.b;
                ld2Var.t.j(-1);
                ld2Var.v.j(-1);
                break;
        }
    }

    public fd2(oe3 oe3Var, Context context) {
        this.a = 1;
        this.b = oe3Var;
    }
}
