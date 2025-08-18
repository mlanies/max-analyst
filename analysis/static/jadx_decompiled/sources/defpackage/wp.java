package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class wp implements x3a, qj3, m7a, wu, q16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ wp(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // defpackage.x3a
    public void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                break;
            default:
                this.b.invoke(obj);
                break;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        z07 z07Var;
        Object next;
        j5g j5gVar;
        j5g j5gVar2;
        List list;
        Object next2;
        switch (this.a) {
            case 1:
                this.b.invoke((u82) obj);
                break;
            case 2:
            default:
                this.b.invoke((j10) obj);
                break;
            case 3:
                m20 m20Var = (m20) obj;
                z07 z07Var2 = m20Var.b;
                m56 m56Var = this.b;
                if (z07Var2 == null) {
                    Iterator it = m20Var.a.iterator();
                    while (true) {
                        z07Var = null;
                        if (it.hasNext()) {
                            next = it.next();
                            if (((l20) next).n != null) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    l20 l20Var = (l20) next;
                    if (l20Var != null && (j5gVar2 = l20Var.n) != null && (list = j5gVar2.a) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((f5g) next2).b()) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        f5g f5gVar = (f5g) next2;
                        if (f5gVar != null) {
                            z07Var = f5gVar.c;
                        }
                    }
                    if (z07Var != null) {
                        y07 y07Var = new y07();
                        y07Var.a = z07Var.a;
                        y07Var.b = z07Var.b;
                        m56Var.invoke(y07Var);
                        l20 l20Var2 = (l20) x53.i0(m20Var.a);
                        if (l20Var2 != null && (j5gVar = l20Var2.n) != null) {
                            List list2 = j5gVar.a;
                            Iterator it3 = list2.iterator();
                            int i = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i = -1;
                                } else if (!((f5g) it3.next()).b()) {
                                    i++;
                                }
                            }
                            f5g f5gVar2 = (f5g) list2.get(i);
                            ArrayList arrayList = new ArrayList(list2);
                            arrayList.set(i, new f5g(f5gVar2.a, f5gVar2.b, new z07(y07Var), f5gVar2.d));
                            List list3 = m20Var.a;
                            j10 j10VarJ = l20Var2.j();
                            j10VarJ.w = new j5g(arrayList);
                            list3.set(0, j10VarJ.a());
                            break;
                        }
                    }
                } else {
                    y07 y07Var2 = new y07();
                    y07Var2.a = z07Var2.a;
                    y07Var2.b = z07Var2.b;
                    m56Var.invoke(y07Var2);
                    m20Var.b = new z07(y07Var2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        return (bm7) this.b.invoke(obj);
    }

    @Override // defpackage.q16
    public void b(String str, Bundle bundle) {
        ktc ktcVar = (ktc) bundle.getParcelable(str);
        if (ktcVar == null) {
            return;
        }
        this.b.invoke(ktcVar);
    }

    @Override // defpackage.m7a
    public void c(int i) {
        this.b.invoke(Integer.valueOf(i));
    }

    public /* synthetic */ wp(m56 m56Var, r79 r79Var) {
        this.a = 3;
        this.b = m56Var;
    }
}
