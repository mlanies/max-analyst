package defpackage;

import org.json.HTTP;

/* loaded from: classes.dex */
public final class vo6 implements ksd {
    public final t06 a;
    public boolean b;
    public final /* synthetic */ x8 c;

    public vo6(x8 x8Var) {
        this.c = x8Var;
        this.a = new t06(((eu0) x8Var.Y).p());
    }

    @Override // defpackage.ksd
    public final void N(bt0 bt0Var, long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return;
        }
        x8 x8Var = this.c;
        ((eu0) x8Var.Y).P(j);
        eu0 eu0Var = (eu0) x8Var.Y;
        eu0Var.L(HTTP.CRLF);
        eu0Var.N(bt0Var, j);
        eu0Var.L(HTTP.CRLF);
    }

    @Override // defpackage.ksd, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((eu0) this.c.Y).L("0\r\n\r\n");
        x8 x8Var = this.c;
        t06 t06Var = this.a;
        x8Var.getClass();
        oue oueVar = t06Var.e;
        t06Var.e = oue.d;
        oueVar.a();
        oueVar.b();
        this.c.a = 3;
    }

    @Override // defpackage.ksd, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((eu0) this.c.Y).flush();
    }

    @Override // defpackage.ksd
    public final oue p() {
        return this.a;
    }
}
