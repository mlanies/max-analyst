package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zr3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ as3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr3(as3 as3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = as3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zr3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zr3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List list;
        nn3 nn3Var;
        Object next;
        nn3 nn3Var2;
        Object obj2;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        int i2 = 1;
        if (i == 0) {
            od2.a0(obj);
            as3 as3Var = this.Y;
            List listD0 = x53.D0((Set) ((AtomicReference) as3Var.a.Y).get());
            dn3 dn3Var = (dn3) ((qn3) as3Var.b.getValue()).a().getValue();
            if (dn3Var.b()) {
                return e5fVar;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = listD0.size();
            int i3 = 0;
            while (i3 < size) {
                gza gzaVar = (gza) listD0.get(i3);
                int i4 = yr3.$EnumSwitchMapping$0[gzaVar.b.ordinal()];
                long j = gzaVar.a;
                if (i4 == i2) {
                    list = listD0;
                    List list2 = dn3Var.c;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((nn3) next).a == j) {
                                break;
                            }
                        }
                        nn3Var = (nn3) next;
                    } else {
                        nn3Var = null;
                    }
                    if (nn3Var != null) {
                        String string = nn3Var.b.toString();
                        Uri uri = nn3Var.Z;
                        arrayList2.add(new uua(nn3Var.a, string, uri != null ? uri.toString() : null));
                    }
                } else if (i4 != 2) {
                    list = listD0;
                } else {
                    List list3 = dn3Var.a;
                    if (list3 != null) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                list = listD0;
                                obj2 = null;
                                break;
                            }
                            Object next2 = it2.next();
                            list = listD0;
                            if (((nn3) next2).a == j) {
                                obj2 = next2;
                                break;
                            }
                            listD0 = list;
                        }
                        nn3Var2 = (nn3) obj2;
                    } else {
                        list = listD0;
                        nn3Var2 = null;
                    }
                    if (nn3Var2 != null) {
                        arrayList.add(Long.valueOf(nn3Var2.a));
                    }
                }
                i3++;
                listD0 = list;
                i2 = 1;
            }
            qp3 qp3Var = new qp3(arrayList, arrayList2);
            kld kldVar = as3Var.f;
            ur3 ur3Var = new ur3(qp3Var);
            this.X = 1;
            if (kldVar.a(ur3Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
