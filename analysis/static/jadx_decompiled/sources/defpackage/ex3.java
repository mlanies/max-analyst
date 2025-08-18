package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ex3 implements Iterable {
    public List X;
    public final /* synthetic */ int a;
    public final Object b;
    public final HashMap c;
    public Set o;

    public ex3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Object();
                this.c = new HashMap();
                this.o = Collections.emptySet();
                this.X = Collections.emptyList();
                break;
            default:
                this.b = new Object();
                this.c = new HashMap();
                this.o = Collections.emptySet();
                this.X = Collections.emptyList();
                break;
        }
    }

    public final int a(Object obj) {
        int iIntValue;
        int iIntValue2;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        iIntValue = this.c.containsKey(obj) ? ((Integer) this.c.get(obj)).intValue() : 0;
                    } finally {
                    }
                }
                return iIntValue;
            default:
                synchronized (this.b) {
                    try {
                        iIntValue2 = this.c.containsKey(obj) ? ((Integer) this.c.get(obj)).intValue() : 0;
                    } finally {
                    }
                }
                return iIntValue2;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        Iterator it2;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    it = this.X.iterator();
                }
                return it;
            default:
                synchronized (this.b) {
                    it2 = this.X.iterator();
                }
                return it2;
        }
    }
}
