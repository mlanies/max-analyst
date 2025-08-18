package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sid extends ffe implements a66 {
    public final /* synthetic */ vid X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sid(vid vidVar, Continuation continuation) {
        super(2, continuation);
        this.X = vidVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sid sidVar = (sid) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sidVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sid(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List<v6f> listEmptyList;
        List listEmptyList2;
        q0e q0eVar;
        Object value;
        od2.a0(obj);
        vid vidVar = this.X;
        ng5 ng5Var = (ng5) vidVar.X.getValue();
        ng5Var.getClass();
        y8f y8fVar = ng5Var.e;
        py8 py8Var = ng5Var.f;
        x8f x8fVar = new x8f();
        HashSet hashSet = new HashSet();
        x8fVar.a = hashSet;
        try {
            q8f q8fVar = q8f.UNKNOWN;
            listEmptyList = (List) y8fVar.f().c(Collections.emptyList());
        } catch (Throwable th) {
            hm9.p("x8f", "getUploadsFromRepository: failed", th);
            listEmptyList = Collections.emptyList();
        }
        for (v6f v6fVar : listEmptyList) {
            x8f.a(hashSet, v6fVar.a.a);
            x8f.a(hashSet, v6fVar.b);
        }
        HashSet hashSet2 = x8fVar.a;
        try {
            listEmptyList2 = (List) py8Var.a().c(Collections.emptyList());
        } catch (Throwable th2) {
            hm9.p("x8f", "getMessageUploads: failed", th2);
            listEmptyList2 = Collections.emptyList();
        }
        Iterator it = listEmptyList2.iterator();
        while (it.hasNext()) {
            x8f.a(hashSet2, ((iy8) it.next()).b);
        }
        x8fVar.a.addAll((List) new e0a(new e0a(new ty9(qy9.j(ng5Var.c.E(p82.I)), new n2f(9), 1), new n2f(10), 2), new n2f(11), 3).v().e());
        HashSet hashSet3 = x8fVar.a;
        oz7 oz7Var = iu8.b;
        Iterator it2 = ng5Var.d.s().iterator();
        while (it2.hasNext()) {
            cu8 cu8Var = (cu8) it2.next();
            if (cu8Var.n()) {
                for (int i = 0; i < cu8Var.b(); i++) {
                    k8g k8gVar = cu8Var.z0;
                    x8f.a(hashSet3, ((l20) (k8gVar != null ? (List) k8gVar.a : null).get(i)).s);
                }
            }
        }
        HashSet hashSet4 = x8fVar.a;
        Iterator it3 = Collections.unmodifiableSet(ng5Var.g.i.keySet()).iterator();
        while (it3.hasNext()) {
            x8f.a(hashSet4, ((lef) it3.next()).a);
        }
        ng5Var.j.getClass();
        nw4 nw4VarA = ng5Var.a(new va8(x8fVar));
        ArrayList arrayList = new ArrayList();
        v25 v25Var = vw0.w0;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        long j = 0;
        while (u1Var.hasNext()) {
            vw0 vw0Var = (vw0) u1Var.next();
            long jL = nw4VarA.l(s5c.d0(vw0Var));
            if (jL != 0) {
                arrayList.add(new uw0(vw0Var, jL));
                j += jL;
            }
        }
        if (arrayList.size() > 1) {
            c63.U(arrayList, new ky6(13));
        }
        do {
            q0eVar = vidVar.Z;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, new fx0(j, arrayList)));
        return e5f.a;
    }
}
