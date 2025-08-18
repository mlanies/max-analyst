package defpackage;

import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class cp8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MembersListWidget b;

    public /* synthetic */ cp8(MembersListWidget membersListWidget, int i) {
        this.a = i;
        this.b = membersListWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        MembersListWidget membersListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MembersListWidget.D0;
                return a14.m(membersListWidget.n0().getContext());
            case 1:
                bc7[] bc7VarArr2 = MembersListWidget.D0;
                k56 k56Var = membersListWidget.o0().o;
                return new bp8(membersListWidget.b, membersListWidget.c, new khe(new cp8(membersListWidget, 2)), membersListWidget.o, new cp8(membersListWidget, 3), k56Var);
            case 2:
                bc7[] bc7VarArr3 = MembersListWidget.D0;
                ko8 ko8Var = ko8.a;
                khe kheVarD = ko8Var.getAccessor().d(kke.class);
                khe kheVarD2 = ko8Var.getAccessor().d(ds3.class);
                khe kheVarD3 = ko8Var.getAccessor().d(iy2.class);
                khe kheVarD4 = ko8Var.getAccessor().d(mc6.class);
                khe kheVarD5 = ko8Var.getAccessor().d(b0d.class);
                khe kheVarD6 = ko8Var.getAccessor().d(q33.class);
                khe kheVarD7 = ko8Var.getAccessor().d(xb9.class);
                jz2 jz2Var = (jz2) ((iy2) kheVarD3.getValue());
                long j = membersListWidget.b;
                e52 e52Var = (e52) jz2Var.m(j).a.getValue();
                if (e52Var == null) {
                    hm9.p(np8.class.getName(), ey8.i(j, "We're trying to create members loader for chat(#", ") without the chat in cache"), null);
                    return new kp8();
                }
                int iC = e52Var.b.c();
                ek2 ek2Var = membersListWidget.c;
                return (iC > 99 || e52Var.I()) ? new yl0(j, ek2Var, (kke) kheVarD.getValue(), kheVarD3, kheVarD2, kheVarD4, kheVarD7) : new ltd(j, ek2Var, (q33) kheVarD6.getValue(), kheVarD3, kheVarD2, kheVarD5, (kke) kheVarD.getValue(), kheVarD7);
            default:
                bc7[] bc7VarArr4 = MembersListWidget.D0;
                return membersListWidget.o0().c;
        }
    }
}
