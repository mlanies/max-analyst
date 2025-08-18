package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ugb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugb(vgb vgbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vgbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ugb ugbVar = (ugb) n((xeb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ugbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ugb ugbVar = new ugb(this.Y, continuation);
        ugbVar.X = obj;
        return ugbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        xeb xebVar = (xeb) this.X;
        boolean z = xebVar instanceof web;
        vgb vgbVar = this.Y;
        if (z) {
            web webVar = (web) xebVar;
            Long l = webVar.a;
            gv4 gv4Var = vgbVar.b;
            long j = gv4Var.m.get();
            jqe jqeVar = webVar.b;
            s35 s35Var = vgbVar.w0;
            if (l != null && l.longValue() == j) {
                j47.T(vgbVar.a, ((w9a) vgbVar.q()).b(), null, new pgb(vgbVar, null), 2);
                pnf.o(s35Var, new sfb(jqeVar, Integer.valueOf(woc.I)));
            } else {
                long j2 = gv4Var.l.get();
                if ((l != null && l.longValue() == j2) || l == null) {
                    pnf.o(s35Var, new sfb(jqeVar, Integer.valueOf(woc.I)));
                }
            }
        } else if (xebVar instanceof teb) {
            Long l2 = new Long(((teb) xebVar).a);
            if (l2.longValue() == vgbVar.b.m.get()) {
                pnf.o(vgbVar.w0, new sfb(new eqe(vea.q), Integer.valueOf(woc.m)));
            }
        } else if (xebVar instanceof veb) {
            pnf.o(vgbVar.w0, new sfb(new eqe(vea.q), new Integer(woc.m)));
        }
        return e5f.a;
    }
}
