package defpackage;

/* loaded from: classes2.dex */
public final class ub extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(ba baVar) {
        lk3 lk3Var = (lk3) this.a;
        lk3Var.setId(Long.hashCode(baVar.Z));
        lk3Var.setName(baVar.b);
        jqe jqeVar = baVar.c;
        lk3Var.setMessage(jqeVar != null ? jqeVar.b(lk3Var.getContext()) : null);
        lk3Var.N();
        lk3Var.setOnClickListener(null);
        lk3Var.setVerified(baVar.Y);
        lk3Var.O(baVar.a, baVar.X, baVar.o);
        lk3Var.setSelectionEnabled(false);
    }
}
