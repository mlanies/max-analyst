package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class rqc implements Iterable {
    public oqc a;
    public oqc b;
    public final WeakHashMap c = new WeakHashMap();
    public int o = 0;

    public oqc a(Object obj) {
        oqc oqcVar = this.a;
        while (oqcVar != null && !oqcVar.a.equals(obj)) {
            oqcVar = oqcVar.c;
        }
        return oqcVar;
    }

    public Object b(Object obj, Object obj2) {
        oqc oqcVarA = a(obj);
        if (oqcVarA != null) {
            return oqcVarA.b;
        }
        oqc oqcVar = new oqc(obj, obj2);
        this.o++;
        oqc oqcVar2 = this.b;
        if (oqcVar2 == null) {
            this.a = oqcVar;
            this.b = oqcVar;
            return null;
        }
        oqcVar2.c = oqcVar;
        oqcVar.o = oqcVar2;
        this.b = oqcVar;
        return null;
    }

    public Object c(Object obj) {
        oqc oqcVarA = a(obj);
        if (oqcVarA == null) {
            return null;
        }
        this.o--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((qqc) it.next()).a(oqcVarA);
            }
        }
        oqc oqcVar = oqcVarA.o;
        if (oqcVar != null) {
            oqcVar.c = oqcVarA.c;
        } else {
            this.a = oqcVarA.c;
        }
        oqc oqcVar2 = oqcVarA.c;
        if (oqcVar2 != null) {
            oqcVar2.o = oqcVar;
        } else {
            this.b = oqcVar;
        }
        oqcVarA.c = null;
        oqcVarA.o = null;
        return oqcVarA.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.nqc) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.rqc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rqc r6 = (defpackage.rqc) r6
            int r1 = r5.o
            int r3 = r6.o
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            nqc r1 = (defpackage.nqc) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            nqc r3 = (defpackage.nqc) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            nqc r6 = (defpackage.nqc) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            nqc nqcVar = (nqc) it;
            if (!nqcVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) nqcVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        nqc nqcVar = new nqc(this.a, this.b, 0);
        this.c.put(nqcVar, Boolean.FALSE);
        return nqcVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            nqc nqcVar = (nqc) it;
            if (!nqcVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) nqcVar.next()).toString());
            if (nqcVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
