package defpackage;

/* loaded from: classes2.dex */
public final class fx6 extends n1 implements rx6, uaf {
    public static final fx6 b = new fx6(new uaf[0]);
    public final uaf[] a;

    public fx6(uaf[] uafVarArr) {
        this.a = uafVarArr;
    }

    public static void x(StringBuilder sb, uaf uafVar) {
        if (h4f.g(((n1) uafVar).e())) {
            sb.append(uafVar.a());
        } else {
            sb.append(uafVar.toString());
        }
    }

    @Override // defpackage.uaf
    public final String a() {
        uaf[] uafVarArr = this.a;
        if (uafVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbL = au1.l("{");
        uaf uafVar = uafVarArr[0];
        if (h4f.g(((n1) uafVar).e())) {
            sbL.append(uafVar.a());
        } else {
            m1.x(sbL, uafVar.toString());
        }
        sbL.append(":");
        sbL.append(uafVarArr[1].a());
        for (int i = 2; i < uafVarArr.length; i += 2) {
            sbL.append(",");
            uaf uafVar2 = uafVarArr[i];
            if (h4f.g(((n1) uafVar2).e())) {
                sbL.append(uafVar2.a());
            } else {
                m1.x(sbL, uafVar2.toString());
            }
            sbL.append(":");
            sbL.append(uafVarArr[i + 1].a());
        }
        sbL.append("}");
        return sbL.toString();
    }

    @Override // defpackage.uaf
    public final int e() {
        return 8;
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
        int iE = ((n1) uafVar).e();
        if (iE == 0) {
            throw null;
        }
        if (iE != 8) {
            return false;
        }
        fx6 fx6VarG = uafVar.g();
        ex6 ex6Var = new ex6(this.a);
        fx6VarG.getClass();
        return ex6Var.equals(new ex6(fx6VarG.a));
    }

    @Override // defpackage.n1, defpackage.uaf
    public final fx6 g() {
        return this;
    }

    public final int hashCode() {
        int i = 0;
        int iHashCode = 0;
        while (true) {
            uaf[] uafVarArr = this.a;
            if (i >= uafVarArr.length) {
                return iHashCode;
            }
            iHashCode += uafVarArr[i + 1].hashCode() ^ uafVarArr[i].hashCode();
            i += 2;
        }
    }

    public final String toString() {
        uaf[] uafVarArr = this.a;
        if (uafVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbL = au1.l("{");
        x(sbL, uafVarArr[0]);
        sbL.append(":");
        x(sbL, uafVarArr[1]);
        for (int i = 2; i < uafVarArr.length; i += 2) {
            sbL.append(",");
            x(sbL, uafVarArr[i]);
            sbL.append(":");
            x(sbL, uafVarArr[i + 1]);
        }
        sbL.append("}");
        return sbL.toString();
    }

    @Override // defpackage.n1
    /* renamed from: w */
    public final fx6 g() {
        return this;
    }
}
