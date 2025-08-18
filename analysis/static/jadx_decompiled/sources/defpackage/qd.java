package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class qd implements iq6 {
    public static final Pattern d = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern e = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final je7 b;
    public final w0f c;

    public qd(je7 je7Var, w0f w0fVar) {
        this.b = je7Var;
        this.c = w0fVar;
    }

    public static boolean d(qd qdVar, yic yicVar, long j) {
        qdVar.getClass();
        if (yicVar.o != 416) {
            return false;
        }
        String strA = yicVar.Y.a("Content-Range");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return false;
        }
        Matcher matcher = d.matcher(strA);
        return matcher.find() && ((long) Integer.parseInt(matcher.group(1))) == j;
    }

    public static File e(qd qdVar, File file, File file2, String str) throws Throwable {
        File fileP;
        qdVar.getClass();
        try {
            if (!oag.t(str)) {
                String name = file2.getName();
                int iE0 = w9e.E0(name, '.', 0, 6);
                if (iE0 >= 0) {
                    name = name.substring(0, iE0);
                }
                file2 = new File(file2.getParentFile(), name + "." + str);
            }
            fileP = kj6.p(file2.getParentFile(), file2.getName());
        } catch (IOException e2) {
            e = e2;
            fileP = null;
        }
        try {
            s5c.s(file, fileP);
            file.delete();
        } catch (IOException e3) {
            e = e3;
            hm9.p("qd", e.getMessage(), null);
            return fileP;
        }
        return fileP;
    }

    public static String f(qd qdVar, yic yicVar) {
        qdVar.getClass();
        String strA = yicVar.Y.a("Content-Disposition");
        if (strA == null) {
            strA = null;
        }
        if (oag.t(strA)) {
            return null;
        }
        Matcher matcher = e.matcher(strA);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void g(qd qdVar, pd pdVar, String str) {
        qdVar.getClass();
        synchronized (pdVar.a) {
            pdVar.a.clear();
        }
        qdVar.a.remove(str);
    }

    public static void h(qd qdVar, pd pdVar, File file) {
        qdVar.getClass();
        file.delete();
        synchronized (pdVar.a) {
            try {
                Iterator it = pdVar.a.iterator();
                while (it.hasNext()) {
                    try {
                        ((fq6) it.next()).b();
                    } catch (Throwable th) {
                        hm9.p("qd", "failed to notify listener on url expired", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static File i(File file, String str) {
        return new File(file.getParent(), file.getName() + "_part_" + str);
    }

    @Override // defpackage.iq6
    public final void a(File file, String str) {
        pd pdVar = (pd) this.a.get(i(file, str).getAbsolutePath());
        if (pdVar != null) {
            pdVar.b.d();
            synchronized (pdVar.a) {
                try {
                    Iterator it = pdVar.a.iterator();
                    while (it.hasNext()) {
                        ((fq6) it.next()).d();
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.iq6
    public final boolean b(String str, File file, fq6 fq6Var, String str2) {
        hm9.m("qd", "downloadFile url = %s", str);
        File fileI = i(file, str2);
        if (this.a.containsKey(fileI.getAbsolutePath())) {
            pd pdVar = (pd) this.a.get(fileI.getAbsolutePath());
            if (pdVar != null) {
                synchronized (pdVar.a) {
                    for (int i = 0; i < pdVar.a.size(); i++) {
                        try {
                            if (((fq6) pdVar.a.get(i)).getDownloadContext().equals(fq6Var.getDownloadContext())) {
                                hm9.n("qd", "file already downloading in listener context, do nothing return false");
                                return false;
                            }
                        } finally {
                        }
                    }
                    hm9.n("qd", "file already downloading add listener and return true");
                    pdVar.a.add(fq6Var);
                }
            }
            return true;
        }
        try {
            l84 l84Var = new l84();
            l84Var.S(str);
            l84Var.Q(UUID.randomUUID().toString());
            if (fileI.exists() && fileI.length() > 0) {
                hm9.n("qd", "resume download file, downloaded size: " + fileI.length());
                ((bj6) l84Var.c).a("Range", "bytes=" + fileI.length() + "-");
            }
            mhc mhcVarR = l84Var.r();
            b8c b8cVarB = ((u2a) this.b.getValue()).b(mhcVarR);
            pd pdVar2 = new pd(b8cVarB);
            synchronized (pdVar2.a) {
                pdVar2.a.add(fq6Var);
                this.a.put(fileI.getAbsolutePath(), pdVar2);
            }
            od odVar = new od();
            odVar.Y = this;
            odVar.b = mhcVarR;
            odVar.c = pdVar2;
            odVar.o = fileI;
            odVar.X = file;
            odVar.a = false;
            b8cVarB.e(odVar);
            hm9.n("qd", "start file download");
            return true;
        } catch (IllegalArgumentException unused) {
            fq6Var.a();
            fileI.delete();
            return false;
        }
    }

    @Override // defpackage.iq6
    public final void c(fq6 fq6Var) {
        if (fq6Var != null) {
            for (pd pdVar : this.a.values()) {
                synchronized (pdVar.a) {
                    pdVar.a.remove(fq6Var);
                }
            }
        }
    }
}
