package defpackage;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class rpd implements hw0 {
    public static final HashSet i = new HashSet();
    public final File a;
    public final re7 b;
    public final x99 c;
    public final HashMap d;
    public final Random e;
    public final boolean f;
    public long g;
    public Cache$CacheException h;

    public rpd(File file, re7 re7Var) {
        boolean zAdd;
        x99 x99Var = new x99(file);
        synchronized (rpd.class) {
            zAdd = i.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 46);
            sb.append("Another SimpleCache instance uses the folder: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
        this.a = file;
        this.b = re7Var;
        this.c = x99Var;
        this.d = new HashMap();
        this.e = new Random();
        this.f = true;
        this.g = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new n74(this, conditionVariable, 1).start();
        conditionVariable.block();
    }

    public static void a(rpd rpdVar) throws Throwable {
        long j;
        x99 x99Var = rpdVar.c;
        File file = rpdVar.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e) {
                rpdVar.h = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(strValueOf);
            rpdVar.h = new Cache$CacheException(sb.toString());
            return;
        }
        int length = fileArrListFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    new StringBuilder(String.valueOf(file2).length() + 20);
                    file2.delete();
                }
            }
            i2++;
        }
        rpdVar.g = j;
        if (j == -1) {
            try {
                rpdVar.g = f(file);
            } catch (IOException e2) {
                String strValueOf2 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
                sb2.append("Failed to create cache UID: ");
                sb2.append(strValueOf2);
                String string = sb2.toString();
                fm9.c(string, e2);
                rpdVar.h = new Cache$CacheException(string, e2);
                return;
            }
        }
        try {
            x99Var.k(rpdVar.g);
            rpdVar.getClass();
            rpdVar.h(file, true, fileArrListFiles);
            m5f it = jx6.j(((HashMap) x99Var.a).keySet()).iterator();
            while (it.hasNext()) {
                x99Var.l((String) it.next());
            }
            try {
                x99Var.n();
            } catch (IOException e3) {
                fm9.c("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String strValueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 36);
            sb3.append("Failed to initialize cache indices: ");
            sb3.append(strValueOf3);
            String string2 = sb3.toString();
            fm9.c(string2, e4);
            rpdVar.h = new Cache$CacheException(string2, e4);
        }
    }

    public static void e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("Failed to create cache directory: ");
        sb.append(strValueOf);
        throw new Cache$CacheException(sb.toString());
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        String strValueOf = String.valueOf(Long.toString(jAbs, 16));
        File file2 = new File(file, ".uid".length() != 0 ? strValueOf.concat(".uid") : new String(strValueOf));
        if (file2.createNewFile()) {
            return jAbs;
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(strValueOf2);
        throw new IOException(sb.toString());
    }

    public final void b(upd updVar) {
        x99 x99Var = this.c;
        String str = updVar.a;
        x99Var.j(str).c.add(updVar);
        ArrayList arrayList = (ArrayList) this.d.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((re7) arrayList.get(size)).b(this, updVar);
            }
        }
        this.b.b(this, updVar);
    }

    public final synchronized void c(String str, h7b h7bVar) {
        d();
        x99 x99Var = this.c;
        lx0 lx0VarJ = x99Var.j(str);
        lx0VarJ.e = lx0VarJ.e.b(h7bVar);
        if (!r4.equals(r1)) {
            ((nx0) x99Var.X).q(lx0VarJ);
        }
        try {
            this.c.n();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.h;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized a94 g(String str) {
        lx0 lx0VarI;
        lx0VarI = this.c.i(str);
        return lx0VarI != null ? lx0VarI.e : a94.c;
    }

    public final void h(File file, boolean z, File[] fileArr) throws NumberFormatException {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                h(file2, false, file2.listFiles());
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                upd updVarB = upd.b(file2, -1L, this.c);
                if (updVarB != null) {
                    b(updVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void i(upd updVar) {
        lx0 lx0VarI = this.c.i(updVar.a);
        lx0VarI.getClass();
        long j = updVar.b;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = lx0VarI.d;
            if (i2 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((jx0) arrayList.get(i2)).a == j) {
                arrayList.remove(i2);
                this.c.l(lx0VarI.b);
                notifyAll();
            } else {
                i2++;
            }
        }
    }

    public final void j(dx0 dx0Var) {
        String str = dx0Var.a;
        x99 x99Var = this.c;
        lx0 lx0VarI = x99Var.i(str);
        if (lx0VarI == null || !lx0VarI.c.remove(dx0Var)) {
            return;
        }
        File file = dx0Var.X;
        if (file != null) {
            file.delete();
        }
        x99Var.l(lx0VarI.b);
        ArrayList arrayList = (ArrayList) this.d.get(dx0Var.a);
        long j = dx0Var.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                re7 re7Var = (re7) arrayList.get(size);
                re7Var.a.remove(dx0Var);
                re7Var.b -= j;
            }
        }
        re7 re7Var2 = this.b;
        re7Var2.a.remove(dx0Var);
        re7Var2.b -= j;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((lx0) it.next()).c.iterator();
            while (it2.hasNext()) {
                dx0 dx0Var = (dx0) it2.next();
                if (dx0Var.X.length() != dx0Var.c) {
                    arrayList.add(dx0Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            j((dx0) arrayList.get(i2));
        }
    }

    public final synchronized upd l(long j, String str, long j2) {
        upd updVarA;
        upd updVar;
        d();
        lx0 lx0VarI = this.c.i(str);
        if (lx0VarI == null) {
            updVar = new upd(str, j, j2, -9223372036854775807L, null);
        } else {
            while (true) {
                updVarA = lx0VarI.a(j, j2);
                if (!updVarA.o || updVarA.X.length() == updVarA.c) {
                    break;
                }
                k();
            }
            updVar = updVarA;
        }
        if (updVar.o) {
            return m(str, updVar);
        }
        lx0 lx0VarJ = this.c.j(str);
        long j3 = updVar.c;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = lx0VarJ.d;
            if (i2 >= arrayList.size()) {
                arrayList.add(new jx0(j, j3));
                return updVar;
            }
            jx0 jx0Var = (jx0) arrayList.get(i2);
            long j4 = jx0Var.a;
            if (j4 <= j) {
                long j5 = jx0Var.b;
                if (j5 == -1 || j4 + j5 > j) {
                    break;
                }
                i2++;
            } else {
                if (j3 == -1 || j + j3 > j4) {
                    break;
                }
                i2++;
            }
        }
        return null;
    }

    public final upd m(String str, upd updVar) {
        File file;
        if (!this.f) {
            return updVar;
        }
        File file2 = updVar.X;
        file2.getClass();
        file2.getName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        lx0 lx0VarI = this.c.i(str);
        TreeSet treeSet = lx0VarI.c;
        np8.f(treeSet.remove(updVar));
        file2.getClass();
        File parentFile = file2.getParentFile();
        parentFile.getClass();
        File fileC = upd.c(parentFile, lx0VarI.a, updVar.b, jCurrentTimeMillis);
        if (file2.renameTo(fileC)) {
            file = fileC;
        } else {
            String strValueOf = String.valueOf(file2);
            new StringBuilder(String.valueOf(fileC).length() + strValueOf.length() + 21);
            file = file2;
        }
        np8.f(updVar.o);
        upd updVar2 = new upd(updVar.a, updVar.b, updVar.c, jCurrentTimeMillis, file);
        treeSet.add(updVar2);
        ArrayList arrayList = (ArrayList) this.d.get(updVar.a);
        long j = updVar.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                re7 re7Var = (re7) arrayList.get(size);
                re7Var.a.remove(updVar);
                re7Var.b -= j;
                re7Var.b(this, updVar2);
            }
        }
        re7 re7Var2 = this.b;
        re7Var2.a.remove(updVar);
        re7Var2.b -= j;
        re7Var2.b(this, updVar2);
        return updVar2;
    }
}
