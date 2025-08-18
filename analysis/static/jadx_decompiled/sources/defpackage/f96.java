package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f96 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ z96 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f96(z96 z96Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = set;
        this.Z = z96Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f96 f96Var = new f96(this.Z, this.Y, continuation);
        f96Var.X = obj;
        return f96Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        ArrayList arrayList = new ArrayList(this.Y);
        z96 z96Var = this.Z;
        Iterable iterable = (Iterable) z96Var.w0.getValue();
        ArrayList arrayList2 = new ArrayList(z53.S(iterable, 10));
        Iterator it = iterable.iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            e5f e5fVar = e5f.a;
            if (!zHasNext) {
                if (j1e.z(sx3Var) && z) {
                    z96Var.w0.m(null, arrayList2);
                }
                return e5fVar;
            }
            u86 u86VarB = (u86) it.next();
            if (!j1e.z(sx3Var)) {
                return e5fVar;
            }
            if (!arrayList.isEmpty()) {
                Uri uri = u86VarB.c.b;
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    Uri uriC = ((r4d) it2.next()).a.c();
                    if (kp.e(uri, uriC) || String.valueOf(uriC).length() > 0) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    arrayList.remove(i);
                    int iT = z96Var.t(u86VarB.c);
                    if (u86VarB.h != iT) {
                        u86VarB = u86.b(u86VarB, null, null, null, iT, false, 0, null, 1983);
                        z = true;
                    }
                }
            }
            arrayList2.add(u86VarB);
        }
    }
}
