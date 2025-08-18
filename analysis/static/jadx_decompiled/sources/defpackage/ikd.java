package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class ikd extends ffe implements a66 {
    public final /* synthetic */ View X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikd(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = viewGroup;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ikd ikdVar = (ikd) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ikdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ikd((ViewGroup) this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        br7.d(this.X, ShareDataPickerScreen.E0, null);
        return e5f.a;
    }
}
