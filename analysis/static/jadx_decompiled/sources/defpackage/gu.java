package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class gu extends gle implements Serializable {
    public List X;
    public long Y;
    public List c;
    public List o;

    public gu(gy8 gy8Var) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    @Override // defpackage.gle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.gy8 r16, java.lang.String r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r17.getClass()
            r5 = -1
            int r6 = r17.hashCode()
            switch(r6) {
                case -1081306054: goto L32;
                case 1531715286: goto L27;
                case 1596679982: goto L1c;
                case 1651659013: goto L11;
                default: goto L10;
            }
        L10:
            goto L3c
        L11:
            java.lang.String r6 = "backgrounds"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L1a
            goto L3c
        L1a:
            r5 = 3
            goto L3c
        L1c:
            java.lang.String r6 = "stickerSets"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L25
            goto L3c
        L25:
            r5 = 2
            goto L3c
        L27:
            java.lang.String r6 = "stickers"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L30
            goto L3c
        L30:
            r5 = 1
            goto L3c
        L32:
            java.lang.String r6 = "marker"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L3b
            goto L3c
        L3b:
            r5 = 0
        L3c:
            switch(r5) {
                case 0: goto Lca;
                case 1: goto Lc3;
                case 2: goto Lbc;
                case 3: goto L44;
                default: goto L3f;
            }
        L3f:
            r16.z()
            goto Ld0
        L44:
            int r2 = defpackage.lz7.G(r16)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r0.X = r5
            r5 = 0
        L50:
            if (r5 >= r2) goto Ld0
            java.util.List r6 = r0.X
            int r7 = defpackage.lz7.N(r16)
            java.lang.String r9 = ""
            r13 = r9
            r14 = r13
            r10 = 0
            r11 = 0
        L5f:
            if (r10 >= r7) goto Lb1
            java.lang.String r3 = r16.z0()
            if (r3 == 0) goto L79
            int r4 = r3.hashCode()
            r8 = 3355(0xd1b, float:4.701E-42)
            if (r4 == r8) goto L9b
            r8 = 116079(0x1c56f, float:1.62661E-40)
            if (r4 == r8) goto L8d
            r8 = 94842723(0x5a72f63, float:1.5722012E-35)
            if (r4 == r8) goto L7c
        L79:
            r3 = 0
            goto Lab
        L7c:
            java.lang.String r4 = "color"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L85
            goto L79
        L85:
            java.lang.String r14 = defpackage.lz7.Q(r1, r9)
        L89:
            r3 = 0
        L8b:
            r8 = 1
            goto Laf
        L8d:
            java.lang.String r4 = "url"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L96
            goto L79
        L96:
            java.lang.String r13 = defpackage.lz7.Q(r1, r9)
            goto L89
        L9b:
            java.lang.String r4 = "id"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La4
            goto L79
        La4:
            r3 = 0
            long r11 = defpackage.lz7.M(r1, r3)
            goto L8b
        Lab:
            r16.z()
            goto L8b
        Laf:
            int r10 = r10 + r8
            goto L5f
        Lb1:
            r8 = 1
            ke0 r3 = new ke0
            r3.<init>(r11, r13, r14)
            r6.add(r3)
            int r5 = r5 + r8
            goto L50
        Lbc:
            wz r1 = defpackage.wz.d(r16)
            r0.o = r1
            goto Ld0
        Lc3:
            wz r1 = defpackage.wz.d(r16)
            r0.c = r1
            goto Ld0
        Lca:
            long r1 = r16.w0()
            r0.Y = r1
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu.b(gy8, java.lang.String):void");
    }

    @Override // defpackage.zje
    public final String toString() {
        int iO = s5c.o(this.c);
        int iO2 = s5c.o(this.o);
        int iO3 = s5c.o(this.X);
        long j = this.Y;
        StringBuilder sbJ = wg0.j("{stickers=", iO, "stickerSets=", iO2, "backgrounds=");
        sbJ.append(iO3);
        sbJ.append(", marker=");
        sbJ.append(j);
        sbJ.append("}");
        return sbJ.toString();
    }
}
