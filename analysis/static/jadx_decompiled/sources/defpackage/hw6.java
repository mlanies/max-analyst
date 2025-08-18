package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hw6 extends n1 implements rx6, uaf, Iterable {
    public static final hw6 b = new hw6(new uaf[0]);
    public final uaf[] a;

    public hw6(uaf[] uafVarArr) {
        this.a = uafVarArr;
    }

    @Override // defpackage.uaf
    public final String a() {
        uaf[] uafVarArr = this.a;
        if (uafVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(uafVarArr[0].a());
        for (int i = 1; i < uafVarArr.length; i++) {
            sb.append(",");
            sb.append(uafVarArr[i].a());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.n1, defpackage.uaf
    public final hw6 c() {
        return this;
    }

    @Override // defpackage.uaf
    public final int e() {
        return 7;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uafVar = (uaf) obj;
        boolean z = uafVar instanceof hw6;
        uaf[] uafVarArr = this.a;
        if (z) {
            return Arrays.equals(uafVarArr, ((hw6) uafVar).a);
        }
        int iE = ((n1) uafVar).e();
        if (iE == 0) {
            throw null;
        }
        if (iE != 7) {
            return false;
        }
        hw6 hw6VarC = uafVar.c();
        if (uafVarArr.length != hw6VarC.a.length) {
            return false;
        }
        Iterator it = hw6VarC.iterator();
        for (uaf uafVar2 : uafVarArr) {
            gw6 gw6Var = (gw6) it;
            if (!gw6Var.hasNext() || !uafVar2.equals(gw6Var.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        int i = 0;
        while (true) {
            uaf[] uafVarArr = this.a;
            if (i >= uafVarArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + uafVarArr[i].hashCode();
            i++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gw6(this.a, 0);
    }

    @Override // defpackage.n1
    /* renamed from: r */
    public final hw6 c() {
        return this;
    }

    public final String toString() {
        uaf[] uafVarArr = this.a;
        if (uafVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        uaf uafVar = uafVarArr[0];
        if (h4f.g(((n1) uafVar).e())) {
            sb.append(uafVar.a());
        } else {
            sb.append(uafVar.toString());
        }
        for (int i = 1; i < uafVarArr.length; i++) {
            sb.append(",");
            uaf uafVar2 = uafVarArr[i];
            if (h4f.g(((n1) uafVar2).e())) {
                sb.append(uafVar2.a());
            } else {
                sb.append(uafVar2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
