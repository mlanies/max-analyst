package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class xq2 {
    public final List a;
    public final long b;
    public final Long c;

    public xq2(ik5 ik5Var) {
        this.a = (List) ik5Var.b;
        this.b = ik5Var.a;
        this.c = (Long) ik5Var.c;
    }

    public static xq2 a(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        if (iN == 0) {
            return null;
        }
        ik5 ik5Var = new ik5();
        ArrayList arrayList = new ArrayList(jm2.X);
        for (int i = 0; i < iN; i++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            switch (strZ0) {
                case "dontDisturbUntil":
                    ik5Var.a = gy8Var.w0();
                    break;
                case "led":
                    if (gy8Var.u0()) {
                        arrayList.add(jm2.LED);
                        break;
                    } else {
                        break;
                    }
                case "vibr":
                    if (gy8Var.u0()) {
                        arrayList.add(jm2.VIBRATION);
                        break;
                    } else {
                        break;
                    }
                case "sound":
                    if (gy8Var.u0()) {
                        arrayList.add(jm2.SOUND);
                        break;
                    } else {
                        break;
                    }
                case "favIndex":
                    ik5Var.c = Long.valueOf(lz7.M(gy8Var, 0L));
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        ik5Var.b = arrayList;
        return new xq2(ik5Var);
    }

    public final String toString() {
        Long l = this.c;
        String string = l != null ? l.toString() : "null";
        StringBuilder sb = new StringBuilder("ChatSettings{options=");
        sb.append(this.a);
        sb.append(", dontDisturbUntil=");
        ms2.j(this.b, ", favoriteIndex = ", string, sb);
        sb.append("}");
        return sb.toString();
    }
}
