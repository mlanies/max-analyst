package defpackage;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class fz1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final TreeMap b = new TreeMap(new x93(false));
    public final nc0 c;
    public final nc0 d;

    public fz1(pl8 pl8Var) {
        mb0 mb0Var = mb0.d;
        Iterator it = new ArrayList(mb0.l).iterator();
        while (true) {
            nc0 nc0Var = null;
            if (!it.hasNext()) {
                break;
            }
            mb0 mb0Var2 = (mb0) it.next();
            c54.p("Currently only support ConstantQuality", mb0Var2 instanceof mb0);
            f15 f15VarA = pl8Var.A(mb0Var2.a);
            if (f15VarA != null) {
                f15VarA.toString();
                if (!f15VarA.d().isEmpty()) {
                    int iA = f15VarA.a();
                    int iB = f15VarA.b();
                    List listC = f15VarA.c();
                    List listD = f15VarA.d();
                    c54.j("Should contain at least one VideoProfile.", !listD.isEmpty());
                    nc0Var = new nc0(iA, iB, Collections.unmodifiableList(new ArrayList(listC)), Collections.unmodifiableList(new ArrayList(listD)), listC.isEmpty() ? null : (fa0) listC.get(0), (ha0) listD.get(0));
                }
                if (nc0Var == null) {
                    Objects.toString(mb0Var2);
                } else {
                    ha0 ha0Var = nc0Var.f;
                    this.b.put(new Size(ha0Var.e, ha0Var.f), mb0Var2);
                    this.a.put(mb0Var2, nc0Var);
                }
            }
        }
        if (this.a.isEmpty()) {
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (nc0) arrayDeque.peekFirst();
            this.d = (nc0) arrayDeque.peekLast();
        }
    }

    public final nc0 a(Size size) {
        Object value;
        TreeMap treeMap = this.b;
        Size size2 = msd.a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        nc0 nc0VarB = null;
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        mb0 mb0Var = (mb0) value;
        if (mb0Var == null) {
            mb0Var = mb0.j;
        }
        Objects.toString(mb0Var);
        Objects.toString(size);
        if (mb0Var == mb0.j || (nc0VarB = b(mb0Var)) != null) {
            return nc0VarB;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public final nc0 b(mb0 mb0Var) {
        c54.j("Unknown quality: " + mb0Var, mb0.k.contains(mb0Var));
        return mb0Var == mb0.i ? this.c : mb0Var == mb0.h ? this.d : (nc0) this.a.get(mb0Var);
    }
}
