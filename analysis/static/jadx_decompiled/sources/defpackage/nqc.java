package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class nqc extends qqc implements Iterator {
    public oqc a;
    public oqc b;
    public final /* synthetic */ int c;

    public nqc(oqc oqcVar, oqc oqcVar2, int i) {
        this.c = i;
        this.a = oqcVar2;
        this.b = oqcVar;
    }

    @Override // defpackage.qqc
    public final void a(oqc oqcVar) {
        oqc oqcVarC = null;
        if (this.a == oqcVar && oqcVar == this.b) {
            this.b = null;
            this.a = null;
        }
        oqc oqcVar2 = this.a;
        if (oqcVar2 == oqcVar) {
            this.a = b(oqcVar2);
        }
        oqc oqcVar3 = this.b;
        if (oqcVar3 == oqcVar) {
            oqc oqcVar4 = this.a;
            if (oqcVar3 != oqcVar4 && oqcVar4 != null) {
                oqcVarC = c(oqcVar3);
            }
            this.b = oqcVarC;
        }
    }

    public final oqc b(oqc oqcVar) {
        switch (this.c) {
            case 0:
                return oqcVar.o;
            default:
                return oqcVar.c;
        }
    }

    public final oqc c(oqc oqcVar) {
        switch (this.c) {
            case 0:
                return oqcVar.c;
            default:
                return oqcVar.o;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        oqc oqcVar = this.b;
        oqc oqcVar2 = this.a;
        this.b = (oqcVar == oqcVar2 || oqcVar2 == null) ? null : c(oqcVar);
        return oqcVar;
    }
}
