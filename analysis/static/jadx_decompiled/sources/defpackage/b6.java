package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class b6 implements sj3 {
    public final /* synthetic */ ActLocalMedias a;

    public b6(ActLocalMedias actLocalMedias) {
        this.a = actLocalMedias;
    }

    @Override // defpackage.sj3
    public final void accept(Object obj) {
        mqb mqbVar = (mqb) obj;
        zj9 zj9Var = this.a.i1;
        zj9Var.getClass();
        hm9.m("zj9", "onQualitySelected: %s", mqbVar.toString());
        i20 i20VarA = zj9Var.t0.a();
        i20VarA.a = mqbVar;
        zj9Var.t0 = new ref(i20VarA);
        zj9Var.c2();
        zj9Var.d2(new iw1(1, mqbVar));
        zj9Var.d2(new uj9(zj9Var, 3));
        zj9Var.v0.g("VIDEO_UPLOAD_QUALITY_SELECTED", zj9Var.t0.a.name());
    }
}
