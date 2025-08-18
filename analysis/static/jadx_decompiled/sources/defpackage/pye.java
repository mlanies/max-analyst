package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class pye {
    public static final pye a = new pye();
    public static ty2 b;

    public static final void a(String str) {
        if (kye.b) {
            return;
        }
        try {
            ty2 ty2Var = b;
            if (ty2Var == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            zs7 zs7Var = (zs7) ty2Var.o;
            zs7Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - zs7Var.i;
            byte[] bytes = str.getBytes(a52.a);
            int i = 65506;
            if (bytes.length > 65506) {
                if ((bytes[65506] & 192) == 128) {
                    do {
                        i--;
                        if (i < 0) {
                            break;
                        }
                    } while ((bytes[i] & 192) == 128);
                }
                bytes = ys.Z(0, bytes, i);
            }
            ns7 ns7Var = new ns7(jCurrentTimeMillis, bytes);
            ConcurrentLinkedQueue concurrentLinkedQueue = zs7Var.h;
            concurrentLinkedQueue.add(ns7Var);
            zs7Var.g += ns7Var.c;
            while (zs7Var.g > 65536) {
                ns7 ns7Var2 = (ns7) concurrentLinkedQueue.poll();
                if (ns7Var2 != null) {
                    zs7Var.g -= ns7Var2.c;
                } else {
                    zs7Var.g = 0;
                }
            }
            hze.a(new vs5(zs7Var, str, ns7Var, 15));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.bjd r16, java.lang.Throwable r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pye.b(bjd, java.lang.Throwable, java.lang.String):void");
    }
}
