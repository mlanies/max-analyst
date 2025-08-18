package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class scg implements Runnable {
    public final /* synthetic */ w5e a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ scg(w5e w5eVar, boolean z, boolean z2) {
        this.a = w5eVar;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5e w5eVar = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        ((kq7) w5eVar.a).n.log("OKRTCLmsAdapter", "capture state changed, isCapturing=" + z + ", isFailedStart=" + z2);
        tv1 tv1Var = ((kq7) w5eVar.a).r;
        if (tv1Var != null) {
            if (z) {
                Iterator it = tv1Var.f.iterator();
                while (it.hasNext()) {
                    ((kq7) it.next()).getClass();
                }
            } else if (z2) {
                return;
            } else {
                tv1Var.b();
            }
        }
        ece eceVar = ((kq7) w5eVar.a).x;
        if (eceVar != null) {
            ((py0) eceVar.a).k(w51.Z, Boolean.valueOf(z));
        }
        kq7 kq7Var = (kq7) w5eVar.a;
        Iterator it2 = kq7Var.c.iterator();
        while (it2.hasNext()) {
            ((mq7) it2.next()).b(kq7Var);
        }
    }
}
