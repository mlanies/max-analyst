package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.mediarouter.app.d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xf8 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final /* synthetic */ d e;

    public xf8(d dVar) {
        this.e = dVar;
        MediaDescriptionCompat mediaDescriptionCompat = dVar.f1;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        if (iconBitmap != null && iconBitmap.isRecycled()) {
            iconBitmap = null;
        }
        this.a = iconBitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dVar.f1;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
    }

    public final BufferedInputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.e.u0.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            int i = d.z1;
            uRLConnectionOpenConnection.setConnectTimeout(i);
            uRLConnectionOpenConnection.setReadTimeout(i);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0020: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:14:0x0020 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            r9 = 0
            r0 = 1
            r1 = 0
            android.graphics.Bitmap r2 = r8.a
            if (r2 == 0) goto Lb
            goto L83
        Lb:
            android.net.Uri r2 = r8.b
            if (r2 == 0) goto L82
            java.io.BufferedInputStream r3 = r8.a(r2)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            if (r3 != 0) goto L22
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            if (r3 == 0) goto Lc5
        L1a:
            r3.close()     // Catch: java.io.IOException -> Lc5
            goto Lc5
        L1f:
            r8 = move-exception
            r1 = r3
            goto L7c
        L22:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            r4.inJustDecodeBounds = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            int r5 = r4.outWidth     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            if (r5 == 0) goto L1a
            int r5 = r4.outHeight     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            if (r5 != 0) goto L35
            goto L1a
        L35:
            r3.reset()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L39
            goto L48
        L39:
            r3.close()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            java.io.BufferedInputStream r3 = r8.a(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            if (r3 != 0) goto L48
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            if (r3 == 0) goto Lc5
            goto L1a
        L48:
            r4.inJustDecodeBounds = r9     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            androidx.mediarouter.app.d r5 = r8.e     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            int r6 = r4.outWidth     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            int r7 = r4.outHeight     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            int r5 = r5.l(r6, r7)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            int r6 = r4.outHeight     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            int r6 = r6 / r5
            int r5 = java.lang.Integer.highestOneBit(r6)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            int r5 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            r4.inSampleSize = r5     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            boolean r5 = r8.isCancelled()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            if (r5 == 0) goto L68
            goto L1a
        L68:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L73
            r3.close()     // Catch: java.io.IOException -> L83
            goto L83
        L70:
            r8 = move-exception
            goto L7c
        L72:
            r3 = r1
        L73:
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L82
            r3.close()     // Catch: java.io.IOException -> L82
            goto L82
        L7c:
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.io.IOException -> L81
        L81:
            throw r8
        L82:
            r2 = r1
        L83:
            if (r2 == 0) goto L8f
            boolean r3 = r2.isRecycled()
            if (r3 == 0) goto L8f
            java.util.Objects.toString(r2)
            goto Lc5
        L8f:
            if (r2 == 0) goto Lc4
            int r1 = r2.getWidth()
            int r3 = r2.getHeight()
            if (r1 >= r3) goto Lc4
            oo0 r1 = new oo0
            r3 = 1
            r1.<init>(r2, r3)
            r1.b = r0
            c8d r0 = r1.g()
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lb6
            goto Lc2
        Lb6:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r9 = r0.get(r9)
            opa r9 = (defpackage.opa) r9
            int r9 = r9.d
        Lc2:
            r8.c = r9
        Lc4:
            r1 = r2
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        d dVar = this.e;
        dVar.g1 = null;
        Bitmap bitmap2 = dVar.h1;
        Bitmap bitmap3 = this.a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (zEquals && Objects.equals(dVar.i1, uri)) {
            return;
        }
        dVar.h1 = bitmap3;
        dVar.k1 = bitmap;
        dVar.i1 = uri;
        dVar.l1 = this.c;
        dVar.j1 = true;
        dVar.q(SystemClock.uptimeMillis() - this.d > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        d dVar = this.e;
        dVar.j1 = false;
        dVar.k1 = null;
        dVar.l1 = 0;
    }
}
