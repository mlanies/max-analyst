package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class i77 implements Iterable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i77(Iterable iterable, Object obj, int i) {
        this.a = i;
        this.b = iterable;
        this.c = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new h77(this, this.b.iterator());
            default:
                return new j77(this, this.b.iterator());
        }
    }
}
