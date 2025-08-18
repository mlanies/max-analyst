package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class lu4 {
    public static Boolean c = null;
    public static String d = null;
    public static boolean e = false;
    public static int f = -1;
    public static Boolean g;
    public static wjg k;
    public static dkg l;
    public final Context a;
    public static final ThreadLocal h = new ThreadLocal();
    public static final yu0 i = new yu0(12);
    public static final lq9 j = new lq9();
    public static final mq9 b = new mq9(19);

    public lu4(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (s36.l(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: all -> 0x0186, TRY_LEAVE, TryCatch #3 {all -> 0x0186, blocks: (B:5:0x002a, B:15:0x0052, B:97:0x017e, B:98:0x0185, B:106:0x0194, B:108:0x019b, B:110:0x01a6, B:112:0x01ab, B:114:0x01af, B:125:0x01d7, B:126:0x01de, B:103:0x018b, B:104:0x018c, B:105:0x0193, B:127:0x01df, B:128:0x01f0, B:129:0x01f1, B:130:0x021b, B:21:0x0069, B:27:0x0075, B:30:0x007e, B:34:0x0084, B:36:0x008c, B:38:0x0090, B:39:0x009e, B:46:0x00a9, B:48:0x00c6, B:50:0x00ce, B:58:0x00de, B:59:0x00e5, B:47:0x00b8, B:62:0x00e8, B:63:0x00e9, B:64:0x00f0, B:65:0x00f1, B:66:0x00f8, B:69:0x00fb, B:70:0x00fc, B:72:0x0102, B:74:0x0115, B:76:0x011d, B:82:0x014b, B:84:0x0151, B:85:0x015a, B:86:0x0161, B:77:0x012e, B:78:0x0135, B:80:0x0138, B:81:0x0142, B:87:0x0162, B:88:0x0169, B:89:0x016a, B:90:0x0171, B:96:0x017d), top: B:145:0x002a, inners: #6, #8, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.lu4 b(android.content.Context r16, defpackage.mq9 r17, java.lang.String r18) throws com.google.android.gms.dynamite.DynamiteModule$LoadingException {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu4.b(android.content.Context, mq9, java.lang.String):lu4");
    }

    public static int c(Context context, String str, boolean z, boolean z2) throws Throwable {
        boolean z3;
        try {
            try {
                boolean z4 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) i.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z5 = false;
                            int i2 = cursorQuery.getInt(0);
                            if (i2 > 0) {
                                synchronized (lu4.class) {
                                    try {
                                        d = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = cursorQuery.getInt(columnIndex2) != 0;
                                            e = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                njg njgVar = (njg) h.get();
                                if (njgVar == null || njgVar.a != null) {
                                    z4 = false;
                                } else {
                                    njgVar.a = cursorQuery;
                                }
                                cursor = z4 ? null : cursorQuery;
                                z5 = z3;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z2 && z5) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof DynamiteModule$LoadingException) {
                            throw e;
                        }
                        throw new DynamiteModule$LoadingException("V2 version check failed: " + e.getMessage(), e);
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void d(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            dkg dkgVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                dkgVar = iInterfaceQueryLocalInterface instanceof dkg ? (dkg) iInterfaceQueryLocalInterface : new dkg(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            l = dkgVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (fe6.b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            g = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                e = true;
            }
        }
        return z;
    }

    public static wjg f(Context context) {
        wjg wjgVar;
        synchronized (lu4.class) {
            wjg wjgVar2 = k;
            if (wjgVar2 != null) {
                return wjgVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    wjgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    wjgVar = iInterfaceQueryLocalInterface instanceof wjg ? (wjg) iInterfaceQueryLocalInterface : new wjg(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (wjgVar != null) {
                    k = wjgVar;
                    return wjgVar;
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
            return null;
        }
    }
}
