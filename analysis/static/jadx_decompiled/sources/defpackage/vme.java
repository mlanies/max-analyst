package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vme extends ffe implements a66 {
    public final /* synthetic */ wme X;
    public final /* synthetic */ View Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vme(wme wmeVar, View view, Continuation continuation) {
        super(2, continuation);
        this.X = wmeVar;
        this.Y = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vme vmeVar = (vme) n((sme) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vmeVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vme(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sme smeVarR;
        od2.a0(obj);
        View view = this.Y;
        if (view.isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = view.getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        this.X.z(smeVarR);
        return e5f.a;
    }
}
