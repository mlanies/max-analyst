package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class scd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ add Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scd(add addVar, Continuation continuation) {
        super(2, continuation);
        this.Y = addVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((scd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new scd(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        vfd vfdVar;
        int i = 1;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        e5f e5fVar = e5f.a;
        if (i2 == 0) {
            od2.a0(obj);
            add addVar = this.Y;
            q0e q0eVar = addVar.D0;
            kl7 kl7VarL = j1e.l();
            se5 se5Var = ((p7b) addVar.s()).e;
            se5Var.getClass();
            int i3 = 0;
            boolean zN = se5Var.n(PmsKey.f36esiaenabled, false);
            fc3 fc3Var = addVar.y0;
            if (zN) {
                kl7VarL.add((List) ((je7) fc3Var.c).getValue());
            }
            kl7VarL.add((List) ((je7) fc3Var.o).getValue());
            kl7VarL.add((List) ((je7) fc3Var.X).getValue());
            kl7VarL.add((List) ((je7) fc3Var.Z).getValue());
            kl7VarL.add((List) ((je7) fc3Var.b).getValue());
            kl7VarL.add((List) ((je7) fc3Var.Y).getValue());
            addVar.b.getClass();
            z7d z7dVar = ((p7b) addVar.s()).b;
            Integer num = (Integer) ((ml0) z7dVar.i.getValue()).A();
            int iIntValue = num != null ? num.intValue() : (int) z7dVar.q(PmsKey.f27debugmode, 0);
            v44 v44Var = v44.DISABLED;
            if (iIntValue == 3) {
                kl7VarL.add((List) ((je7) fc3Var.a).getValue());
            }
            kl7 kl7VarD = j1e.d(kl7VarL);
            ArrayList arrayListT = z53.T(kl7VarD);
            ArrayList arrayList = new ArrayList(kl7VarD.getSize());
            Iterator it = arrayListT.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                cfd cfdVar = cfd.a;
                String str = null;
                if (zHasNext) {
                    hcd hcdVar = (hcd) it.next();
                    boolean zB = ((lle) addVar.Z.getValue()).b();
                    boolean z = ((did) addVar.B0.getValue()).g;
                    switch (hcdVar.ordinal()) {
                        case 0:
                            vfdVar = new vfd(hcdVar.a, 3, new eqe(mha.h), null, null, Integer.valueOf(woc.O), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 1:
                            vfdVar = new vfd(hcdVar.a, 3, new eqe(mha.b), null, null, Integer.valueOf(woc.r0), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 2:
                            vfdVar = new vfd(hcdVar.a, 3, new eqe(mha.k), null, null, Integer.valueOf(woc.w1), cfdVar, zB ? zed.a : null, null, 0, null, 1816);
                            break;
                        case 3:
                            vfdVar = new vfd(hcdVar.a, 3, new eqe(mha.l), null, null, Integer.valueOf(woc.h1), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 4:
                            vfdVar = new vfd(hcdVar.a, 3, new eqe(mha.j), null, null, Integer.valueOf(woc.n1), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 5:
                            vfdVar = new vfd(hcdVar.a, 3, new eqe(jpc.t2), null, null, Integer.valueOf(woc.J), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 6:
                            vfdVar = new vfd(hcdVar.a, 4, new eqe(mha.c), null, null, Integer.valueOf(woc.f), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 7:
                            vfdVar = new vfd(hcdVar.a, 4, new eqe(mha.m), null, null, Integer.valueOf(woc.j1), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 8:
                            vfdVar = new vfd(hcdVar.a, 5, new eqe(mha.n), null, null, Integer.valueOf(woc.U), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 9:
                            vfdVar = new vfd(hcdVar.a, 5, new eqe(mha.a), null, null, Integer.valueOf(woc.c1), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 10:
                            vfdVar = new vfd(hcdVar.a, 6, new eqe(mha.d), null, null, Integer.valueOf(woc.F1), cfdVar, null, null, 0, null, 1944);
                            break;
                        case 11:
                            eqe eqeVar = z ? new eqe(mha.e) : new eqe(mha.g);
                            eqe eqeVar2 = z ? null : new eqe(mha.f);
                            vfdVar = new vfd(hcdVar.a, 0, eqeVar, jfd.X, eqeVar2, Integer.valueOf(woc.R), cfdVar, null, null, tu0.G(4 * fk4.d().getDisplayMetrics().density), null, 1408);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            vfdVar = new vfd(hcdVar.a, 2, new eqe(mha.i), jfd.Y, null, Integer.valueOf(yfa.u), null, null, null, 0, null, 2000);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(vfdVar);
                } else {
                    List<icd> list = (List) ((p7b) addVar.s()).e.i.getValue();
                    if (list != null && !list.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i4 = -1;
                            } else if (((vfd) it2.next()).a != hcd.ESIA_CONNECT.a) {
                                i4++;
                            }
                        }
                        if (i4 >= 0) {
                            int i5 = i4 + 1;
                            int iL = y53.L(arrayList);
                            i3 = i5 > iL ? iL : i5;
                        }
                        for (icd icdVar : list) {
                            int iHashCode = icdVar.hashCode();
                            ai9 ai9Var = addVar.J0;
                            int iA = ai9Var.a(iHashCode);
                            Object[] objArr = ai9Var.c;
                            Object obj2 = objArr[iA];
                            ai9Var.b[iA] = iHashCode;
                            objArr[iA] = icdVar;
                            long j = iHashCode;
                            String str2 = icdVar.b;
                            iqe iqeVar = new iqe(str2);
                            jfd jfdVar = jfd.b;
                            tx3 tx3Var2 = tx3Var;
                            Long lValueOf = Long.valueOf(icdVar.c);
                            Character chU0 = w9e.u0(str2);
                            arrayList.add(i3, new vfd(j, 1, iqeVar, jfdVar, null, null, cfdVar, null, null, 0, new wed(oag.a(chU0 != null ? chU0.toString() : str, lValueOf), icdVar.a), 944));
                            i = 1;
                            i3++;
                            str = str;
                            tx3Var = tx3Var2;
                        }
                    }
                    tx3 tx3Var3 = tx3Var;
                    this.X = i;
                    q0eVar.m(str, arrayList);
                    if (e5fVar == tx3Var3) {
                        return tx3Var3;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
