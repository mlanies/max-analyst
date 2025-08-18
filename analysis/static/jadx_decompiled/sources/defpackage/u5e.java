package defpackage;

import android.view.MenuItem;
import com.google.android.gms.location.LocationAvailability;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class u5e implements w2e, a76, kwe, im7 {
    public Object a;

    public /* synthetic */ u5e(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.a76
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public void b(boolean z) {
        py0 py0Var = (py0) this.a;
        py0Var.V0.log("OKRTCCall", "Screen capture has stopped, fast=" + z);
        py0Var.s0.post(new u60(this, z, 14));
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        ihe iheVar;
        ihe iheVar2 = (ihe) this.a;
        jhe jheVar = (jhe) iheVar2;
        synchronized (jheVar.a) {
            try {
                List list = jheVar.j;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((xf4) it.next()).b();
                    }
                    jheVar.j = null;
                }
            } finally {
            }
        }
        jheVar.t.d();
        q40 q40Var = iheVar2.b;
        Iterator it2 = q40Var.h().iterator();
        while (it2.hasNext() && (iheVar = (ihe) it2.next()) != iheVar2) {
            jhe jheVar2 = (jhe) iheVar;
            synchronized (jheVar2.a) {
                try {
                    List list2 = jheVar2.j;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((xf4) it3.next()).b();
                        }
                        jheVar2.j = null;
                    }
                } finally {
                }
            }
            jheVar2.t.d();
        }
        synchronized (q40Var.b) {
            ((LinkedHashSet) q40Var.X).remove(iheVar2);
        }
    }

    @Override // defpackage.im7
    public void f(Object obj) {
        le6 le6Var = (le6) obj;
        le6Var.getClass();
        boolean z = ((LocationAvailability) this.a).o < 1000;
        le6Var.a.getClass();
        hm9.m("ak6", "onLocationAvailability: %s", Boolean.valueOf(z));
    }

    @Override // defpackage.w2e
    public void g(z2e z2eVar) {
        ((t5e) this.a).g(z2eVar);
    }

    @Override // defpackage.w2e
    public void k(z2e z2eVar) {
        ((t5e) this.a).k(z2eVar);
    }

    @Override // defpackage.kwe
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((mwe) this.a).X.onMenuItemSelected(0, menuItem);
    }
}
