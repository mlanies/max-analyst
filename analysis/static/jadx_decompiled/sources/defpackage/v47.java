package defpackage;

import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.http.client.methods.HttpDelete;

/* loaded from: classes.dex */
public final class v47 {
    public static final String[] o = {"UPDATE", HttpDelete.METHOD_NAME, "INSERT"};
    public final ilc a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g;
    public volatile q36 h;
    public final w36 i;
    public final ph4 j;
    public final rqc k;
    public final Object l;
    public final Object m;
    public final re n;

    public v47(ilc ilcVar, HashMap map, HashMap map2, String... strArr) {
        this.a = ilcVar;
        this.b = map;
        this.c = map2;
        int length = strArr.length;
        w36 w36Var = new w36();
        w36Var.b = new long[length];
        w36Var.c = new boolean[length];
        w36Var.o = new int[length];
        this.i = w36Var;
        this.j = new ph4(ilcVar, 23);
        this.k = new rqc();
        this.l = new Object();
        this.m = new Object();
        this.d = new LinkedHashMap();
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i = 0; i < length2; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.d.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase4, mz7.X(linkedHashMap, lowerCase3));
            }
        }
        this.n = new re(29, this);
    }

    public final void a(s47 s47Var) {
        t47 t47Var;
        boolean z;
        String[] strArrD = d(s47Var.a);
        ArrayList arrayList = new ArrayList(strArrD.length);
        for (String str : strArrD) {
            Integer num = (Integer) this.d.get(str.toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrC0 = x53.C0(arrayList);
        t47 t47Var2 = new t47(s47Var, iArrC0, strArrD);
        synchronized (this.k) {
            t47Var = (t47) this.k.b(s47Var, t47Var2);
        }
        if (t47Var == null) {
            w36 w36Var = this.i;
            int[] iArrCopyOf = Arrays.copyOf(iArrC0, iArrC0.length);
            synchronized (w36Var) {
                z = false;
                for (int i : iArrCopyOf) {
                    long[] jArr = (long[]) w36Var.b;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        w36Var.a = true;
                    }
                }
            }
            if (z) {
                ilc ilcVar = this.a;
                if (ilcVar.n()) {
                    f(ilcVar.h().getWritableDatabase());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.a.n()) {
            return false;
        }
        if (!this.g) {
            this.a.h().getWritableDatabase();
        }
        return this.g;
    }

    public final void c(s47 s47Var) {
        t47 t47Var;
        boolean z;
        synchronized (this.k) {
            t47Var = (t47) this.k.c(s47Var);
        }
        if (t47Var != null) {
            w36 w36Var = this.i;
            int[] iArr = t47Var.b;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            synchronized (w36Var) {
                z = false;
                for (int i : iArrCopyOf) {
                    long[] jArr = (long[]) w36Var.b;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        w36Var.a = true;
                    }
                }
            }
            if (z) {
                ilc ilcVar = this.a;
                if (ilcVar.n()) {
                    f(ilcVar.h().getWritableDatabase());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        wbd wbdVar = new wbd();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            Map map = this.c;
            if (map.containsKey(lowerCase)) {
                wbdVar.addAll((Collection) map.get(str.toLowerCase(locale)));
            } else {
                wbdVar.add(str);
            }
        }
        return (String[]) z7.a(wbdVar).toArray(new String[0]);
    }

    public final void e(k36 k36Var, int i) {
        k36Var.U("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        String[] strArr = o;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i);
            sb.append(" AND invalidated = 0; END");
            k36Var.U(sb.toString());
        }
    }

    public final void f(k36 k36Var) {
        if (k36Var.m0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.a.i.readLock();
            lock.lock();
            try {
                synchronized (this.l) {
                    int[] iArrO = this.i.o();
                    if (iArrO == null) {
                        return;
                    }
                    if (k36Var.n0()) {
                        k36Var.n();
                    } else {
                        k36Var.m();
                    }
                    try {
                        int length = iArrO.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = iArrO[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                e(k36Var, i2);
                            } else if (i3 == 2) {
                                String str = this.e[i2];
                                String[] strArr = o;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = strArr[i5];
                                    StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                    sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                    k36Var.U(sb.toString());
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        k36Var.r0();
                        k36Var.S();
                    } catch (Throwable th) {
                        k36Var.S();
                        throw th;
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }
}
