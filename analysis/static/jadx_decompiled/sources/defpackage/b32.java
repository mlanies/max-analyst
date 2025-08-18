package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class b32 extends d8d implements hua {
    public final a20 X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final long o;
    public sd7 s0;

    public b32(long j, String str, long j2, a20 a20Var, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = a20Var;
        this.Y = j3;
        this.Z = b32.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChangeProfileOrChatPhoto changeProfileOrChatPhoto = new Tasks.ChangeProfileOrChatPhoto();
        changeProfileOrChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeProfileOrChatPhoto.file = str;
        changeProfileOrChatPhoto.chatId = this.o;
        a20 a20Var = this.X;
        if (a20Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20Var.b;
            rect.top = a20Var.c;
            rect.right = a20Var.d;
            rect.bottom = a20Var.e;
            changeProfileOrChatPhoto.crop = rect;
        }
        changeProfileOrChatPhoto.lastModified = this.Y;
        return qw8.toByteArray(changeProfileOrChatPhoto);
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.P0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1;
    }

    @Override // defpackage.d8d
    public final void w() {
        sd7 sd7Var = this.s0;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
        this.s0 = null;
    }

    @Override // defpackage.d8d
    public final void x() {
        gk8 gk8Var = new gk8();
        gk8Var.c = this.c;
        gk8Var.a = this.Y;
        gk8Var.b = 4;
        d7f d7fVar = new d7f(gk8Var);
        sd7 sd7Var = this.s0;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        qy9 qy9VarE = ((c7f) e8dVar.u.getValue()).e(d7fVar);
        hle hleVarQ = q();
        hleVarQ.getClass();
        r0a r0aVarN = qy9VarE.n(((jle) hleVarQ).a());
        sd7 sd7Var2 = new sd7(new wmc(this, false), new ey1(8, this), ft.d);
        r0aVarN.a(sd7Var2);
        this.s0 = sd7Var2;
    }

    public /* synthetic */ b32(long j, String str, long j2, a20 a20Var) {
        this(j, str, j2, a20Var, pag.u(str));
    }
}
