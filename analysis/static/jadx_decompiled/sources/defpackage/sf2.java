package defpackage;

import android.view.View;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* loaded from: classes2.dex */
public final class sf2 extends ffe implements a66 {
    public final /* synthetic */ ChatMediaListWidget X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf2(ChatMediaListWidget chatMediaListWidget, xm8 xm8Var, View view, Continuation continuation) {
        super(2, continuation);
        this.X = chatMediaListWidget;
        this.Y = xm8Var;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sf2 sf2Var = (sf2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sf2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sf2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Collection collectionD;
        int i;
        od2.a0(obj);
        ChatMediaListWidget chatMediaListWidget = this.X;
        xm8 xm8Var = this.Y;
        chatMediaListWidget.a = xm8Var;
        qt3 qt3VarY = dy7.c(1).r().Y(this.Z);
        gi2 gi2VarN0 = chatMediaListWidget.n0();
        gi2VarN0.getClass();
        boolean z = xm8Var instanceof um8;
        khe kheVar = gi2VarN0.G0;
        if (z) {
            fe2 fe2Var = (fe2) kheVar.getValue();
            fe2Var.getClass();
            kl7 kl7VarL = j1e.l();
            kl7VarL.add((tt3) fe2Var.b.getValue());
            kl7VarL.add(fe2.a(yea.x1));
            kl7VarL.add((tt3) fe2Var.a.getValue());
            collectionD = j1e.d(kl7VarL);
        } else if (xm8Var instanceof vm8) {
            fe2 fe2Var2 = (fe2) kheVar.getValue();
            fe2Var2.getClass();
            kl7 kl7VarL2 = j1e.l();
            kl7VarL2.add(new tt3(wea.V, new eqe(yea.u1), Integer.valueOf(yfa.d), (Integer) null, 20));
            kl7VarL2.add(new tt3(wea.c0, new eqe(yea.F1), Integer.valueOf(yfa.y), (Integer) null, 20));
            kl7VarL2.add((tt3) fe2Var2.b.getValue());
            kl7VarL2.add(fe2.a(yea.z1));
            kl7VarL2.add((tt3) fe2Var2.a.getValue());
            collectionD = j1e.d(kl7VarL2);
        } else {
            boolean z2 = xm8Var instanceof wm8;
            if (z2) {
                fe2 fe2Var3 = (fe2) kheVar.getValue();
                fe2Var3.getClass();
                if (z2) {
                    wm8 wm8Var = (wm8) xm8Var;
                    int iS = au1.s(wm8Var.X);
                    if (iS == 0) {
                        i = yea.A1;
                    } else if (iS == 1) {
                        i = yea.B1;
                    } else {
                        if (iS != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = yea.y1;
                    }
                    kl7 kl7VarL3 = j1e.l();
                    kl7VarL3.add(new tt3(wea.b0, new eqe(yea.E1), Integer.valueOf(yfa.e), (Integer) null, 20));
                    kl7VarL3.add((tt3) fe2Var3.b.getValue());
                    kl7VarL3.add(fe2.a(i));
                    if (!wm8Var.s0) {
                        kl7VarL3.add((tt3) fe2Var3.a.getValue());
                    }
                    collectionD = j1e.d(kl7VarL3);
                } else {
                    collectionD = nz4.a;
                }
            } else {
                if (!(xm8Var instanceof qm8)) {
                    throw new NoWhenBranchMatchedException();
                }
                fe2 fe2Var4 = (fe2) kheVar.getValue();
                fe2Var4.getClass();
                kl7 kl7VarL4 = j1e.l();
                kl7VarL4.add((tt3) fe2Var4.b.getValue());
                kl7VarL4.add(fe2.a(yea.w1));
                kl7VarL4.add((tt3) fe2Var4.a.getValue());
                collectionD = j1e.d(kl7VarL4);
            }
        }
        qt3VarY.I(collectionD).build().q(chatMediaListWidget);
        return e5f.a;
    }
}
