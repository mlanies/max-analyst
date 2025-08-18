package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g4e extends gle {
    public ArrayList c;
    public long o;

    public g4e(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = gy8Var.w0();
            return;
        }
        if (!str.equals("stickers")) {
            gy8Var.z();
            return;
        }
        int iG = lz7.G(gy8Var);
        this.c = new ArrayList(iG);
        for (int i = 0; i < iG; i++) {
            this.c.add(Long.valueOf(gy8Var.w0()));
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{stickerIds=" + this.c + ", marker=" + this.o + "}";
    }
}
