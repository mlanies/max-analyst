package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class cq7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public cq7(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public final dq7 a(qq7 qq7Var, up7 up7Var) {
        int i = 1;
        boolean z = up7Var instanceof j00;
        je7 je7Var = this.b;
        je7 je7Var2 = this.a;
        if (!z) {
            return new dq7(qq7Var, (p4d) je7Var2.getValue(), (hle) je7Var.getValue(), up7Var);
        }
        p4d p4dVar = (p4d) je7Var2.getValue();
        hle hleVar = (hle) je7Var.getValue();
        j00 j00Var = (j00) up7Var;
        oz ozVar = (oz) this.c.getValue();
        l00 l00Var = new l00(qq7Var, p4dVar, hleVar, j00Var);
        String str = j00Var.u0.s;
        if (str != null && str.length() != 0) {
            p4dVar.o(j00Var, new File(j00Var.u0.s));
            qq7Var.C(false);
            return l00Var;
        }
        hm9.n("l00", "Start download attach");
        qq7Var.C(true);
        die dieVarA = ozVar.a(j00Var.u0);
        dieVarA.T(new f9(l00Var, i, j00Var), new ync(4, l00Var));
        l00Var.Y = dieVarA;
        return l00Var;
    }
}
