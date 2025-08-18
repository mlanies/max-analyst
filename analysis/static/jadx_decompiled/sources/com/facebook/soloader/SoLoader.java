package com.facebook.soloader;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import defpackage.a8g;
import defpackage.bs;
import defpackage.h7b;
import defpackage.hm9;
import defpackage.hx9;
import defpackage.iie;
import defpackage.j85;
import defpackage.jud;
import defpackage.lud;
import defpackage.mhe;
import defpackage.mud;
import defpackage.nud;
import defpackage.of0;
import defpackage.oq9;
import defpackage.p5f;
import defpackage.qk4;
import defpackage.rh4;
import defpackage.sh0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class SoLoader {
    public static a8g b;
    public static int l;
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static Context d = null;
    public static volatile nud[] e = null;
    public static final AtomicInteger f = new AtomicInteger(0);
    public static h7b g = null;
    public static final HashSet h = new HashSet();
    public static final HashMap i = new HashMap();
    public static final Set j = Collections.newSetFromMap(new ConcurrentHashMap());
    public static boolean k = true;
    public static int m = 0;
    public static final boolean a = true;

    public static void a(Context context, ArrayList arrayList) throws IOException {
        if ((l & 8) != 0) {
            File fileF = p5f.f(context, "lib-main");
            try {
                if (fileF.exists()) {
                    mhe.b(fileF);
                    return;
                }
                return;
            } catch (Throwable unused) {
                fileF.getCanonicalPath();
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        of0 of0Var = new of0(context, file, "lib-main");
        arrayList2.add(of0Var);
        of0Var.toString();
        if (context.getApplicationInfo().splitSourceDirs != null) {
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                File file2 = new File(strArr[i2]);
                StringBuilder sb = new StringBuilder("lib-");
                int i4 = i3 + 1;
                sb.append(i3);
                of0 of0Var2 = new of0(context, file2, sb.toString());
                of0Var2.toString();
                a aVar = new a(of0Var2, of0Var2, false);
                try {
                    boolean z = aVar.o().length != 0;
                    aVar.close();
                    if (z) {
                        arrayList2.add(of0Var2);
                    }
                    i2++;
                    i3 = i4;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        arrayList.addAll(0, arrayList2);
    }

    public static void b(ArrayList arrayList) {
        String strJ = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strJ = rh4.j(str, ":", strJ);
        }
        Iterator it = new HashSet(Arrays.asList(strJ.split(":"))).iterator();
        while (it.hasNext()) {
            arrayList.add(new qk4(new File((String) it.next()), 2));
        }
    }

    public static void c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (e == null) {
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (a) {
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (nud nudVar : e) {
                            if (nudVar.c(str, i2, threadPolicy) != 0) {
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw lud.a(str, d, e);
                    } finally {
                    }
                } catch (IOException e2) {
                    mud mudVar = new mud(str, e2.toString());
                    mudVar.initCause(e2);
                    throw mudVar;
                }
            } finally {
                if (a) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    public static synchronized sh0 d() {
        h7b h7bVar;
        h7bVar = g;
        return h7bVar == null ? null : h7bVar.f();
    }

    public static void e() {
        if (e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e != null) {
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                e = new nud[0];
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            c.writeLock().unlock();
            throw th;
        }
    }

    public static synchronized void f(Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String str = context.getApplicationInfo().nativeLibraryDir;
                } else {
                    context = applicationContext;
                }
                d = context;
                g = new h7b(context, 16);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b != null) {
            return;
        }
        b = new a8g(13);
    }

    public static void g(Context context, int i2) {
        ReentrantReadWriteLock.WriteLock writeLock;
        int i3;
        int i4;
        if (e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e != null) {
                return;
            }
            l = i2;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 512) != 0) {
                iie iieVar = new iie();
                iieVar.toString();
                arrayList.add(0, iieVar);
            } else {
                b(arrayList);
                if (context != null) {
                    if ((i2 & 1) != 0) {
                        int i5 = m;
                        if (i5 != 1) {
                            if (i5 != 2 && i5 != 3) {
                                throw new RuntimeException("Unsupported app type, we should not reach here");
                            }
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        bs bsVar = new bs(d, i4);
                        bsVar.toString();
                        arrayList.add(0, bsVar);
                        arrayList.add(0, new j85(context, "lib-main"));
                    } else {
                        if (m == 2 || (context.getApplicationInfo().flags & 268435456) == 0) {
                            b bVar = new b(context);
                            bVar.toString();
                            if (!bVar.c.isEmpty()) {
                                arrayList.add(0, bVar);
                            }
                        }
                        int i6 = m;
                        if (i6 != 1) {
                            if (i6 != 2 && i6 != 3) {
                                throw new RuntimeException("Unsupported app type, we should not reach here");
                            }
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        bs bsVar2 = new bs(d, i3);
                        bsVar2.toString();
                        arrayList.add(0, bsVar2);
                        a(context, arrayList);
                    }
                }
            }
            nud[] nudVarArr = (nud[]) arrayList.toArray(new nud[arrayList.size()]);
            reentrantReadWriteLock.writeLock().lock();
            try {
                int i7 = l;
                int i8 = (i7 & 2) == 0 ? 0 : 1;
                if ((i7 & 256) != 0) {
                    i8 |= 4;
                }
                reentrantReadWriteLock.writeLock().unlock();
                int length = nudVarArr.length;
                while (true) {
                    int i9 = length - 1;
                    if (length <= 0) {
                        e = nudVarArr;
                        f.getAndIncrement();
                        int length2 = e.length;
                        reentrantReadWriteLock = c;
                        return;
                    }
                    Objects.toString(nudVarArr[i9]);
                    boolean z = a;
                    if (z) {
                        Api18TraceUtils.a("SoLoader", "_", nudVarArr[i9].getClass().getSimpleName());
                    }
                    nudVarArr[i9].d(i8);
                    if (z) {
                        Trace.endSection();
                    }
                    length = i9;
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            reentrantReadWriteLock = c;
            throw th;
        }
    }

    public static boolean h() {
        if (e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            c.readLock().unlock();
            throw th;
        }
    }

    public static boolean i(String str, String str2, int i2, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet hashSet = h;
                if (hashSet.contains(str)) {
                    return false;
                }
                HashMap map = i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                reentrantReadWriteLock.readLock().unlock();
                                return false;
                            }
                            try {
                                c(str, i2, threadPolicy);
                                synchronized (SoLoader.class) {
                                    hashSet.add(str);
                                }
                                if ((i2 & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                    j.contains(str2);
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return true;
                            } catch (UnsatisfiedLinkError e2) {
                                String message = e2.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e2;
                                }
                                jud judVar = new jud("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                judVar.initCause(e2);
                                throw judVar;
                            }
                        }
                    }
                } catch (Throwable th) {
                    c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void init(Context context, int i2) throws IOException {
        Bundle bundle;
        if (h()) {
            return;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (Exception unused) {
                bundle = null;
            }
            boolean z = false;
            boolean z2 = true;
            boolean z3 = bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
            k = z3;
            if (z3) {
                int i3 = m;
                if (i3 == 0) {
                    if (context != null) {
                        int i4 = context.getApplicationInfo().flags;
                        i3 = (i4 & 1) == 0 ? 1 : (128 & i4) != 0 ? 3 : 2;
                    }
                }
                m = i3;
                if ((i2 & 128) == 0) {
                    if (i3 != 2) {
                        if (context != null && (context.getApplicationInfo().flags & 268435456) == 0) {
                            z = true;
                        }
                        z2 = z;
                    }
                    if (z2) {
                        i2 |= 8;
                    }
                }
                f(context);
                g(context, i2);
                hm9.I(new hx9());
            } else {
                e();
                hm9.I(new oq9(17));
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }
}
