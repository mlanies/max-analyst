package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qu1 implements tu1 {
    public final /* synthetic */ su1 a;

    public qu1(su1 su1Var) {
        this.a = su1Var;
    }

    @Override // defpackage.tu1
    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((tu1) it.next()).a(totalCaptureResult));
        }
        nl7 nl7VarB = kq0.b(arrayList);
        mu1 mu1Var = new mu1(2);
        return kq0.K(nl7VarB, new re6(15, mu1Var), ju0.k());
    }

    @Override // defpackage.tu1
    public final boolean b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            if (((tu1) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tu1
    public final void c() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((tu1) it.next()).c();
        }
    }
}
