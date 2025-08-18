package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class km4 implements c6d {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ km4(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new jm4(((c6d) this.c).iterator(), (pz2) ((m56) this.b));
            case 1:
                return new ia6(this);
            case 2:
                return new ds8(this);
            default:
                ArrayList arrayList = new ArrayList();
                l6d.h0((c6d) this.c, arrayList);
                c63.U(arrayList, (Comparator) this.b);
                return arrayList.iterator();
        }
    }
}
