package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ajc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ glc Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajc(glc glcVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = glcVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ajc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ajc ajcVar = new ajc(this.Y, this.Z, continuation);
        ajcVar.X = obj;
        return ajcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        String name = sx3Var.getClass().getName();
        long j = this.Z;
        ir6 ir6Var = hm9.m;
        CharSequence charSequenceE = null;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, ey8.h(j, "start restore draft for chatId:"), null);
        }
        e52 e52Var = (e52) ((jz2) ((iy2) ((je7) this.Y.b).getValue())).m(this.Z).a.getValue();
        if (e52Var == null) {
            hm9.n(sx3Var.getClass().getName(), "can't restore draft because chat is null");
            return null;
        }
        uaa uaaVar = e52Var.b.f0;
        if (!(uaaVar instanceof uaa)) {
            uaaVar = null;
        }
        if (uaaVar == null) {
            hm9.n(sx3Var.getClass().getName(), "Draft empty in chat don't need restore");
            return null;
        }
        glc glcVar = this.Y;
        xd7 xd7Var = uaaVar.b;
        glcVar.getClass();
        if (!fm9.G(xd7Var)) {
            charSequenceE = ((ida) ((je7) glcVar.c).getValue()).j.e(((ida) ((je7) glcVar.c).getValue()).l(xd7Var.a, xd7Var.b));
        }
        return new zic(charSequenceE, uaaVar.d, uaaVar.c);
    }
}
