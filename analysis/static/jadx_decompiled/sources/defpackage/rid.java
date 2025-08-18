package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rid extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vw0 Y;
    public final /* synthetic */ vid Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rid(vw0 vw0Var, vid vidVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vw0Var;
        this.Z = vidVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rid) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rid(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List<v6f> listEmptyList;
        List listEmptyList2;
        Long l;
        List list;
        Object next;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            vw0 vw0Var = vw0.t0;
            vw0 vw0Var2 = this.Y;
            vid vidVar = this.Z;
            if (vw0Var2 == vw0Var || vw0Var2 == vw0.u0) {
                ((uh9) ((ch9) vidVar.Y.getValue())).t();
            }
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
            while (true) {
                l = null;
                if (!it2.hasNext()) {
                    break;
                }
                cu8 cu8Var = (cu8) it2.next();
                if (cu8Var.n()) {
                    for (int i2 = 0; i2 < cu8Var.b(); i2++) {
                        k8g k8gVar = cu8Var.z0;
                        x8f.a(hashSet3, ((l20) (k8gVar != null ? (List) k8gVar.a : null).get(i2)).s);
                    }
                }
            }
            HashSet hashSet4 = x8fVar.a;
            Iterator it3 = Collections.unmodifiableSet(ng5Var.g.i.keySet()).iterator();
            while (it3.hasNext()) {
                x8f.a(hashSet4, ((lef) it3.next()).a);
            }
            ng5Var.j.getClass();
            ng5Var.a(new va8(x8fVar)).h(Collections.singletonList(s5c.d0(vw0Var2)));
            fx0 fx0Var = (fx0) vidVar.Z.getValue();
            if (fx0Var != null && (list = fx0Var.b) != null) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    if (((uw0) next).a == vw0Var2) {
                        break;
                    }
                }
                uw0 uw0Var = (uw0) next;
                if (uw0Var != null) {
                    l = new Long(uw0Var.b);
                }
            }
            if (l != null) {
                vid.q(vidVar, l.longValue());
            }
            this.X = 1;
            if (vid.r(vidVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
