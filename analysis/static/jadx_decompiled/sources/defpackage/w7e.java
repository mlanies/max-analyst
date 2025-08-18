package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w7e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ b8e Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7e(b8e b8eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = b8eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w7e w7eVar = (w7e) n((j7e) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        w7eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        w7e w7eVar = new w7e(this.Y, continuation);
        w7eVar.X = obj;
        return w7eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List list;
        List list2;
        ynd yndVar;
        int i;
        q0e q0eVar;
        od2.a0(obj);
        j7e j7eVar = (j7e) this.X;
        List list3 = j7eVar.a;
        if (list3 != null && (list = j7eVar.b) != null && (list2 = j7eVar.c) != null && (yndVar = j7eVar.d) != null) {
            bc7[] bc7VarArr = b8e.B0;
            b8e b8eVar = this.Y;
            b8eVar.getClass();
            ArrayList arrayList = new ArrayList();
            boolean z = !list3.isEmpty();
            q0e q0eVar2 = b8eVar.w0;
            w3e w3eVar = z ? new w3e(-9223372036854775807L, new eqe(kca.l), null, Integer.valueOf(woc.d2), b8eVar.s(-9223372036854775807L, list3), 1, ((k7e) q0eVar2.getValue()).a == 0, false, 132) : null;
            w3e w3eVar2 = list.isEmpty() ^ true ? new w3e(-9223372036854775806L, new eqe(kca.j), null, Integer.valueOf(woc.K), b8eVar.s(-9223372036854775806L, list), 2, w3eVar == null, false, 132) : null;
            boolean z2 = w3eVar == null && w3eVar2 == null;
            List list4 = yndVar.a;
            w3e w3eVar3 = list4.isEmpty() ^ true ? new w3e(-9223372036854775805L, new eqe(kca.k), null, Integer.valueOf(ica.e), b8eVar.s(-9223372036854775805L, list4), 3, z2, false, 132) : null;
            List listY0 = x53.y0(yndVar.b, 100);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listY0) {
                m3e m3eVar = (m3e) obj2;
                if (list2.isEmpty()) {
                    q0eVar = q0eVar2;
                    arrayList2.add(obj2);
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        q0eVar = q0eVar2;
                        if (m3eVar.a == ((m3e) it.next()).a) {
                            break;
                        }
                        q0eVar2 = q0eVar;
                    }
                    q0eVar = q0eVar2;
                    arrayList2.add(obj2);
                }
                q0eVar2 = q0eVar;
            }
            q0e q0eVar3 = q0eVar2;
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(ob5.a);
            if (w3eVar != null) {
                b8e.q(kl7VarL, w3eVar, arrayList);
            }
            if (w3eVar2 != null) {
                b8e.q(kl7VarL, w3eVar2, arrayList);
            }
            if (w3eVar3 != null) {
                b8e.q(kl7VarL, w3eVar3, arrayList);
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                b8e.q(kl7VarL, b8eVar.r((m3e) it2.next(), 4), arrayList);
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                w3e w3eVarR = b8eVar.r((m3e) it3.next(), 5);
                arrayList.add(new e02(w3eVarR.a, w3eVarR));
                kl7VarL.add(w3eVarR);
            }
            kl7 kl7VarD = j1e.d(kl7VarL);
            hm9.n(b8e.class.getName(), "stickers loaded, sets:" + arrayList.size() + ",content:" + kl7VarD.getSize());
            l7e l7eVar = new l7e(arrayList, kl7VarD);
            q0e q0eVar4 = b8eVar.t0;
            q0eVar4.m(null, l7eVar);
            long andSet = b8eVar.v0.getAndSet(0L);
            if (andSet > 0) {
                Iterator it4 = ((l7e) q0eVar4.getValue()).a.iterator();
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i = 1;
                        i2 = -1;
                        break;
                    }
                    if (((e02) it4.next()).b.a == andSet) {
                        i = 1;
                        break;
                    }
                    i2++;
                }
                int i3 = i2 - i;
                q0eVar3.m(null, new k7e(andSet, 0, i3 < 0 ? 0 : i3, 2));
                b8eVar.t(andSet, null);
            }
        }
        return e5f.a;
    }
}
