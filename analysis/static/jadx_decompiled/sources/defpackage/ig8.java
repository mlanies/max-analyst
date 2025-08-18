package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ig8 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public final /* synthetic */ pg8 d;

    public ig8(pg8 pg8Var) {
        this.d = pg8Var;
        MediaDescriptionCompat mediaDescriptionCompat = pg8Var.W0;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        if (iconBitmap != null && iconBitmap.isRecycled()) {
            iconBitmap = null;
        }
        this.a = iconBitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = pg8Var.W0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
    }

    public final BufferedInputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.d.y0.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(30000);
            uRLConnectionOpenConnection.setReadTimeout(30000);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0020: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:14:0x0020 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            r8 = 0
            r0 = 1
            r1 = 0
            android.graphics.Bitmap r2 = r7.a
            if (r2 == 0) goto Lb
            goto L87
        Lb:
            android.net.Uri r2 = r7.b
            if (r2 == 0) goto L86
            java.io.BufferedInputStream r3 = r7.a(r2)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            if (r3 != 0) goto L22
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            if (r3 == 0) goto Lc9
        L1a:
            r3.close()     // Catch: java.io.IOException -> Lc9
            goto Lc9
        L1f:
            r7 = move-exception
            r1 = r3
            goto L80
        L22:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            r4.inJustDecodeBounds = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            int r5 = r4.outWidth     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            if (r5 == 0) goto L1a
            int r5 = r4.outHeight     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            if (r5 != 0) goto L35
            goto L1a
        L35:
            r3.reset()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L39
            goto L48
        L39:
            r3.close()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            java.io.BufferedInputStream r3 = r7.a(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            if (r3 != 0) goto L48
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            if (r3 == 0) goto Lc9
            goto L1a
        L48:
            r4.inJustDecodeBounds = r8     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            pg8 r5 = r7.d     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            android.content.Context r5 = r5.y0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            int r6 = defpackage.qtb.mr_cast_meta_art_size     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            int r5 = r5.getDimensionPixelSize(r6)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            int r6 = r4.outHeight     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            int r6 = r6 / r5
            int r5 = java.lang.Integer.highestOneBit(r6)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            int r5 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            r4.inSampleSize = r5     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            boolean r5 = r7.isCancelled()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            if (r5 == 0) goto L6c
            goto L1a
        L6c:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L77
            r3.close()     // Catch: java.io.IOException -> L87
            goto L87
        L74:
            r7 = move-exception
            goto L80
        L76:
            r3 = r1
        L77:
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L86
            r3.close()     // Catch: java.io.IOException -> L86
            goto L86
        L80:
            if (r1 == 0) goto L85
            r1.close()     // Catch: java.io.IOException -> L85
        L85:
            throw r7
        L86:
            r2 = r1
        L87:
            if (r2 == 0) goto L93
            boolean r3 = r2.isRecycled()
            if (r3 == 0) goto L93
            java.util.Objects.toString(r2)
            goto Lc9
        L93:
            if (r2 == 0) goto Lc8
            int r1 = r2.getWidth()
            int r3 = r2.getHeight()
            if (r1 >= r3) goto Lc8
            oo0 r1 = new oo0
            r3 = 1
            r1.<init>(r2, r3)
            r1.b = r0
            c8d r0 = r1.g()
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lba
            goto Lc6
        Lba:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r8 = r0.get(r8)
            opa r8 = (defpackage.opa) r8
            int r8 = r8.d
        Lc6:
            r7.c = r8
        Lc8:
            r1 = r2
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig8.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        pg8 pg8Var = this.d;
        pg8Var.X0 = null;
        Bitmap bitmap2 = pg8Var.Y0;
        Bitmap bitmap3 = this.a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (zEquals && Objects.equals(pg8Var.Z0, uri)) {
            return;
        }
        pg8Var.Y0 = bitmap3;
        pg8Var.b1 = bitmap;
        pg8Var.Z0 = uri;
        pg8Var.c1 = this.c;
        pg8Var.a1 = true;
        pg8Var.l();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        pg8 pg8Var = this.d;
        pg8Var.a1 = false;
        pg8Var.b1 = null;
        pg8Var.c1 = 0;
    }
}
