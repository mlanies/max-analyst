package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ym3 extends gle implements dt7 {
    public final List c;

    public ym3(List list) {
        this.c = list;
    }

    @Override // defpackage.dt7
    public final String a(boolean z, boolean z2) {
        return "CONTACT_INFO.Response(contacts=" + wmd.x(this.c, z, z2) + ')';
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.c) {
            if (((wm3) obj) != um3.A0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym3) && tpa.f(this.c, ((ym3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.zje
    public final String toString() {
        return a(false, false);
    }
}
