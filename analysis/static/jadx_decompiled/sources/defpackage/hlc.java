package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hlc {
    public final Context a;
    public final Class b;
    public final String c;
    public Executor g;
    public Executor h;
    public wde i;
    public boolean j;
    public boolean m;
    public HashSet q;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int k = 1;
    public boolean l = true;
    public final long n = -1;
    public final sy4 o = new sy4(26);
    public final LinkedHashSet p = new LinkedHashSet();

    public hlc(Context context, String str, Class cls) {
        this.a = context;
        this.b = cls;
        this.c = str;
    }

    public final void a(da9... da9VarArr) {
        if (this.q == null) {
            this.q = new HashSet();
        }
        for (da9 da9Var : da9VarArr) {
            this.q.add(Integer.valueOf(da9Var.a));
            this.q.add(Integer.valueOf(da9Var.b));
        }
        this.o.k((da9[]) Arrays.copyOf(da9VarArr, da9VarArr.length));
    }

    public final ilc b() {
        int i;
        Executor executor = this.g;
        if (executor == null && this.h == null) {
            cs csVar = ds.f;
            this.h = csVar;
            this.g = csVar;
        } else if (executor != null && this.h == null) {
            this.h = executor;
        } else if (executor == null) {
            this.g = this.h;
        }
        HashSet hashSet = this.q;
        LinkedHashSet linkedHashSet = this.p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (!(!linkedHashSet.contains(Integer.valueOf(iIntValue)))) {
                    throw new IllegalArgumentException(zr6.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        wde o84Var = this.i;
        if (o84Var == null) {
            o84Var = new o84(11);
        }
        wde wdeVar = o84Var;
        if (this.n > 0) {
            if (this.c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
        }
        ArrayList arrayList = this.d;
        boolean z = this.j;
        int i2 = this.k;
        if (i2 == 0) {
            throw null;
        }
        Context context = this.a;
        if (i2 != 1) {
            i = i2;
        } else {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null || activityManager.isLowRamDevice()) {
                i2 = 2;
                i = i2;
            } else {
                i = 3;
            }
        }
        Executor executor2 = this.g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Executor executor3 = this.h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        d34 d34Var = new d34(context, this.c, wdeVar, this.o, arrayList, z, i, executor2, executor3, this.l, this.m, linkedHashSet, this.e, this.f);
        Class cls = this.b;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = canonicalName.replace('.', '_').concat("_Impl");
        try {
            ilc ilcVar = (ilc) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            ilcVar.d = ilcVar.f(d34Var);
            Set setI = ilcVar.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = setI.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = ilcVar.h;
                int i3 = -1;
                List list = d34Var.n;
                if (zHasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i4 = size - 1;
                            if (cls2.isAssignableFrom(list.get(size).getClass())) {
                                bitSet.set(size);
                                i3 = size;
                                break;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size = i4;
                        }
                    }
                    if (i3 < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls2, list.get(i3));
                } else {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i5 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size2 = i5;
                        }
                    }
                    Iterator it3 = ilcVar.g().iterator();
                    while (true) {
                        boolean zContainsKey = false;
                        if (!it3.hasNext()) {
                            break;
                        }
                        da9 da9Var = (da9) it3.next();
                        int i6 = da9Var.a;
                        sy4 sy4Var = d34Var.d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) sy4Var.b;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                            if (map == null) {
                                map = oz4.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(da9Var.b));
                        }
                        if (!zContainsKey) {
                            sy4Var.k(da9Var);
                        }
                    }
                    ilcVar.h().setWriteAheadLoggingEnabled(d34Var.g == 3);
                    ilcVar.g = d34Var.e;
                    ilcVar.b = d34Var.h;
                    ilcVar.c = new qm(d34Var.i, 2);
                    ilcVar.f = d34Var.f;
                    Map mapJ = ilcVar.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it4 = mapJ.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it4.hasNext();
                        List list2 = d34Var.m;
                        if (!zHasNext2) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i7 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i7 < 0) {
                                        break;
                                    }
                                    size3 = i7;
                                }
                            }
                            return ilcVar;
                        }
                        Map.Entry entry = (Map.Entry) it4.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i8 = size4 - 1;
                                    if (cls4.isAssignableFrom(list2.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i8 < 0) {
                                        break;
                                    }
                                    size4 = i8;
                                }
                            } else {
                                size4 = -1;
                            }
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            ilcVar.l.put(cls4, list2.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}
