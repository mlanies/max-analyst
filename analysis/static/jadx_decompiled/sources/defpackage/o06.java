package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o06 implements thc {
    public final ArrayList a;

    public o06(Set set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.hab
    public final void a(eab eabVar, String str, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).a(eabVar, str, map);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.hab
    public final void b(eab eabVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).b(eabVar);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // defpackage.thc
    public final void c(eab eabVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).c(eabVar);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // defpackage.hab
    public final void d(eab eabVar, String str, Throwable th, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).d(eabVar, str, th, map);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // defpackage.hab
    public final void e(eab eabVar, String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).e(eabVar, str, z);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.thc
    public final void f(eab eabVar, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).f(eabVar, th);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // defpackage.thc
    public final void g(eab eabVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).g(eabVar);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // defpackage.thc
    public final void h(eab eabVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).h(eabVar);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // defpackage.hab
    public final boolean i(eab eabVar, String str) {
        ArrayList arrayList = this.a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((thc) it.next()).i(eabVar, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hab
    public final void j(eab eabVar, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).j(eabVar, str);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // defpackage.hab
    public final void k(eab eabVar, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((thc) it.next()).k(eabVar, str);
            } catch (Exception e) {
                ta5.c("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }
}
