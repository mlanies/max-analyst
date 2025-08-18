package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class wz extends ArrayList {
    public static final /* synthetic */ int a = 0;

    public static wz a(gy8 gy8Var) {
        wz wzVar = new wz();
        int iS0 = gy8Var.s0();
        for (int i = 0; i < iS0; i++) {
            wzVar.add(bz.b(gy8Var));
        }
        return wzVar;
    }

    public static wz b(gy8 gy8Var) {
        int iS0 = gy8Var.s0();
        wz wzVar = new wz(iS0);
        for (int i = 0; i < iS0; i++) {
            wzVar.add(f52.a(gy8Var));
        }
        return wzVar;
    }

    public static wz c(gy8 gy8Var) {
        int iG = lz7.G(gy8Var);
        wz wzVar = new wz(iG);
        for (int i = 0; i < iG; i++) {
            wm3 wm3VarE = wm3.e(gy8Var);
            um3 um3Var = um3.A0;
            if (wm3VarE == null) {
                Objects.requireNonNull(um3Var, "defaultObj");
                wm3VarE = um3Var;
            }
            wzVar.add(wm3VarE);
        }
        return wzVar;
    }

    public static wz d(gy8 gy8Var) {
        int iG = lz7.G(gy8Var);
        wz wzVar = new wz(iG);
        for (int i = 0; i < iG; i++) {
            wzVar.add(Long.valueOf(lz7.M(gy8Var, 0L)));
        }
        return wzVar;
    }

    public static wz e(gy8 gy8Var) {
        wz wzVar = new wz();
        int iG = lz7.G(gy8Var);
        for (int i = 0; i < iG; i++) {
            wzVar.add(tpa.z(gy8Var));
        }
        return wzVar;
    }

    public static wz f(gy8 gy8Var) {
        int iG = lz7.G(gy8Var);
        wz wzVar = new wz(iG);
        for (int i = 0; i < iG; i++) {
            int iN = lz7.N(gy8Var);
            fs8 fs8VarZ = null;
            String strZ0 = null;
            ArrayList arrayList = null;
            long jW0 = 0;
            for (int i2 = 0; i2 < iN; i2++) {
                String strZ02 = gy8Var.z0();
                strZ02.getClass();
                switch (strZ02) {
                    case "chatId":
                        jW0 = gy8Var.w0();
                        break;
                    case "feedback":
                        strZ0 = gy8Var.z0();
                        break;
                    case "highlights":
                        int iG2 = lz7.G(gy8Var);
                        ArrayList arrayList2 = new ArrayList(iG2);
                        for (int i3 = 0; i3 < iG2; i3++) {
                            arrayList2.add(gy8Var.z0());
                        }
                        arrayList = arrayList2;
                        break;
                    case "message":
                        fs8VarZ = tpa.z(gy8Var);
                        break;
                    default:
                        gy8Var.z();
                        break;
                }
            }
            nx8 nx8Var = new nx8(strZ0, arrayList, jW0, fs8VarZ);
            if (fs8VarZ != null) {
                wzVar.add(nx8Var);
            }
        }
        return wzVar;
    }

    public static wz g(gy8 gy8Var) {
        int iG = lz7.G(gy8Var);
        wz wzVar = new wz(iG);
        for (int i = 0; i < iG; i++) {
            wzVar.add(lz7.P(gy8Var));
        }
        return wzVar;
    }
}
