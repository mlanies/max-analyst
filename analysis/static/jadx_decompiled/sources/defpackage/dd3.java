package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class dd3 {
    public zw6 a;
    public crd b;
    public vv4 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public dd3(List list, crd crdVar, vv4 vv4Var, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        fm9.e("Audio transmuxing and audio track forcing are not allowed together.", (z2 && z) ? false : true);
        this.a = zw6.j(list);
        this.b = crdVar;
        this.c = vv4Var;
        this.e = z2;
        this.f = z3;
        this.d = z;
        this.g = i;
        this.h = z4;
    }

    public dd3 a() {
        zw6 zw6Var = this.a;
        boolean z = this.f;
        int i = this.g;
        return new dd3(zw6Var, this.b, this.c, this.d, this.e, z, i, this.h && i == 0);
    }

    public dd3 b() {
        dd3 dd3Var = new dd3();
        dd3Var.a = this.a;
        dd3Var.b = this.b;
        dd3Var.c = this.c;
        dd3Var.d = this.d;
        dd3Var.e = this.e;
        dd3Var.f = this.f;
        dd3Var.g = this.g;
        dd3Var.h = this.h;
        return dd3Var;
    }

    public void c(List list) {
        fm9.e("The composition must contain at least one EditedMediaItemSequence.", !list.isEmpty());
        this.a = zw6.j(list);
    }
}
