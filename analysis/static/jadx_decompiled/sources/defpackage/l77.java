package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l77 extends p1 {
    public final Iterator X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int o = 0;

    public l77(Iterator it, a7b a7bVar) {
        this.X = it;
        this.Y = a7bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.p1
    public final Object a() {
        Object next;
        Object next2;
        switch (this.o) {
            case 0:
                do {
                    Iterator it = this.X;
                    if (!it.hasNext()) {
                        this.b = 3;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((a7b) this.Y).apply(next));
            default:
                do {
                    Iterator it2 = this.X;
                    if (!it2.hasNext()) {
                        this.b = 3;
                        break;
                    } else {
                        next2 = it2.next();
                    }
                } while (!((xbd) this.Y).b.contains(next2));
        }
        return null;
    }

    public l77(xbd xbdVar) {
        this.Y = xbdVar;
        this.X = xbdVar.a.iterator();
    }
}
