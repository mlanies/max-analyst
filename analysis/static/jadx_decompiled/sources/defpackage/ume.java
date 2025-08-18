package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ume extends ffe implements a66 {
    public final /* synthetic */ View X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ume(View view, Continuation continuation) {
        super(2, continuation);
        this.X = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ume umeVar = (ume) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        umeVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ume(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        View view = this.X;
        if (view.isInEditMode()) {
            ee4 ee4Var = ee4.e0;
        } else {
            Context context = view.getContext();
            khe kheVar = sme.a0;
            fm9.R(context);
        }
        return e5f.a;
    }
}
