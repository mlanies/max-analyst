package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qhd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cid Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhd(cid cidVar, Continuation continuation) {
        super(2, continuation);
        this.Z = cidVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qhd) n((wdd) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qhd qhdVar = new qhd(this.Z, continuation);
        qhdVar.Y = obj;
        return qhdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            wdd wddVar = (wdd) this.Y;
            boolean z = wddVar instanceof vdd;
            Object obj2 = null;
            cid cidVar = this.Z;
            if (z) {
                vdd vddVar = (vdd) wddVar;
                long j = vddVar.a.a;
                Long l = cidVar.G0;
                if (l != null && j == l.longValue()) {
                    cidVar.G0 = null;
                    List list = vddVar.a.b;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((w9d) next).X) {
                            obj2 = next;
                            break;
                        }
                    }
                    cidVar.I0 = (w9d) obj2;
                    ArrayList arrayList = cidVar.J0;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (!((w9d) obj3).X) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList.addAll(x53.x0(arrayList2, new ii4(new ai0(27), 2)));
                    this.X = 1;
                    if (cid.q(cidVar, this) == tx3Var) {
                        return tx3Var;
                    }
                }
            } else {
                if (wddVar instanceof sdd) {
                    ((sdd) wddVar).getClass();
                    throw null;
                }
                if (wddVar instanceof udd) {
                    long j2 = ((udd) wddVar).a.a;
                    Long l2 = cidVar.H0;
                    if (l2 != null && j2 == l2.longValue()) {
                        cidVar.J0.clear();
                        this.X = 2;
                        if (cid.q(cidVar, this) == tx3Var) {
                            return tx3Var;
                        }
                    }
                } else {
                    if (!(wddVar instanceof tdd)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long j3 = ((tdd) wddVar).a;
                    Long l3 = cidVar.H0;
                    if (l3 != null && j3 == l3.longValue()) {
                        cidVar.H0 = null;
                        cidVar.w(new bed(new eqe(kha.B)));
                    } else {
                        Long l4 = cidVar.G0;
                        if (l4 != null && j3 == l4.longValue()) {
                            cidVar.G0 = null;
                        }
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
