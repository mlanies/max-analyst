package com.my.tracker.obfuscated;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
public final class r {
    private q a;

    public static final class a {
        static final int a = a() ? 1 : 0;

        /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
        
            r0 = java.util.Locale.US;
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + android.os.Process.myPid() + "/mounts")));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        
            r0 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
        
            if (r4 == null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
        
            if (r5 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        
            if (r4.contains(r0[r5]) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
        
            if (r5 != null) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        
            if (r5 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean a() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.r.a.a():boolean");
        }
    }

    private static Point b(Context context) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            y0.a("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:60|(2:108|61)|62|100|69|70|88|73|74|77|78|(3:116|79|80)|86|87) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0112, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        com.my.tracker.obfuscated.y0.a("DeviceParamsDataProvider: collecting lang exception: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0125, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0126, code lost:
    
        com.my.tracker.obfuscated.y0.a("DeviceParamsDataProvider: collecting touchscreen info exception: ", r0);
        r2 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #9 {all -> 0x0096, blocks: (B:31:0x0072, B:33:0x007c), top: B:106:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #11 {all -> 0x00f9, blocks: (B:58:0x00e6, B:60:0x00ec), top: B:110:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.my.tracker.obfuscated.q a(android.content.Context r30) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.r.a(android.content.Context):com.my.tracker.obfuscated.q");
    }
}
