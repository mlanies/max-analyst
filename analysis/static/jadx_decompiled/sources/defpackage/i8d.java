package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class i8d extends g9d {
    public final Object A0;
    public final /* synthetic */ int z0 = 0;

    public i8d(h8d h8dVar) {
        super(h8dVar);
        this.A0 = (es8) h8dVar.m;
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        List arrayList;
        k8g k8gVarC;
        List list;
        switch (this.z0) {
            case 0:
                es8 es8Var = (es8) this.A0;
                k8g k8gVar = es8Var.a.z0;
                if (k8gVar == null || (list = (List) k8gVar.a) == null) {
                    arrayList = nz4.a;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((l20) obj).g == null) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = new ArrayList(z53.S(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        j10 j10VarJ = ((l20) it.next()).j();
                        j10VarJ.l = UUID.randomUUID().toString();
                        arrayList.add(j10VarJ.a());
                    }
                }
                bu8 bu8VarH = es8Var.a.H();
                bu8VarH.b = 0L;
                bu8VarH.u = true;
                k8g k8gVar2 = es8Var.a.z0;
                if (k8gVar2 != null) {
                    m20 m20VarC = k8gVar2.C();
                    m20VarC.c = null;
                    m20VarC.b = null;
                    m20VarC.a = arrayList;
                    k8gVarC = m20VarC.c();
                } else {
                    k8gVarC = null;
                }
                bu8VarH.n = k8gVarC;
                bu8VarH.p = 0;
                bu8VarH.q = 0L;
                bu8VarH.s = null;
                bu8VarH.t = null;
                bu8VarH.x = 0L;
                bu8VarH.y = 0L;
                bu8VarH.r = null;
                bu8VarH.G = null;
                return bu8VarH;
            default:
                j10 j10Var = new j10();
                j10Var.c = (q10) this.A0;
                j10Var.a = g20.b;
                l20 l20VarA = j10Var.a();
                m20 m20Var = new m20();
                m20Var.a = Collections.singletonList(l20VarA);
                k8g k8gVarC2 = m20Var.c();
                bu8 bu8Var = new bu8();
                bu8Var.n = k8gVarC2;
                return bu8Var;
        }
    }

    public i8d(h8d h8dVar, byte b) {
        super(h8dVar);
        this.A0 = (q10) h8dVar.m;
    }
}
