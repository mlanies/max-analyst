package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ut0 extends p66 implements c66 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Collection collectionD;
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                OnUndeliveredElementKt.callUndeliveredElement(((zt0) this.receiver).b, obj2, (lx3) obj3);
                break;
            case 1:
                Object obj4 = ((i42) obj2).a;
                lx3 lx3Var = (lx3) obj3;
                m56 m56Var = ((zt0) this.receiver).b;
                if (obj4 instanceof h42) {
                    obj4 = null;
                }
                OnUndeliveredElementKt.callUndeliveredElement(m56Var, obj4, lx3Var);
                break;
            default:
                w9f w9fVar = (w9f) obj2;
                ((Number) obj3).intValue();
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.receiver;
                bc7[] bc7VarArr = FoldersListScreen.Z;
                foldersListScreen.m0().t0 = w9fVar;
                qt3 qt3VarY = dy7.c(1).Y((View) obj);
                foldersListScreen.m0().getClass();
                at5 at5Var = w9fVar.a;
                if (at5Var == null) {
                    collectionD = nz4.a;
                } else {
                    kl7 kl7VarL = j1e.l();
                    kl7VarL.add(new tt3(oba.j, new eqe(qba.n), Integer.valueOf(yfa.f), (Integer) null, 20));
                    if (!at5Var.C0.contains(cv5.c)) {
                        int i = oba.k;
                        eqe eqeVar = new eqe(qba.o);
                        int i2 = woc.w;
                        kl7VarL.add(new tt3(i, eqeVar, Integer.valueOf(wfa.U), Integer.valueOf(i2), Integer.valueOf(wfa.P)));
                    }
                    collectionD = j1e.d(kl7VarL);
                }
                qt3VarY.I(collectionD).s().build().q(foldersListScreen);
                break;
        }
        return e5fVar;
    }
}
