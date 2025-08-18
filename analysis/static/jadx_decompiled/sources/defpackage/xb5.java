package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class xb5 extends rqc {
    public final HashMap X = new HashMap();

    @Override // defpackage.rqc
    public final oqc a(Object obj) {
        return (oqc) this.X.get(obj);
    }

    @Override // defpackage.rqc
    public final Object b(Object obj, Object obj2) {
        oqc oqcVarA = a(obj);
        if (oqcVarA != null) {
            return oqcVarA.b;
        }
        HashMap map = this.X;
        oqc oqcVar = new oqc(obj, obj2);
        this.o++;
        oqc oqcVar2 = this.b;
        if (oqcVar2 == null) {
            this.a = oqcVar;
            this.b = oqcVar;
        } else {
            oqcVar2.c = oqcVar;
            oqcVar.o = oqcVar2;
            this.b = oqcVar;
        }
        map.put(obj, oqcVar);
        return null;
    }

    @Override // defpackage.rqc
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.X.remove(obj);
        return objC;
    }
}
