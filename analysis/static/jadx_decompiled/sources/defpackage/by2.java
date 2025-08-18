package defpackage;

/* loaded from: classes.dex */
public final class by2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm9 b;

    public /* synthetic */ by2(wm9 wm9Var, int i) {
        this.a = i;
        this.b = wm9Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                tr3 tr3Var = tr3.c;
                fyd fydVar = (fyd) this.b;
                tr3Var.Z1(fydVar.b, fydVar.c);
                break;
            case 1:
                ckb ckbVar = ckb.c;
                mkb mkbVar = (mkb) this.b;
                long j = mkbVar.b;
                ckbVar.P1().b(":call-user?opponent_id=" + j + "&video_enabled=" + mkbVar.d, null);
                break;
            case 2:
                ckb.c.P1().b(":call-join-link?link=".concat(((mkb) this.b).e), null);
                break;
            default:
                ckb ckbVar2 = ckb.c;
                mkb mkbVar2 = (mkb) this.b;
                long j2 = mkbVar2.b;
                ckbVar2.P1().b(":call-chat?chat_id=" + j2 + "&video_enabled=" + mkbVar2.d, null);
                break;
        }
        return e5f.a;
    }
}
