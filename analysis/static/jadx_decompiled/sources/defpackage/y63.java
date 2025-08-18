package defpackage;

/* loaded from: classes.dex */
public final class y63 extends rd7 implements a66 {
    public static final y63 b = new y63(2, 0);
    public static final y63 c = new y63(2, 1);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y63(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        z63 z63Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                jx3 jx3Var = (jx3) obj2;
                if (str.length() == 0) {
                    return jx3Var.toString();
                }
                return str + ", " + jx3Var;
            default:
                jx3 jx3Var2 = (jx3) obj2;
                lx3 lx3VarMinusKey = ((lx3) obj).minusKey(jx3Var2.getKey());
                hz4 hz4Var = hz4.a;
                if (lx3VarMinusKey == hz4Var) {
                    return jx3Var2;
                }
                vu4 vu4Var = vu4.b;
                iu3 iu3Var = (iu3) lx3VarMinusKey.get(vu4Var);
                if (iu3Var == null) {
                    z63Var = new z63(lx3VarMinusKey, jx3Var2);
                } else {
                    lx3 lx3VarMinusKey2 = lx3VarMinusKey.minusKey(vu4Var);
                    if (lx3VarMinusKey2 == hz4Var) {
                        return new z63(jx3Var2, iu3Var);
                    }
                    z63Var = new z63(new z63(lx3VarMinusKey2, jx3Var2), iu3Var);
                }
                return z63Var;
        }
    }
}
