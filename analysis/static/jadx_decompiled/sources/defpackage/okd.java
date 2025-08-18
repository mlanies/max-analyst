package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class okd extends ffe implements a66 {
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((okd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new okd(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wha whaVar = (wha) fi4.a.getAccessor().c(wha.class);
        whaVar.h("Скачивание логов началось");
        whaVar.b("Для успешного скачивания логов не покидайте экран");
        return whaVar.i();
    }
}
