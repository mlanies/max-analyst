package defpackage;

import java.io.File;
import java.util.Arrays;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final /* synthetic */ class mke implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oke b;
    public final /* synthetic */ wd6 c;

    public /* synthetic */ mke(oke okeVar, wd6 wd6Var, int i) {
        this.a = i;
        this.b = okeVar;
        this.c = wd6Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        int i = 2;
        wd6 wd6Var = this.c;
        oke okeVar = this.b;
        switch (this.a) {
            case 0:
                nke nkeVar = (nke) obj;
                okeVar.getClass();
                boolean z = nkeVar.b;
                File file = nkeVar.a;
                if (!z) {
                    hm9.n("oke", "Hasn't tam emoji font file");
                    hm9.n("oke", "Download font");
                    if (!cqc.c(okeVar.t0)) {
                        hm9.n("oke", "Font already downloading");
                        break;
                    } else {
                        je7 je7Var = okeVar.Z;
                        ((gh3) je7Var.getValue()).c(okeVar);
                        if (((gh3) je7Var.getValue()).b() == zh3.c) {
                            iz9 iz9Var = new iz9(new bd5(okeVar, file, i), 0);
                            fme fmeVar = (fme) okeVar.a.getValue();
                            fmeVar.getClass();
                            j1a j1aVarO = new e0a(iz9Var, new dme(fmeVar, 5, i), 6).o(5L, ft.g);
                            hle hleVar = (hle) okeVar.X.getValue();
                            hleVar.getClass();
                            s1a s1aVarR = j1aVarO.r(((jle) hleVar).a());
                            sd7 sd7Var = new sd7(new u00(okeVar, file, wd6Var, 28), new mke(okeVar, wd6Var, i), ft.d);
                            s1aVarR.a(sd7Var);
                            okeVar.t0 = sd7Var;
                            break;
                        } else {
                            if (wd6Var != null) {
                                wd6Var.y();
                            }
                            hm9.k0("oke", null, "Can't download now. Waiting for Wi-Fi", Arrays.copyOf(new Object[0], 0));
                            break;
                        }
                    }
                } else {
                    hm9.n("oke", "Has tam emoji font file");
                    okeVar.d(file, wd6Var);
                    break;
                }
            case 1:
                ((cba) ((o45) okeVar.Y.getValue())).c(new HandledException("Can't read emoji font", (Throwable) obj), true);
                if (wd6Var != null) {
                    wd6Var.y();
                }
                okeVar.u0 = null;
                break;
            default:
                ((cba) ((o45) okeVar.Y.getValue())).c(new HandledException("Can't download emoji font", (Throwable) obj), true);
                if (wd6Var != null) {
                    wd6Var.y();
                }
                ((gh3) okeVar.Z.getValue()).e(okeVar);
                okeVar.u0 = null;
                break;
        }
    }
}
