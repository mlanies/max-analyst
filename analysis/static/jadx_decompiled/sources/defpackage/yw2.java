package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class yw2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ yw2(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iCompare = this.b.compare(obj, obj2);
                return iCompare != 0 ? iCompare : xfg.f(Integer.valueOf(((nn3) obj2).z0), Integer.valueOf(((nn3) obj).z0));
            case 1:
                int iCompare2 = this.b.compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                Thread thread = (Thread) obj;
                Thread thread2 = (Thread) obj2;
                return xfg.f(thread != null ? Long.valueOf(thread.getId()) : 0, thread2 != null ? Long.valueOf(thread2.getId()) : 0);
            case 2:
                int iCompare3 = this.b.compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : xfg.f(Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(System.identityHashCode(obj2)));
            default:
                int iCompare4 = this.b.compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : xfg.f(Integer.valueOf(((nn3) obj2).z0), Integer.valueOf(((nn3) obj).z0));
        }
    }
}
