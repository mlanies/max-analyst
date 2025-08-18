package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h35 implements abe {
    public final List a;

    public a73 a(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            eqe eqeVarA = ((taf) it.next()).a(i, str);
            if (eqeVarA != null) {
                arrayList.add(eqeVarA);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new a73(arrayList);
        }
        return null;
    }

    @Override // defpackage.abe
    public int g(long j) {
        return -1;
    }

    @Override // defpackage.abe
    public long i(int i) {
        return 0L;
    }

    @Override // defpackage.abe
    public List p(long j) {
        return this.a;
    }

    @Override // defpackage.abe
    public int u() {
        return 1;
    }
}
