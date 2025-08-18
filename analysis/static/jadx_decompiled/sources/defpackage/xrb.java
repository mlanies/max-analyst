package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class xrb implements py9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xrb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Throwable th) {
    }

    private final void c(Throwable th) {
    }

    @Override // defpackage.py9
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((tj3) this.b).accept(obj);
                return;
            case 1:
                ((adc) this.b).b.v((Boolean) obj);
                return;
            default:
                ub0 ub0Var = (ub0) obj;
                if (ub0Var == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                rdf rdfVar = (rdf) this.b;
                if (rdfVar.v == 3) {
                    return;
                }
                Objects.toString(rdfVar.r);
                ub0Var.toString();
                ub0 ub0Var2 = rdfVar.r;
                rdfVar.r = ub0Var;
                vb0 vb0Var = rdfVar.g;
                vb0Var.getClass();
                int i = ub0Var2.a;
                Set set = ub0.e;
                boolean zContains = set.contains(Integer.valueOf(i));
                int i2 = ub0Var.a;
                if ((!zContains && !set.contains(Integer.valueOf(i2)) && i != i2) || (rdfVar.z && ub0Var2.c != null && ub0Var.c == null)) {
                    rdfVar.N();
                    return;
                }
                int i3 = ub0Var2.a;
                if ((i3 != -1 && i2 == -1) || (i3 == -1 && i2 != -1)) {
                    rdfVar.H(rdfVar.s, ub0Var, vb0Var);
                    Object[] objArr = {rdfVar.s.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    rdfVar.E(Collections.unmodifiableList(arrayList));
                    rdfVar.q();
                    return;
                }
                if (ub0Var2.b != ub0Var.b) {
                    rdfVar.H(rdfVar.s, ub0Var, vb0Var);
                    Object[] objArr2 = {rdfVar.s.c()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    rdfVar.E(Collections.unmodifiableList(arrayList2));
                    Iterator it = rdfVar.a.iterator();
                    while (it.hasNext()) {
                        ((k9f) it.next()).i(rdfVar);
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.py9
    public final void onError(Throwable th) {
        switch (this.a) {
            case 1:
                cd6 cd6Var = ((adc) this.b).b;
                cd6Var.getClass();
                cd6Var.v(new tb0(th));
                break;
        }
    }
}
