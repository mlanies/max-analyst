package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class lc2 extends gle {
    public wm3 X;
    public List c;
    public f52 o;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "chat":
                this.o = f52.a(gy8Var);
                break;
            case "user":
                this.X = wm3.e(gy8Var);
                break;
            case "chats":
                this.c = wz.b(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        o84.Z.getClass();
        return "{chats=" + Integer.valueOf(s5c.o(this.c)) + ", chat=" + this.o + ", contact=" + this.X + "}";
    }
}
