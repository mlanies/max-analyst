package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class p4d {
    public final hp h;
    public final qe5 i;
    public final imc j;
    public CharSequence k;
    public int l;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set e = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set g = Collections.newSetFromMap(new ConcurrentHashMap());
    public final CopyOnWriteArraySet m = new CopyOnWriteArraySet();

    public p4d(hp hpVar, qe5 qe5Var, imc imcVar) {
        this.h = hpVar;
        this.i = qe5Var;
        this.j = imcVar;
        if (((jp) hpVar).g.getBoolean("app.send.media.as.collage", true)) {
            this.l = 3;
        } else {
            this.l = 1;
        }
    }

    public static boolean k(up7 up7Var, r4d r4dVar) {
        up7 up7Var2 = r4dVar.a;
        if (up7Var2 == null || up7Var == null) {
            return false;
        }
        if ((up7Var instanceof j00) && (up7Var2 instanceof j00)) {
            return oag.d(((j00) up7Var).u0.r, ((j00) up7Var2).u0.r);
        }
        if (up7Var2.b == up7Var.b) {
            return true;
        }
        return kp.e(up7Var.c(), up7Var2.c());
    }

    public final int a(up7 up7Var, int i) {
        RuntimeException runtimeException;
        boolean zJ = j(up7Var);
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (zJ) {
            return copyOnWriteArraySet.size();
        }
        r4d r4dVarH = h(up7Var);
        if (r4dVarH != null) {
            r4dVarH.f = true;
            return g(up7Var);
        }
        r4d r4dVar = new r4d(up7Var);
        r4dVar.c = (awa) this.b.get(Long.valueOf(up7Var.b));
        Set set = this.e;
        if (i < 0 || i >= copyOnWriteArraySet.size()) {
            copyOnWriteArraySet.add(r4dVar);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        ((q96) it.next()).b(r4dVar);
                    } finally {
                    }
                }
            }
            n();
            return copyOnWriteArraySet.size();
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
        arrayList.add(i, r4dVar);
        copyOnWriteArraySet.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r4d r4dVar2 = (r4d) it2.next();
            copyOnWriteArraySet.add(r4dVar2);
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    try {
                        ((q96) it3.next()).b(r4dVar2);
                    } finally {
                    }
                }
            }
            n();
        }
        return i + 1;
    }

    public final int b() {
        return c().size();
    }

    public final List c() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                if (((r4d) next).f) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            r4d r4dVar = (r4d) it.next();
            if (r4dVar.f) {
                up7 up7Var = r4dVar.a;
                if ((up7Var instanceof j00) && !awa.b(r4dVar.c, up7Var)) {
                    arrayList.add(new k00(up7Var.a, up7Var.a(), ((j00) up7Var).u0));
                } else {
                    String strF = f(r4dVar);
                    if (strF != null) {
                        int i = up7Var.a;
                        if (this.l == 2) {
                            i = 7;
                        }
                        arrayList.add(new aqd(i, strF));
                    } else {
                        arrayList.add(l(r4dVar));
                    }
                }
            }
        }
        return arrayList;
    }

    public final awa e(up7 up7Var) {
        r4d r4dVarH = h(up7Var);
        awa awaVar = r4dVarH != null ? r4dVarH.c : null;
        return awaVar == null ? (awa) this.b.get(Long.valueOf(up7Var.b)) : awaVar;
    }

    public final String f(r4d r4dVar) {
        awa awaVar = r4dVar.c;
        Uri uri = awaVar != null ? awaVar.X : null;
        Uri uri2 = awaVar != null ? awaVar.b : null;
        Uri uri3 = awaVar != null ? awaVar.a : null;
        if (uri == null) {
            if (uri2 != null) {
                return uri2.getPath();
            }
            if (uri3 != null) {
                return uri3.getPath();
            }
            return null;
        }
        Uri uriA = awa.a(awaVar, r4dVar.a);
        try {
            imc imcVar = this.j;
            Bitmap bitmapQ = imcVar.Q(uriA, true);
            Bitmap bitmapQ2 = imcVar.Q(uri, false);
            Canvas canvas = new Canvas(bitmapQ);
            float width = bitmapQ.getWidth() / bitmapQ2.getWidth();
            canvas.scale(width, width);
            canvas.drawBitmap(bitmapQ2, 0.0f, 0.0f, (Paint) null);
            File fileA = ((zi5) imcVar.c).a("jpg");
            String absolutePath = fileA.getAbsolutePath();
            ph4 ph4Var = j47.X;
            j47.h0(absolutePath, bitmapQ, 100, Bitmap.CompressFormat.JPEG);
            return fileA.getAbsolutePath();
        } catch (Exception e) {
            hm9.p("p4d", "getMediasForSend: exception", e);
            return uriA.toString();
        }
    }

    public final int g(up7 up7Var) {
        if (!j(up7Var)) {
            return 0;
        }
        Iterator it = this.a.iterator();
        int i = 1;
        while (it.hasNext()) {
            r4d r4dVar = (r4d) it.next();
            if (r4dVar.f) {
                if (k(up7Var, r4dVar)) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public final r4d h(up7 up7Var) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        Object obj = null;
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    if (k(up7Var, (r4d) next)) {
                        obj = next;
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return (r4d) obj;
    }

    public final r4d i(int i) {
        List listEmptyList;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    if (((r4d) next).f) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            listEmptyList = arrayList;
        }
        if (i < 0 || i >= listEmptyList.size()) {
            return null;
        }
        return (r4d) listEmptyList.get(i);
    }

    public final boolean j(up7 up7Var) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            try {
                r4d r4dVar = (r4d) it.next();
                if (r4dVar.f && k(up7Var, r4dVar)) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public final aqd l(r4d r4dVar) {
        int i;
        int i2 = this.l;
        up7 up7Var = r4dVar.a;
        if (i2 != 2 && (i = up7Var.a) == 3 && r4dVar.b != null) {
            return new vgf(i, up7Var.a(), r4dVar.b, oag.t(r4dVar.d) ? up7Var.o : r4dVar.d);
        }
        int i3 = up7Var.a;
        String strA = up7Var.a();
        if (this.l == 2) {
            i3 = 7;
        }
        return new aqd(i3, strA);
    }

    public final void m(r4d r4dVar) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((m4d) it.next()).s1(r4dVar);
        }
    }

    public final void n() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((n4d) it.next()).B1(Collections.unmodifiableSet(this.a));
        }
    }

    public final void o(up7 up7Var, File file) {
        a(up7Var, this.a.size());
        r4d r4dVarH = h(up7Var);
        if (r4dVarH == null) {
            return;
        }
        up7 up7Var2 = r4dVarH.a;
        if (up7Var2 instanceof j00) {
            j00 j00Var = (j00) up7Var2;
            j00Var.getClass();
            hm9.n("j00", "Set downloaded file " + file.getPath());
            j00Var.x0 = file;
            String str = j00Var.u0.s;
            if (str == null || str.length() == 0) {
                j10 j10VarJ = j00Var.u0.j();
                j10VarJ.m = file.getPath();
                j00Var.u0 = j10VarJ.a();
            }
        }
        m(r4dVarH);
    }

    public final void p(int i) {
        if (b() > 1) {
            hp hpVar = this.h;
            if (i == 3) {
                ((jp) hpVar).j("app.send.media.as.collage", true);
            } else if (i == 1) {
                ((jp) hpVar).j("app.send.media.as.collage", false);
            }
        }
        this.l = i;
        for (zj9 zj9Var : this.d) {
            int i2 = this.l;
            up7 up7Var = zj9Var.X;
            if (up7Var != null) {
                int i3 = up7Var.a;
                if (i2 == 2) {
                    if (i3 == 1) {
                        zj9Var.d2(new mu1(7));
                    } else if (up7Var.b()) {
                        zj9Var.d2(new mu1(8));
                    }
                } else if (i3 == 1) {
                    zj9Var.d2(new mu1(9));
                } else if (up7Var.b()) {
                    zj9Var.d2(new mu1(10));
                }
            }
        }
    }

    public final void q(up7 up7Var, ref refVar) {
        a(up7Var, this.a.size());
        r4d r4dVarH = h(up7Var);
        if (r4dVarH != null) {
            r4dVarH.b = refVar;
        }
        m(r4dVarH);
    }

    public final int r(up7 up7Var) {
        int iA;
        RuntimeException runtimeException;
        r4d r4dVar;
        CopyOnWriteArraySet copyOnWriteArraySet = this.m;
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                try {
                    ((d96) it.next()).a(o4d.a);
                } finally {
                }
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.a;
        int size = copyOnWriteArraySet2.size();
        boolean zJ = j(up7Var);
        Set set = this.e;
        if (zJ) {
            Iterator it2 = copyOnWriteArraySet2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    r4dVar = null;
                    break;
                }
                r4dVar = (r4d) it2.next();
                if (k(up7Var, r4dVar)) {
                    copyOnWriteArraySet2.remove(r4dVar);
                    break;
                }
            }
            if (r4dVar != null && set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    try {
                        ((q96) it3.next()).a(r4dVar);
                    } finally {
                    }
                }
            }
            n();
            if (r4dVar != null && !up7Var.c.equals(awa.a(r4dVar.c, up7Var).toString())) {
                m(r4dVar);
            }
            iA = 0;
        } else {
            r4d r4dVarH = h(up7Var);
            if (r4dVarH != null) {
                copyOnWriteArraySet2.remove(r4dVarH);
                copyOnWriteArraySet2.add(r4dVarH);
                r4dVarH.f = true;
                if (set != null) {
                    Iterator it4 = set.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((q96) it4.next()).b(r4dVarH);
                        } finally {
                        }
                    }
                }
                n();
                iA = g(up7Var);
            } else {
                iA = a(up7Var, size);
            }
        }
        if (copyOnWriteArraySet != null) {
            Iterator it5 = copyOnWriteArraySet.iterator();
            while (it5.hasNext()) {
                try {
                    ((d96) it5.next()).a(o4d.b);
                } finally {
                }
            }
        }
        return iA;
    }
}
