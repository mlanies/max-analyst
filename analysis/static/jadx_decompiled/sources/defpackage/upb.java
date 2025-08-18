package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class upb extends gle {
    public Long X;
    public List c;
    public int o;

    public upb(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    @Override // defpackage.gle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.gy8 r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            r15.getClass()
            r3 = -1
            int r4 = r15.hashCode()
            switch(r4) {
                case -1081306054: goto L26;
                case -934426595: goto L1b;
                case 110549828: goto L10;
                default: goto Le;
            }
        Le:
            r15 = r3
            goto L30
        L10:
            java.lang.String r4 = "total"
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto L19
            goto Le
        L19:
            r15 = r0
            goto L30
        L1b:
            java.lang.String r4 = "result"
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto L24
            goto Le
        L24:
            r15 = r2
            goto L30
        L26:
            java.lang.String r4 = "marker"
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto L2f
            goto Le
        L2f:
            r15 = r1
        L30:
            switch(r15) {
                case 0: goto Lab;
                case 1: goto L40;
                case 2: goto L38;
                default: goto L33;
            }
        L33:
            r14.z()
            goto Lb5
        L38:
            int r14 = r14.v0()
            r13.o = r14
            goto Lb5
        L40:
            int r15 = defpackage.lz7.G(r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r15)
            r13.c = r4
            r4 = r1
        L4c:
            if (r4 >= r15) goto Lb5
            java.util.List r5 = r13.c
            int r6 = defpackage.lz7.N(r14)
            r7 = 0
            r10 = r1
            r8 = r7
            r9 = r8
        L58:
            if (r10 >= r6) goto La1
            java.lang.String r11 = r14.z0()
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case 3052376: goto L80;
                case 357304895: goto L75;
                case 951526432: goto L6a;
                default: goto L68;
            }
        L68:
            r11 = r3
            goto L8a
        L6a:
            java.lang.String r12 = "contact"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L73
            goto L68
        L73:
            r11 = r0
            goto L8a
        L75:
            java.lang.String r12 = "highlights"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L7e
            goto L68
        L7e:
            r11 = r2
            goto L8a
        L80:
            java.lang.String r12 = "chat"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L89
            goto L68
        L89:
            r11 = r1
        L8a:
            switch(r11) {
                case 0: goto L9b;
                case 1: goto L96;
                case 2: goto L91;
                default: goto L8d;
            }
        L8d:
            r14.z()
            goto L9f
        L91:
            kq3 r9 = defpackage.kq3.a(r14)
            goto L9f
        L96:
            wz r8 = defpackage.wz.g(r14)
            goto L9f
        L9b:
            f52 r7 = defpackage.f52.a(r14)
        L9f:
            int r10 = r10 + r2
            goto L58
        La1:
            vpb r6 = new vpb
            r6.<init>(r7, r8, r9)
            r5.add(r6)
            int r4 = r4 + r2
            goto L4c
        Lab:
            long r14 = r14.w0()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13.X = r14
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upb.b(gy8, java.lang.String):void");
    }

    @Override // defpackage.zje
    public final String toString() {
        int iO = s5c.o(this.c);
        int i = this.o;
        Long l = this.X;
        StringBuilder sbJ = wg0.j("{result=", iO, ", total=", i, ", marker=");
        sbJ.append(l);
        sbJ.append("}");
        return sbJ.toString();
    }
}
