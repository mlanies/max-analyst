package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p06 implements uhc {
    public final ArrayList a;

    public p06(Set set) {
        this.a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            uhc uhcVar = (uhc) it.next();
            if (uhcVar != null) {
                this.a.add(uhcVar);
            }
        }
    }

    public static void l(Exception exc, String str) {
        ta5.c("ForwardingRequestListener", str, exc);
    }

    @Override // defpackage.uhc
    public final void a(wv6 wv6Var, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).a(wv6Var, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestSuccess");
            }
        }
    }

    @Override // defpackage.uhc
    public final void b(wv6 wv6Var, Object obj, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).b(wv6Var, obj, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestStart");
            }
        }
    }

    @Override // defpackage.uhc
    public final void c(wv6 wv6Var, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).c(wv6Var, str, th, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestFailure");
            }
        }
    }

    @Override // defpackage.uhc
    public final void d(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).d(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerStart");
            }
        }
    }

    @Override // defpackage.uhc
    public final void e(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).e(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithCancellation");
            }
        }
    }

    @Override // defpackage.uhc
    public final void f(String str, String str2, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).f(str, str2, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // defpackage.uhc
    public final void g(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).g(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onIntermediateChunkStart");
            }
        }
    }

    @Override // defpackage.uhc
    public final boolean h(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((uhc) arrayList.get(i)).h(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uhc
    public final void i(String str, String str2, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).i(str, str2, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    @Override // defpackage.uhc
    public final void j(String str, String str2, Throwable th, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).j(str, str2, th, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithFailure");
            }
        }
    }

    @Override // defpackage.uhc
    public final void k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((uhc) arrayList.get(i)).k(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestCancellation");
            }
        }
    }

    public p06(uhc... uhcVarArr) {
        this.a = new ArrayList(uhcVarArr.length);
        for (uhc uhcVar : uhcVarArr) {
            if (uhcVar != null) {
                this.a.add(uhcVar);
            }
        }
    }
}
