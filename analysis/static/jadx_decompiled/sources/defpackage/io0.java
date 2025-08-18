package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class io0 {
    public final y8 a;
    public final je7 b;
    public final je7 c;

    public io0(y8 y8Var, je7 je7Var, je7 je7Var2) {
        this.a = y8Var;
        this.b = je7Var;
        this.c = je7Var2;
    }

    public static Bitmap a(byte[] bArr) {
        Object njcVar;
        byte[] bArrDecode;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            bArrDecode = Base64.decode(bArr, 0);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (bArrDecode != null && bArrDecode.length != 0) {
            njcVar = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (njcVar == null) {
                return null;
            }
            return (Bitmap) (njcVar instanceof njc ? null : njcVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [njc] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.graphics.Bitmap] */
    public static byte[] c(Bitmap bitmap, byte[] bArr) {
        int iD;
        byte[] njcVar;
        if (bitmap.isRecycled() || (iD = qo0.d(bitmap)) == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iD);
        try {
            String name = io0.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, "try to encode bitmap by size " + bitmap.getWidth() + "x" + bitmap.getHeight(), null);
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                njcVar = byteArray.length == 0 ? bArr : Base64.encode(byteArray, 0);
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            if (!(njcVar instanceof njc)) {
                bArr = njcVar;
            }
            byte[] bArr2 = bArr;
            v3c.i(byteArrayOutputStream, null);
            return bArr2;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.wv6 r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ho0
            if (r0 == 0) goto L14
            r0 = r9
            ho0 r0 = (defpackage.ho0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ho0 r0 = new ho0
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.X
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Z
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            io0 r7 = r6.o
            defpackage.od2.a0(r9)
            goto L51
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.od2.a0(r9)
            je7 r9 = r7.b
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            iv6 r1 = (defpackage.iv6) r1
            r6.o = r7
            r6.Z = r2
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            r2 = r8
            java.lang.Object r9 = defpackage.fm9.d(r1, r2, r3, r5, r6)
            if (r9 != r0) goto L51
            return r0
        L51:
            o43 r9 = (defpackage.o43) r9
            r8 = 0
            if (r9 == 0) goto L87
            java.lang.Object r0 = r9.e0()     // Catch: java.lang.Throwable -> L61
            boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L63
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0     // Catch: java.lang.Throwable -> L61
            goto L64
        L61:
            r7 = move-exception
            goto L81
        L63:
            r0 = r8
        L64:
            if (r0 == 0) goto L7b
            android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()     // Catch: java.lang.Throwable -> L61
            y8 r7 = r7.a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r7.a     // Catch: java.lang.Throwable -> L61
            khe r7 = (defpackage.khe) r7     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L61
            byte[] r7 = (byte[]) r7     // Catch: java.lang.Throwable -> L61
            byte[] r7 = c(r0, r7)     // Catch: java.lang.Throwable -> L61
            goto L7c
        L7b:
            r7 = r8
        L7c:
            defpackage.v3c.i(r9, r8)
            r8 = r7
            goto L87
        L81:
            throw r7     // Catch: java.lang.Throwable -> L82
        L82:
            r8 = move-exception
            defpackage.v3c.i(r9, r7)
            throw r8
        L87:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io0.b(wv6, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
