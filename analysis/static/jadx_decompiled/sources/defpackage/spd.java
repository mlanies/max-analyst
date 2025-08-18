package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class spd implements gw0 {
    public static final HashSet j = new HashSet();
    public final File a;
    public final qw0 b;
    public final bwf c;
    public final h7b d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public Cache$CacheException i;

    public spd(File file, qw0 qw0Var, e34 e34Var, boolean z) {
        boolean zAdd;
        bwf bwfVar = new bwf(e34Var, file, z);
        h7b h7bVar = (e34Var == null || z) ? null : new h7b(1, e34Var);
        synchronized (spd.class) {
            zAdd = j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.a = file;
        this.b = qw0Var;
        this.c = bwfVar;
        this.d = h7bVar;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new n74(this, conditionVariable, 2).start();
        conditionVariable.block();
    }

    public static void a(spd spdVar) throws NumberFormatException {
        long j2;
        bwf bwfVar = spdVar.c;
        File file = spdVar.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e) {
                spdVar.i = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            z04.u(str);
            spdVar.i = new Cache$CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    z04.u("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        spdVar.h = j2;
        if (j2 == -1) {
            try {
                spdVar.h = f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                z04.v(str2, e2);
                spdVar.i = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            bwfVar.j(spdVar.h);
            h7b h7bVar = spdVar.d;
            if (h7bVar != null) {
                h7bVar.o(spdVar.h);
                HashMap mapH = h7bVar.h();
                spdVar.j(file, true, fileArrListFiles, mapH);
                h7bVar.v(mapH.keySet());
            } else {
                spdVar.j(file, true, fileArrListFiles, null);
            }
            m5f it = jx6.j(((HashMap) bwfVar.a).keySet()).iterator();
            while (it.hasNext()) {
                bwfVar.k((String) it.next());
            }
            try {
                bwfVar.o();
            } catch (IOException e3) {
                z04.v("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            z04.v(str3, e4);
            spdVar.i = new Cache$CacheException(str3, e4);
        }
    }

    public static void e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        z04.u(str);
        throw new Cache$CacheException(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, au1.g(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(vpd vpdVar) {
        bwf bwfVar = this.c;
        String str = vpdVar.a;
        bwfVar.i(str).c.add(vpdVar);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qw0) arrayList.get(size)).b(this, vpdVar);
            }
        }
        this.b.b(this, vpdVar);
    }

    public final synchronized void c(String str, imc imcVar) {
        d();
        bwf bwfVar = this.c;
        mx0 mx0VarI = bwfVar.i(str);
        mx0VarI.e = mx0VarI.e.b(imcVar);
        if (!r4.equals(r1)) {
            ((ox0) bwfVar.e).e(mx0VarI);
        }
        try {
            this.c.o();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.i;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized long g(long j2, String str, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        long j6 = j5 < 0 ? Long.MAX_VALUE : j5;
        long j7 = j2;
        j4 = 0;
        while (j7 < j6) {
            long jH = h(j7, str, j6 - j7);
            if (jH > 0) {
                j4 += jH;
            } else {
                jH = -jH;
            }
            j7 += jH;
        }
        return j4;
    }

    public final synchronized long h(long j2, String str, long j3) {
        mx0 mx0VarH;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        mx0VarH = this.c.h(str);
        return mx0VarH != null ? mx0VarH.a(j2, j3) : -j3;
    }

    public final synchronized b94 i(String str) {
        mx0 mx0VarH;
        mx0VarH = this.c.h(str);
        return mx0VarH != null ? mx0VarH.e : b94.c;
    }

    public final void j(File file, boolean z, File[] fileArr, HashMap map) throws NumberFormatException {
        long j2;
        long j3;
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
                j(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                rw0 rw0Var = map != null ? (rw0) map.remove(name) : null;
                if (rw0Var != null) {
                    j3 = rw0Var.a;
                    j2 = rw0Var.b;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = -1;
                }
                vpd vpdVarB = vpd.b(file2, j3, j2, this.c);
                if (vpdVarB != null) {
                    b(vpdVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void k(vpd vpdVar) {
        mx0 mx0VarH = this.c.h(vpdVar.a);
        mx0VarH.getClass();
        long j2 = vpdVar.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = mx0VarH.d;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((kx0) arrayList.get(i)).a == j2) {
                arrayList.remove(i);
                this.c.k(mx0VarH.b);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    public final synchronized void l(String str) {
        mx0 mx0VarH;
        synchronized (this) {
            try {
                mx0VarH = this.c.h(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((mx0VarH == null || mx0VarH.c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) mx0VarH.c)).iterator();
        while (it.hasNext()) {
            m((ex0) it.next());
        }
    }

    public final void m(ex0 ex0Var) throws DatabaseIOException {
        String str = ex0Var.a;
        bwf bwfVar = this.c;
        mx0 mx0VarH = bwfVar.h(str);
        if (mx0VarH == null || !mx0VarH.c.remove(ex0Var)) {
            return;
        }
        File file = ex0Var.X;
        if (file != null) {
            file.delete();
        }
        h7b h7bVar = this.d;
        if (h7bVar != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) h7bVar.c).getClass();
                try {
                    ((e34) h7bVar.b).getWritableDatabase().delete((String) h7bVar.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                k7d.o("Failed to remove file index entry for: ", name);
            }
        }
        bwfVar.k(mx0VarH.b);
        ArrayList arrayList = (ArrayList) this.e.get(ex0Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qw0) arrayList.get(size)).a(this, ex0Var);
            }
        }
        this.b.a(this, ex0Var);
    }

    public final void n() throws DatabaseIOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((mx0) it.next()).c.iterator();
            while (it2.hasNext()) {
                ex0 ex0Var = (ex0) it2.next();
                File file = ex0Var.X;
                file.getClass();
                if (file.length() != ex0Var.c) {
                    arrayList.add(ex0Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m((ex0) arrayList.get(i));
        }
    }

    public final synchronized vpd o(long j2, String str, long j3) {
        vpd vpdVarB;
        vpd vpdVar;
        d();
        mx0 mx0VarH = this.c.h(str);
        if (mx0VarH == null) {
            vpdVar = new vpd(str, j2, j3, -9223372036854775807L, null);
        } else {
            while (true) {
                vpdVarB = mx0VarH.b(j2, j3);
                if (!vpdVarB.o) {
                    break;
                }
                File file = vpdVarB.X;
                file.getClass();
                if (file.length() == vpdVarB.c) {
                    break;
                }
                n();
            }
            vpdVar = vpdVarB;
        }
        if (vpdVar.o) {
            return p(str, vpdVar);
        }
        mx0 mx0VarI = this.c.i(str);
        long j4 = vpdVar.c;
        int i = 0;
        while (true) {
            ArrayList arrayList = mx0VarI.d;
            if (i >= arrayList.size()) {
                arrayList.add(new kx0(j2, j4));
                return vpdVar;
            }
            kx0 kx0Var = (kx0) arrayList.get(i);
            long j5 = kx0Var.a;
            if (j5 <= j2) {
                long j6 = kx0Var.b;
                if (j6 == -1 || j5 + j6 > j2) {
                    break;
                }
                i++;
            } else {
                if (j4 == -1 || j2 + j4 > j5) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    public final vpd p(String str, vpd vpdVar) throws SQLException {
        boolean z;
        File file;
        if (!this.g) {
            return vpdVar;
        }
        File file2 = vpdVar.X;
        file2.getClass();
        String name = file2.getName();
        long j2 = vpdVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        h7b h7bVar = this.d;
        if (h7bVar != null) {
            try {
                h7bVar.x(j2, name, jCurrentTimeMillis);
            } catch (IOException unused) {
                z04.c0("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        mx0 mx0VarH = this.c.h(str);
        mx0VarH.getClass();
        TreeSet treeSet = mx0VarH.c;
        fm9.k(treeSet.remove(vpdVar));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = vpd.c(parentFile, mx0VarH.a, vpdVar.b, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                z04.c0("Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        fm9.k(vpdVar.o);
        vpd vpdVar2 = new vpd(vpdVar.a, vpdVar.b, vpdVar.c, jCurrentTimeMillis, file);
        treeSet.add(vpdVar2);
        ArrayList arrayList = (ArrayList) this.e.get(vpdVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qw0) arrayList.get(size)).d(this, vpdVar, vpdVar2);
            }
        }
        this.b.d(this, vpdVar, vpdVar2);
        return vpdVar2;
    }
}
