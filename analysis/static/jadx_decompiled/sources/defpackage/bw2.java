package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.search.DuplicateDetectException;

/* loaded from: classes.dex */
public final class bw2 extends ffe implements a66 {
    public nv2 X;
    public long Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ gw2 t0;
    public final /* synthetic */ String u0;
    public final /* synthetic */ List v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw2(gw2 gw2Var, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.t0 = gw2Var;
        this.u0 = str;
        this.v0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bw2 bw2Var = new bw2(this.t0, this.u0, this.v0, continuation);
        bw2Var.s0 = obj;
        return bw2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        long jNanoTime;
        Object objC;
        nv2 nv2Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.s0;
            if (!tpa.f(((ov2) this.t0.E0.getValue()).b, this.u0)) {
                return e5fVar;
            }
            nv2 nv2Var2 = this.v0.isEmpty() ^ true ? nv2.o : nv2.X;
            jNanoTime = System.nanoTime();
            hm9.G(this.t0.J0, "chats search: start UI mapping", null);
            List list = this.v0;
            gw2 gw2Var = this.t0;
            ContextScope contextScopeA = j1e.a(this.b);
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j47.h(contextScopeA, null, new aw2(it.next(), null, gw2Var), 3));
            }
            this.s0 = sx3Var;
            this.X = nv2Var2;
            this.Y = jNanoTime;
            this.Z = 1;
            objC = pag.c(arrayList, this);
            if (objC == tx3Var) {
                return tx3Var;
            }
            nv2Var = nv2Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.Y;
            nv2 nv2Var3 = this.X;
            sx3Var = (sx3) this.s0;
            od2.a0(obj);
            jNanoTime = j;
            nv2Var = nv2Var3;
            objC = obj;
        }
        List<izc> list2 = (List) objC;
        String str = this.t0.J0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.Y;
            int i2 = ft4.o;
            ir6Var.d(us7Var, str, "chats search: UI mapping finish: ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
        }
        if (!tpa.f(((ov2) this.t0.E0.getValue()).b, this.u0)) {
            return e5fVar;
        }
        hm9.G(this.t0.J0, "chats search: update_search_state", null);
        ArrayList arrayList2 = new ArrayList(list2.size());
        gi9 gi9Var = new gi9((Object) null);
        gi9 gi9Var2 = new gi9((Object) null);
        gi9 gi9Var3 = new gi9((Object) null);
        for (izc izcVar : list2) {
            if (!j1e.z(sx3Var)) {
                break;
            }
            if (izcVar instanceof vq2) {
                vq2 vq2Var = (vq2) izcVar;
                if (!gi9Var.d(vq2Var.c)) {
                    gi9Var.a(vq2Var.c);
                    arrayList2.add(izcVar);
                }
            }
            if (izcVar instanceof jq3) {
                jq3 jq3Var = (jq3) izcVar;
                if (!gi9Var2.d(jq3Var.c)) {
                    gi9Var2.a(jq3Var.c);
                    arrayList2.add(izcVar);
                }
            }
            if (izcVar instanceof mx8) {
                mx8 mx8Var = (mx8) izcVar;
                if (!gi9Var3.d(mx8Var.X.a)) {
                    gi9Var3.a(mx8Var.X.a);
                    arrayList2.add(izcVar);
                }
            }
            arrayList2.add(izcVar);
        }
        if (j1e.z(sx3Var) && tpa.f(((ov2) this.t0.E0.getValue()).b, this.u0)) {
            if (arrayList2.size() != list2.size()) {
                DuplicateDetectException duplicateDetectException = new DuplicateDetectException(zr6.h(list2.size() - arrayList2.size(), "diff="));
                ((ty3) this.t0.D0.getValue()).a("ONEME-15837", duplicateDetectException);
                String str2 = this.t0.J0;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.Z, str2, wg0.i("found duplicates for ONEME-15837! ", duplicateDetectException.getMessage()), null);
                }
            }
            q0e q0eVar = this.t0.E0;
            q0eVar.m(null, ov2.a((ov2) q0eVar.getValue(), nv2Var, it6.d, arrayList2, ((ov2) this.t0.E0.getValue()).a != nv2.b, 2));
        }
        return e5fVar;
    }
}
