package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class w36 implements wn0 {
    public boolean a;
    public Object b;
    public Object c;
    public Object o;

    public w36(die dieVar, boolean z) {
        this.b = dieVar;
        this.a = z;
        this.c = new SparseArray();
    }

    public static void h(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public static byte[] k(q24 q24Var, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        Map map2;
        List list;
        u1e u1eVar = new u1e(q24Var.a());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        fm9.m(uri, "The uri must be set.");
        a34 a34Var = new a34(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i = 0;
        while (true) {
            try {
                w24 w24Var = new w24(u1eVar, a34Var);
                try {
                    return zv0.b(w24Var);
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        int i2 = e.o;
                        String str2 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.X) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i++;
                        y24 y24VarA = a34Var.a();
                        y24VarA.b = Uri.parse(str2);
                        a34Var = y24VarA.b();
                    } finally {
                        oaf.h(w24Var);
                    }
                }
            } catch (Exception e2) {
                u1eVar.c.getClass();
                u1eVar.a.a();
                throw new MediaDrmCallbackException(e2);
            }
        }
    }

    public static byte[] l(xp6 xp6Var, String str, byte[] bArr, Map map) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        Map map2;
        List list;
        t1e t1eVar = new t1e(xp6Var.a());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        if (uri == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        z24 z24Var = new z24(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i = 0;
        while (true) {
            try {
                w24 w24Var = new w24(t1eVar, z24Var);
                try {
                    int i2 = maf.a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i3 = w24Var.read(bArr2);
                        if (i3 == -1) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        byteArrayOutputStream.write(bArr2, 0, i3);
                    }
                } catch (com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        int i4 = e.c;
                        String str2 = null;
                        if ((i4 == 307 || i4 == 308) && i < 5 && (map2 = e.o) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i++;
                        y24 y24VarA = z24Var.a();
                        y24VarA.b = Uri.parse(str2);
                        z24Var = y24VarA.a();
                    } finally {
                        maf.h(w24Var);
                    }
                }
            } catch (Exception e2) {
                t1eVar.c.getClass();
                t1eVar.a.a();
                throw new com.google.android.exoplayer2.drm.MediaDrmCallbackException(e2);
            }
        }
    }

    @Override // defpackage.wn0
    public synchronized boolean a(int i) {
        boolean zContainsKey;
        die dieVar = (die) this.b;
        jy3 jy3Var = (jy3) dieVar.b;
        cf cfVar = new cf((ww0) dieVar.a, i);
        nw7 nw7Var = (nw7) jy3Var;
        synchronized (nw7Var) {
            jn jnVar = nw7Var.c;
            synchronized (jnVar) {
                zContainsKey = ((LinkedHashMap) jnVar.o).containsKey(cfVar);
            }
        }
        return zContainsKey;
    }

    @Override // defpackage.wn0
    public synchronized o43 b() {
        return vu4.l(o43.o((v84) this.o));
    }

    @Override // defpackage.wn0
    public synchronized void c(int i, o43 o43Var) {
        v84 v84VarO0;
        u(i);
        try {
            v84VarO0 = o43.o0(CloseableStaticBitmap.of(o43Var, hx6.d, 0));
            if (v84VarO0 != null) {
                try {
                    o43.S((v84) this.o);
                    die dieVar = (die) this.b;
                    this.o = ((nw7) ((jy3) dieVar.b)).a(new cf((ww0) dieVar.a, i), v84VarO0, (w4d) dieVar.c);
                } catch (Throwable th) {
                    th = th;
                    o43.S(v84VarO0);
                    throw th;
                }
            }
            o43.S(v84VarO0);
        } catch (Throwable th2) {
            th = th2;
            v84VarO0 = null;
        }
    }

    @Override // defpackage.wn0
    public synchronized void clear() {
        try {
            o43.S((v84) this.o);
            this.o = null;
            int size = ((SparseArray) this.c).size();
            for (int i = 0; i < size; i++) {
                o43.S((o43) ((SparseArray) this.c).valueAt(i));
            }
            ((SparseArray) this.c).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.wn0
    public synchronized void d(int i, o43 o43Var) {
        v84 v84VarO0;
        try {
            v84VarO0 = o43.o0(CloseableStaticBitmap.of(o43Var, hx6.d, 0));
            if (v84VarO0 == null) {
                o43.S(v84VarO0);
                return;
            }
            try {
                die dieVar = (die) this.b;
                v84 v84VarA = ((nw7) ((jy3) dieVar.b)).a(new cf((ww0) dieVar.a, i), v84VarO0, (w4d) dieVar.c);
                if (o43.n0(v84VarA)) {
                    o43.S((o43) ((SparseArray) this.c).get(i));
                    ((SparseArray) this.c).put(i, v84VarA);
                    ta5.e(w36.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
                }
                o43.S(v84VarO0);
            } catch (Throwable th) {
                th = th;
                o43.S(v84VarO0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v84VarO0 = null;
        }
    }

    @Override // defpackage.wn0
    public synchronized o43 e() {
        if (!this.a) {
            return null;
        }
        return vu4.l(((die) this.b).t());
    }

    @Override // defpackage.wn0
    public synchronized o43 f(int i) {
        die dieVar;
        dieVar = (die) this.b;
        return vu4.l(((nw7) ((jy3) dieVar.b)).get(new cf((ww0) dieVar.a, i)));
    }

    public boolean g(h30 h30Var, qy5 qy5Var) throws IllegalArgumentException {
        boolean zEquals = "audio/eac3-joc".equals(qy5Var.n);
        int i = qy5Var.B;
        if (zEquals && i == 16) {
            i = 12;
        }
        int iT = oaf.t(i);
        if (iT == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iT);
        int i2 = qy5Var.C;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.b).canBeSpatialized((AudioAttributes) h30Var.b().a, channelMask.build());
    }

    public byte[] i(UUID uuid, o65 o65Var) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        String str = o65Var.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            if (uri == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            new z24(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null);
            throw new com.google.android.exoplayer2.drm.MediaDrmCallbackException(new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = bw0.e;
        map.put(HTTP.CONTENT_TYPE, uuid2.equals(uuid) ? "text/xml" : bw0.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.o)) {
            map.putAll((HashMap) this.o);
        }
        return l((xp6) this.b, str, o65Var.a, map);
    }

    public byte[] j(UUID uuid, p65 p65Var) throws MediaDrmCallbackException {
        String str = p65Var.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            fm9.m(uri, "The uri must be set.");
            new a34(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null);
            throw new MediaDrmCallbackException(new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = ew0.e;
        map.put(HTTP.CONTENT_TYPE, uuid2.equals(uuid) ? "text/xml" : ew0.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.o)) {
            map.putAll((HashMap) this.o);
        }
        return k((q24) this.b, str, p65Var.a, map);
    }

    public byte[] m(q65 q65Var) {
        String strN = maf.n(q65Var.a);
        String str = q65Var.b;
        StringBuilder sb = new StringBuilder(strN.length() + rh4.e(15, str));
        sb.append(str);
        sb.append("&signedRequest=");
        sb.append(strN);
        return l((xp6) this.b, sb.toString(), null, Collections.emptyMap());
    }

    public byte[] n(r65 r65Var) {
        return k((q24) this.b, r65Var.b + "&signedRequest=" + oaf.q(r65Var.a), null, Collections.emptyMap());
    }

    public int[] o() {
        synchronized (this) {
            try {
                if (!this.a) {
                    return null;
                }
                long[] jArr = (long[]) this.b;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.c;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.o;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.o)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.a = false;
                return (int[]) ((int[]) this.o).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void p() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolT = t();
            this.c = boolT;
            if (boolT == null) {
                ((r35) ((wae) this.b)).a(new av1());
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean q() {
        boolean z;
        boolean zBooleanValue;
        try {
            p();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                fl5 fl5Var = ((FirebaseMessaging) this.o).a;
                fl5Var.a();
                h24 h24Var = (h24) fl5Var.g.get();
                synchronized (h24Var) {
                    z = h24Var.a;
                }
                zBooleanValue = z;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public boolean r(ve veVar) {
        if (veVar.a == 0 && veVar.b == 0) {
            ue ueVar = (ue) this.b;
            if (veVar.c == ((Rect) ueVar.f).width()) {
                if (veVar.d == ((Rect) ueVar.f).height()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean s(int i) {
        if (i == 0) {
            return true;
        }
        ve[] veVarArr = (ve[]) ((ue) this.b).h;
        ve veVar = veVarArr[i];
        ve veVar2 = veVarArr[i - 1];
        veVar.getClass();
        return veVar2.e == 2 && r(veVar2);
    }

    public Boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        fl5 fl5Var = ((FirebaseMessaging) this.o).a;
        fl5Var.a();
        Context context = fl5Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public synchronized void u(int i) {
        o43 o43Var = (o43) ((SparseArray) this.c).get(i);
        if (o43Var != null) {
            ((SparseArray) this.c).delete(i);
            o43.S(o43Var);
            ta5.e(w36.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(android.graphics.Bitmap r19, int r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.v(android.graphics.Bitmap, int):void");
    }

    public w36(ue ueVar, boolean z, fd7 fd7Var) {
        this.b = ueVar;
        this.c = fd7Var;
        this.a = z;
        Paint paint = new Paint();
        this.o = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
