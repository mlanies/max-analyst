package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class eoa extends nj0 {
    public final Uri c;
    public final Context d;

    public eoa(Context context, Uri uri) {
        this.c = uri;
        this.d = context;
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        return new tpd(String.valueOf(this.c.hashCode()));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Bitmap r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            android.net.Uri r1 = r0.c
            int r2 = defpackage.nd7.i
            java.lang.String r2 = "r"
            android.content.Context r0 = r0.d
            android.content.ContentResolver r0 = r0.getContentResolver()
            r3 = 1
            r4 = 0
            android.os.ParcelFileDescriptor r5 = r0.openFileDescriptor(r1, r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86
            java.io.FileDescriptor r6 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            ph4 r7 = defpackage.j47.X     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            c65 r7 = new c65     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            java.lang.String r6 = "Orientation"
            int r6 = r7.e(r3, r6)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r5.close()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            android.os.ParcelFileDescriptor r5 = r0.openFileDescriptor(r1, r2)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            android.graphics.Point r7 = defpackage.j47.D(r7, r6)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r5.close()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r8.<init>()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r9 = 2048(0x800, float:2.87E-42)
            int r7 = defpackage.j47.I(r7, r9, r9)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r8.inSampleSize = r7     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            android.os.ParcelFileDescriptor r5 = r0.openFileDescriptor(r1, r2)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r4, r8)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r5.close()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            int r2 = defpackage.j47.K(r6)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            if (r2 != 0) goto L5e
        L59:
            defpackage.s5c.m(r5)
            goto Lc7
        L5e:
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r14.<init>()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r14.setRotate(r2)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            int r12 = r0.getWidth()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            int r13 = r0.getHeight()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r15 = 1
            r10 = 0
            r11 = 0
            r9 = r0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r0.recycle()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            defpackage.s5c.m(r5)
            r0 = r2
            goto Lc7
        L7f:
            r0 = move-exception
            r4 = r5
            goto Le3
        L82:
            r0 = move-exception
            goto L88
        L84:
            r0 = move-exception
            goto Le3
        L86:
            r0 = move-exception
            r5 = r4
        L88:
            boolean r2 = r0 instanceof java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L7f
            java.lang.String r6 = "nd7"
            if (r2 == 0) goto Lbe
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L7f
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto Lae
            java.lang.String r1 = "file by path %s not exists"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lac
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> Lac
            defpackage.hm9.k0(r6, r4, r1, r0)     // Catch: java.lang.Throwable -> Lac
        Laa:
            r0 = r4
            goto L59
        Lac:
            r0 = move-exception
            goto Lb8
        Lae:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> Lac
            r1.<init>()     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r1)     // Catch: java.lang.Throwable -> Lac
            goto L59
        Lb8:
            java.lang.String r1 = "getBitmapFromExternalStorage fail"
            defpackage.hm9.l0(r6, r1, r0)     // Catch: java.lang.Throwable -> L7f
            goto Laa
        Lbe:
            java.lang.String r1 = "getBitmapFromPath: failed to get bitmap"
            defpackage.hm9.p(r6, r1, r0)     // Catch: java.lang.Throwable -> L7f
            defpackage.s5c.m(r5)
            r0 = r4
        Lc7:
            if (r0 == 0) goto Le2
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r2 = r17
            r1.<init>(r2)
            int r2 = r17.getWidth()
            float r2 = (float) r2
            int r3 = r0.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r1.scale(r2, r2)
            r2 = 0
            r1.drawBitmap(r0, r2, r2, r4)
        Le2:
            return
        Le3:
            defpackage.s5c.m(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoa.c(android.graphics.Bitmap):void");
    }
}
