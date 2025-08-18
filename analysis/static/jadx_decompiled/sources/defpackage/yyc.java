package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* loaded from: classes.dex */
public final class yyc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SearchMessageBottomWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyc(SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = searchMessageBottomWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yyc yycVar = (yyc) n((c64) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yycVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yyc yycVar = new yyc(this.Y, continuation);
        yycVar.X = obj;
        return yycVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jzc.c.R1((c64) this.X);
        return e5f.a;
    }
}
