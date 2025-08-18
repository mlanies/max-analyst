package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import defpackage.b4g;
import defpackage.lh7;
import defpackage.nu0;
import defpackage.o43;
import defpackage.pm4;
import defpackage.q43;
import defpackage.q5b;
import defpackage.qq8;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@pm4
/* loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method o;
    public final WebpBitmapFactoryImpl c;

    @pm4
    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl;
        if (b4g.b) {
            webpBitmapFactoryImpl = b4g.a;
        } else {
            try {
                webpBitmapFactoryImpl = (WebpBitmapFactoryImpl) WebpBitmapFactoryImpl.class.newInstance();
            } catch (Throwable unused) {
                webpBitmapFactoryImpl = null;
            }
            b4g.b = true;
        }
        this.c = webpBitmapFactoryImpl;
    }

    public static MemoryFile g(o43 o43Var, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        lh7 lh7Var;
        q5b q5bVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            q5b q5bVar2 = new q5b((qq8) o43Var.e0());
            try {
                lh7Var = new lh7(q5bVar2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    outputStream2.getClass();
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int i2 = lh7Var.read(bArr2);
                        if (i2 == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, i2);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    o43.S(o43Var);
                    q43.b(q5bVar2);
                    q43.b(lh7Var);
                    q43.a(outputStream2);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    q5bVar = q5bVar2;
                    o43.S(o43Var);
                    q43.b(q5bVar);
                    q43.b(lh7Var);
                    q43.a(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                lh7Var = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            lh7Var = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap b(o43 o43Var, BitmapFactory.Options options) {
        return h(o43Var, ((qq8) o43Var.e0()).U(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(o43 o43Var, int i, BitmapFactory.Options options) {
        return h(o43Var, i, DalvikPurgeableDecoder.e(i, o43Var) ? null : DalvikPurgeableDecoder.b, options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap h(defpackage.o43 r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) throws java.lang.Throwable {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = g(r2, r3, r4)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            java.io.FileDescriptor r3 = r1.i(r2)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            com.facebook.webpsupport.WebpBitmapFactoryImpl r1 = r1.c     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r1 == 0) goto L20
            android.graphics.Bitmap r1 = com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFileDescriptor(r3, r0, r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            java.lang.String r3 = "BitmapFactory returned null"
            defpackage.od2.o(r1, r3)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            r2.close()
            return r1
        L1a:
            r0 = r2
            goto L30
        L1c:
            r1 = move-exception
            goto L1a
        L1e:
            r1 = move-exception
            goto L2c
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            java.lang.String r3 = "WebpBitmapFactory is null"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
        L28:
            r1 = move-exception
            goto L30
        L2a:
            r1 = move-exception
            r2 = r0
        L2c:
            defpackage.nu0.H(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L1c
        L30:
            if (r0 == 0) goto L35
            r0.close()
        L35:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.h(o43, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public final FileDescriptor i(MemoryFile memoryFile) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method;
        try {
            synchronized (this) {
                if (o == null) {
                    try {
                        o = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                    } catch (Exception e) {
                        nu0.H(e);
                        throw null;
                    }
                }
                method = o;
            }
            Object objInvoke = method.invoke(memoryFile, null);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e2) {
            nu0.H(e2);
            throw null;
        }
    }
}
