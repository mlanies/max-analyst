package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Arrays;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* loaded from: classes2.dex */
public final class c46 implements lu6 {
    public static final khe c = new khe(new fh5(12));
    public static final khe d = new khe(new fh5(13));
    public final je7 a;
    public final je7 b;

    public c46(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(defpackage.qec r5, java.lang.String r6) {
        /*
            java.util.regex.Pattern r0 = r5.a
            java.util.regex.Matcher r6 = r0.matcher(r6)
            r0 = 0
            boolean r0 = r6.find(r0)
            r1 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L17
        L10:
            qz7 r0 = new qz7
            r2 = 24
            r0.<init>(r2, r6)
        L17:
            if (r0 == 0) goto L34
            java.lang.Object r6 = r0.c
            r08 r6 = (defpackage.r08) r6
            if (r6 != 0) goto L26
            r08 r6 = new r08
            r6.<init>(r0)
            r0.c = r6
        L26:
            java.lang.Object r6 = r0.c
            r08 r6 = (defpackage.r08) r6
            if (r6 == 0) goto L34
            r0 = 1
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            goto L35
        L34:
            r6 = r1
        L35:
            if (r6 == 0) goto L40
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L41
        L40:
            r6 = r1
        L41:
            if (r6 == 0) goto L48
            int r5 = r6.intValue()
            return r5
        L48:
            java.lang.Class<c46> r6 = defpackage.c46.class
            java.lang.String r6 = r6.getName()
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L53
            goto L6c
        L53:
            boolean r2 = r0.c()
            if (r2 == 0) goto L6c
            us7 r2 = defpackage.us7.Z
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't determine SVG size by regex "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.d(r2, r6, r5, r1)
        L6c:
            r5 = 100
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c46.b(qec, java.lang.String):int");
    }

    @Override // defpackage.lu6
    public final l43 a(g05 g05Var, int i, pqb pqbVar, ju6 ju6Var) {
        Object njcVar;
        v84 v84VarA = ((m5b) this.a.getValue()).b().a(i);
        try {
            Object objE0 = v84VarA.e0();
            byte[] bArr = (byte[]) objE0;
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
            byte[] bArr2 = (byte[]) objE0;
            ((qq8) o43.o(g05Var.a).e0()).S(0, 0, i, bArr2);
            String str = new String(bArr2, 0, i, a52.a);
            v3c.i(v84VarA, null);
            int iB = b((qec) c.getValue(), str);
            int iB2 = b((qec) d.getValue(), str);
            o43 o43VarC = ((s2b) this.b.getValue()).c(iB, iB2, ju6Var.a);
            try {
                Bitmap bitmap = (Bitmap) o43VarC.e0();
                bitmap.eraseColor(0);
                try {
                    njcVar = QrCodeGenerator.nativeRenderSvg(str, iB, iB2);
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                if (njcVar instanceof njc) {
                    njcVar = null;
                }
                int[] iArr = (int[]) njcVar;
                if (iArr != null) {
                    bitmap.setPixels(iArr, 0, iB, 0, 0, iB, iB2);
                }
                CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(o43VarC, pqbVar, 0);
                v3c.i(o43VarC, null);
                return closeableStaticBitmapOf;
            } finally {
            }
        } finally {
        }
    }
}
