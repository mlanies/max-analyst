package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fl5 {
    public static final Object j = new Object();
    public static final us k = new us(0);
    public final Context a;
    public final String b;
    public final ol5 c;
    public final fc3 d;
    public final le7 g;
    public final gpb h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    public fl5(Context context, String str, ol5 ol5Var) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        int i = 1;
        int i2 = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        fp3.j(str);
        this.b = str;
        this.c = ol5Var;
        sb0 sb0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bc3(i2, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        s4f s4fVar = s4f.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new bc3(i, new FirebaseCommonRegistrar()));
        arrayList3.add(new bc3(i, new ExecutorsRegistrar()));
        arrayList4.add(nb3.b(context, Context.class, new Class[0]));
        arrayList4.add(nb3.b(this, fl5.class, new Class[0]));
        arrayList4.add(nb3.b(ol5Var, ol5.class, new Class[0]));
        huc hucVar = new huc();
        if (daf.a(context) && FirebaseInitProvider.b.get()) {
            arrayList4.add(nb3.b(sb0Var, sb0.class, new Class[0]));
        }
        s4f s4fVar2 = s4f.a;
        fc3 fc3Var = new fc3();
        fc3Var.a = new HashMap();
        fc3Var.b = new HashMap();
        fc3Var.c = new HashMap();
        fc3Var.o = new HashSet();
        fc3Var.Y = new AtomicReference();
        r35 r35Var = new r35();
        fc3Var.X = r35Var;
        fc3Var.Z = hucVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(nb3.b(r35Var, r35.class, wae.class, zpb.class));
        arrayList5.add(nb3.b(fc3Var, fc3.class, new Class[0]));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            nb3 nb3Var = (nb3) it2.next();
            if (nb3Var != null) {
                arrayList5.add(nb3Var);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList6.add(it3.next());
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (fc3Var) {
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((gpb) it4.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((huc) fc3Var.Z).r(componentRegistrar));
                        it4.remove();
                    }
                } catch (InvalidRegistrarException unused2) {
                    it4.remove();
                }
            }
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Object[] array = ((nb3) it5.next()).b.toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) fc3Var.o).contains(obj.toString())) {
                                it5.remove();
                                break;
                            }
                            ((HashSet) fc3Var.o).add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (((HashMap) fc3Var.a).isEmpty()) {
                xfg.h(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) fc3Var.a).keySet());
                arrayList8.addAll(arrayList5);
                xfg.h(arrayList8);
            }
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                nb3 nb3Var2 = (nb3) it6.next();
                ((HashMap) fc3Var.a).put(nb3Var2, new le7(new ec3(fc3Var, i2, nb3Var2)));
            }
            arrayList7.addAll(fc3Var.q(arrayList5));
            arrayList7.addAll(fc3Var.r());
            fc3Var.p();
        }
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            ((Runnable) it7.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) fc3Var.Y).get();
        if (bool != null) {
            fc3Var.i((HashMap) fc3Var.a, bool.booleanValue());
        }
        this.d = fc3Var;
        Trace.endSection();
        this.g = new le7(new ec3(this, 2, context));
        this.h = fc3Var.c(bb4.class);
        cl5 cl5Var = new cl5(this);
        a();
        if (this.e.get()) {
            se0.X.a.get();
        }
        this.i.add(cl5Var);
        Trace.endSection();
    }

    public static fl5 b() {
        fl5 fl5Var;
        synchronized (j) {
            try {
                fl5Var = (fl5) k.get("[DEFAULT]");
                if (fl5Var == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (f46.e == null) {
                        f46.e = Application.getProcessName();
                    }
                    sb.append(f46.e);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((bb4) fl5Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fl5Var;
    }

    public static fl5 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return b();
                }
                ol5 ol5VarA = ol5.a(context);
                if (ol5VarA == null) {
                    return null;
                }
                return f(context, ol5VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static fl5 f(Context context, ol5 ol5Var) {
        fl5 fl5Var;
        AtomicReference atomicReference = dl5.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = dl5.a;
            if (atomicReference2.get() == null) {
                dl5 dl5Var = new dl5();
                while (true) {
                    if (atomicReference2.compareAndSet(null, dl5Var)) {
                        se0.a(application);
                        se0 se0Var = se0.X;
                        se0Var.getClass();
                        synchronized (se0Var) {
                            se0Var.c.add(dl5Var);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            us usVar = k;
            fp3.p("FirebaseApp name [DEFAULT] already exists!", !usVar.containsKey("[DEFAULT]"));
            fp3.o(context, "Application context cannot be null.");
            fl5Var = new fl5(context, "[DEFAULT]", ol5Var);
            usVar.put("[DEFAULT]", fl5Var);
        }
        fl5Var.d();
        return fl5Var;
    }

    public final void a() {
        fp3.p("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        HashMap map;
        if (!daf.a(this.a)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = el5.b;
            if (atomicReference.get() == null) {
                el5 el5Var = new el5(context);
                while (!atomicReference.compareAndSet(null, el5Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(el5Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        fc3 fc3Var = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) fc3Var.Y;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (fc3Var) {
                    map = new HashMap((HashMap) fc3Var.a);
                }
                fc3Var.i(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((bb4) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fl5)) {
            return false;
        }
        fl5 fl5Var = (fl5) obj;
        fl5Var.a();
        return this.b.equals(fl5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        qz7 qz7Var = new qz7(this);
        qz7Var.h(this.b, "name");
        qz7Var.h(this.c, "options");
        return qz7Var.toString();
    }
}
