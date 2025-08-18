package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class uq3 extends gle implements Serializable {
    public int c;
    public String o;

    public uq3(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        int i;
        str.getClass();
        if (!str.equals("verifyResult")) {
            if (str.equals("name")) {
                this.o = lz7.P(gy8Var);
                return;
            } else {
                gy8Var.z();
                return;
            }
        }
        String strP = lz7.P(gy8Var);
        if (strP == null) {
            throw new NullPointerException("Name is null");
        }
        if (strP.equals("GOOD")) {
            i = 1;
        } else if (strP.equals("BAD")) {
            i = 2;
        } else {
            if (!strP.equals("UNDEFINED")) {
                throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.ContactVerifyCmd.VerifyResult.".concat(strP));
            }
            i = 3;
        }
        this.c = i;
    }

    @Override // defpackage.zje
    public final String toString() {
        int i = this.c;
        String str = this.o;
        StringBuilder sb = new StringBuilder("{verifyResult=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNDEFINED" : "BAD" : "GOOD");
        sb.append(", name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
