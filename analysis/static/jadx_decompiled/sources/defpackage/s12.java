package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class s12 extends d8d implements hua {
    public final a20 X;
    public final long Y;
    public final String Z = s12.class.getName();
    public final long b;
    public final String c;
    public final long o;
    public hc3 s0;

    public s12(long j, String str, long j2, a20 a20Var, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = a20Var;
        this.Y = j3;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        s().d(this.b);
        y();
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChangeChatPhoto changeChatPhoto = new Tasks.ChangeChatPhoto();
        changeChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeChatPhoto.file = str;
        changeChatPhoto.chatId = this.o;
        a20 a20Var = this.X;
        if (a20Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20Var.b;
            rect.top = a20Var.c;
            rect.right = a20Var.d;
            rect.bottom = a20Var.e;
            changeChatPhoto.crop = rect;
        }
        changeChatPhoto.lastModified = this.Y;
        return qw8.toByteArray(changeChatPhoto);
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.c1;
    }

    @Override // defpackage.d8d
    public final void w() {
        y();
    }

    @Override // defpackage.d8d
    public final void x() {
        gk8 gk8Var = new gk8();
        gk8Var.c = this.c;
        gk8Var.a = this.Y;
        gk8Var.b = 4;
        d7f d7fVar = new d7f(gk8Var);
        y();
        this.s0 = new hc3();
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        qy9 qy9VarE = ((c7f) e8dVar.u.getValue()).e(d7fVar);
        hle hleVarQ = q();
        hleVarQ.getClass();
        r0a r0aVarN = qy9VarE.n(((jle) hleVarQ).a());
        sd7 sd7Var = new sd7(new rxd(8, this), new o9g(8, this), ft.d);
        r0aVarN.a(sd7Var);
        hc3 hc3Var = this.s0;
        if (hc3Var != null) {
            hc3Var.a(sd7Var);
        }
    }

    public final void y() {
        hc3 hc3Var = this.s0;
        if (hc3Var != null) {
            hc3Var.g();
        }
        this.s0 = null;
    }

    public final void z() {
        p82 p82VarB = b();
        long j = this.o;
        e52 e52VarC = p82VarB.C(j);
        if (e52VarC != null) {
            b().W(j, v82.b);
            ((k4a) a()).j(e52VarC.b.a);
        }
    }
}
