package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class pqc extends qqc implements Iterator {
    public oqc a;
    public boolean b = true;
    public final /* synthetic */ rqc c;

    public pqc(rqc rqcVar) {
        this.c = rqcVar;
    }

    @Override // defpackage.qqc
    public final void a(oqc oqcVar) {
        oqc oqcVar2 = this.a;
        if (oqcVar == oqcVar2) {
            oqc oqcVar3 = oqcVar2.o;
            this.a = oqcVar3;
            this.b = oqcVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        oqc oqcVar = this.a;
        return (oqcVar == null || oqcVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            oqc oqcVar = this.a;
            this.a = oqcVar != null ? oqcVar.c : null;
        }
        return this.a;
    }
}
