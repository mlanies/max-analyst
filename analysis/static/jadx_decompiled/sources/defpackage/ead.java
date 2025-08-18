package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ead extends aad {
    public final ae3 j = new ae3(6);
    public boolean k = true;
    public boolean l = false;
    public final ArrayList m = new ArrayList();

    public final void a(fad fadVar) {
        Map map;
        Object objH;
        kz1 kz1Var = fadVar.g;
        int i = kz1Var.c;
        u40 u40Var = this.b;
        if (i != -1) {
            this.l = true;
            int i2 = u40Var.c;
            Integer numValueOf = Integer.valueOf(i);
            List list = fad.j;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            u40Var.c = i;
        }
        aa0 aa0Var = kz1.k;
        Range range = vb0.f;
        ce3 ce3Var = kz1Var.b;
        Range range2 = (Range) ce3Var.f(aa0Var, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            mi9 mi9Var = (mi9) u40Var.f;
            mi9Var.getClass();
            try {
                objH = mi9Var.h(aa0Var);
            } catch (IllegalArgumentException unused) {
                objH = range;
            }
            if (((Range) objH).equals(range)) {
                ((mi9) u40Var.f).j(kz1.k, range2);
            } else {
                mi9 mi9Var2 = (mi9) u40Var.f;
                aa0 aa0Var2 = kz1.k;
                Object objH2 = vb0.f;
                mi9Var2.getClass();
                try {
                    objH2 = mi9Var2.h(aa0Var2);
                } catch (IllegalArgumentException unused2) {
                }
                if (!((Range) objH2).equals(range2)) {
                    this.k = false;
                }
            }
        }
        int iB = kz1Var.b();
        if (iB != 0) {
            u40Var.getClass();
            if (iB != 0) {
                ((mi9) u40Var.f).j(o9f.p0, Integer.valueOf(iB));
            }
        }
        int iC = kz1Var.c();
        if (iC != 0) {
            u40Var.getClass();
            if (iC != 0) {
                ((mi9) u40Var.f).j(o9f.q0, Integer.valueOf(iC));
            }
        }
        kz1 kz1Var2 = fadVar.g;
        nje njeVar = kz1Var2.g;
        Map map2 = ((ui9) u40Var.g).a;
        if (map2 != null && (map = njeVar.a) != null) {
            map2.putAll(map);
        }
        this.c.addAll(fadVar.c);
        this.d.addAll(fadVar.d);
        u40Var.a(kz1Var2.e);
        this.e.addAll(fadVar.e);
        dad dadVar = fadVar.f;
        if (dadVar != null) {
            this.m.add(dadVar);
        }
        InputConfiguration inputConfiguration = fadVar.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        LinkedHashSet<rb0> linkedHashSet = this.a;
        linkedHashSet.addAll(fadVar.a);
        HashSet hashSet = (HashSet) u40Var.e;
        hashSet.addAll(Collections.unmodifiableList(kz1Var.a));
        ArrayList arrayList = new ArrayList();
        for (rb0 rb0Var : linkedHashSet) {
            arrayList.add(rb0Var.a);
            Iterator it = rb0Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((xf4) it.next());
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            this.k = false;
        }
        int i3 = this.h;
        int i4 = fadVar.h;
        if (i4 != i3 && i4 != 0 && i3 != 0) {
            this.k = false;
        } else if (i4 != 0) {
            this.h = i4;
        }
        rb0 rb0Var2 = fadVar.b;
        if (rb0Var2 != null) {
            rb0 rb0Var3 = this.i;
            if (rb0Var3 == rb0Var2 || rb0Var3 == null) {
                this.i = rb0Var2;
            } else {
                this.k = false;
            }
        }
        u40Var.c(ce3Var);
    }

    public final fad b() {
        if (!this.k) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.a);
        ae3 ae3Var = this.j;
        if (ae3Var.b) {
            Collections.sort(arrayList, new ca3(6, ae3Var));
        }
        return new fad(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), !this.m.isEmpty() ? new kt6(4, this) : null, this.g, this.h, this.i);
    }
}
