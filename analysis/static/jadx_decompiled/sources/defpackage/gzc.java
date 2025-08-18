package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gzc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hzc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzc(hzc hzcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hzcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gzc gzcVar = (gzc) n((gk6) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gzcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gzc gzcVar = new gzc(this.Y, continuation);
        gzcVar.X = obj;
        return gzcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long j = ((gk6) this.X).b;
        hzc hzcVar = this.Y;
        hzcVar.getClass();
        jzc jzcVar = jzc.c;
        boolean z = hzcVar.c == o92.c;
        jzcVar.getClass();
        String str = z ? "local" : "server";
        StringBuilder sb = new StringBuilder(":chats?id=");
        ms2.j(hzcVar.b, "&type=", str, sb);
        sb.append("&message_id=");
        sb.append(j);
        pnf.o(hzcVar.s0, new c64(sb.toString()));
        return e5f.a;
    }
}
