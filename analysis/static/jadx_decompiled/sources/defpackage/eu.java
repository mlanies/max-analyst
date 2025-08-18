package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class eu extends gle {
    public List X;
    public List Y;
    public List c;
    public List o;

    public eu(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
        if (this.Y == null) {
            this.Y = Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:454:0x0282 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x05ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.gle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.gy8 r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu.b(gy8, java.lang.String):void");
    }

    @Override // defpackage.zje
    public final String toString() {
        int iO = s5c.o(this.c);
        int iO2 = s5c.o(this.o);
        int iO3 = s5c.o(this.X);
        int iO4 = s5c.o(this.Y);
        StringBuilder sbJ = wg0.j("{stickers=", iO, "stickerSets=", iO2, "animojis=");
        sbJ.append(iO3);
        sbJ.append("animojiSets=");
        sbJ.append(iO4);
        sbJ.append("}");
        return sbJ.toString();
    }
}
