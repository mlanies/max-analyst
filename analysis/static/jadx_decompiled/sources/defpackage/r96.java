package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r96 extends ffe implements a66 {
    public final /* synthetic */ z96 X;
    public final /* synthetic */ r4d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r96(z96 z96Var, r4d r4dVar, Continuation continuation) {
        super(2, continuation);
        this.X = z96Var;
        this.Y = r4dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((r96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new r96(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        r4d r4dVar;
        int i;
        Uri uriA;
        String path;
        od2.a0(obj);
        z96 z96Var = this.X;
        Iterator it = ((List) z96Var.w0.getValue()).iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            r4dVar = this.Y;
            if (!zHasNext) {
                i2 = -1;
                break;
            }
            if (kp.e(((u86) it.next()).c.b, r4dVar.a.c())) {
                break;
            }
            i2++;
        }
        Integer num = new Integer(i2);
        if (num.intValue() < 0) {
            num = null;
        }
        e5f e5fVar = e5f.a;
        if (num != null) {
            int iIntValue = num.intValue();
            q0e q0eVar = z96Var.w0;
            u86 u86Var = (u86) ((List) q0eVar.getValue()).get(iIntValue);
            awa awaVar = r4dVar.c;
            ref refVar = r4dVar.b;
            ArrayList arrayList = new ArrayList((Collection) q0eVar.getValue());
            awa awaVar2 = r4dVar.c;
            Uri uri = awaVar2 != null ? awaVar2.X : null;
            up7 up7Var = r4dVar.a;
            int i3 = up7Var.X;
            Uri uri2 = u86Var.l;
            if (awa.b(awaVar, up7Var)) {
                uriA = awa.a(awaVar, up7Var);
                if (uriA == null || (path = uriA.getPath()) == null || path.equals(up7Var.c)) {
                    i = 0;
                } else {
                    i = 0;
                    arrayList.set(iIntValue, u86.b(u86Var, awaVar, refVar, uri, 0, false, i, uriA, 455));
                    q0eVar.m(null, arrayList);
                    ArrayList arrayListX = dy7.x(z96Var.F0);
                    s86 s86Var = z96Var.Y;
                    s86Var.getClass();
                    pnf.o(s86Var.c, new m86(arrayListX));
                }
            } else {
                i = i3;
            }
            uriA = uri2;
            arrayList.set(iIntValue, u86.b(u86Var, awaVar, refVar, uri, 0, false, i, uriA, 455));
            q0eVar.m(null, arrayList);
            ArrayList arrayListX2 = dy7.x(z96Var.F0);
            s86 s86Var2 = z96Var.Y;
            s86Var2.getClass();
            pnf.o(s86Var2.c, new m86(arrayListX2));
        }
        return e5fVar;
    }
}
