package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class f74 implements jm7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ilf b;

    public /* synthetic */ f74(ed edVar, ilf ilfVar) {
        this.b = ilfVar;
    }

    @Override // defpackage.jm7, defpackage.km7
    public final void invoke(Object obj) {
        ilf ilfVar = this.b;
        switch (this.a) {
            case 0:
                u65 u65Var = (u65) obj;
                u65Var.getClass();
                hm9.m("u65", "videoDebugListener.onVideoSizeChanged: %s", ilfVar);
                int i = ilfVar.c;
                int i2 = ilfVar.b;
                int i3 = ilfVar.a;
                if (i == 90 || i == 270) {
                    u65Var.u0 = i2;
                    u65Var.v0 = i3;
                } else {
                    u65Var.u0 = i3;
                    u65Var.v0 = i2;
                }
                u65Var.w0 = i;
                if (u65Var.Z != null) {
                    if (u65Var.s0 - (1.0f / (i3 / i2)) == 0.0f || Math.abs(r7) <= 1.0E-4d) {
                        u65Var.u0 = i2;
                        u65Var.v0 = i3;
                    }
                }
                bq7 bq7Var = u65Var.Y;
                if (bq7Var != null) {
                    int i4 = u65Var.u0;
                    int i5 = u65Var.v0;
                    int i6 = u65Var.w0;
                    ve8 ve8Var = bq7Var.e;
                    if (ve8Var != null) {
                        ve8Var.P(i4, i5, i6);
                        break;
                    }
                }
                break;
            default:
                ((m3b) obj).z(ilfVar);
                break;
        }
    }

    public /* synthetic */ f74(ilf ilfVar) {
        this.b = ilfVar;
    }
}
