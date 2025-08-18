package defpackage;

/* loaded from: classes.dex */
public final class pm2 {
    public final e52 a;
    public final es8 b;
    public final es8 c;
    public final zof d;
    public final k29 e;
    public final nr2 f;

    public pm2(e52 e52Var, es8 es8Var, es8 es8Var2, zof zofVar, k29 k29Var, nr2 nr2Var) {
        this.a = e52Var;
        this.b = es8Var;
        this.c = es8Var2;
        this.d = zofVar;
        this.e = k29Var;
        this.f = nr2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm2)) {
            return false;
        }
        pm2 pm2Var = (pm2) obj;
        return tpa.f(this.a, pm2Var.a) && tpa.f(this.b, pm2Var.b) && tpa.f(this.c, pm2Var.c) && this.d == pm2Var.d && tpa.f(this.e, pm2Var.e) && tpa.f(this.f, pm2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingMessage=" + this.b + ", outgoingMessage=" + this.c + ", messageViewStatus=" + this.d + ", messageTextLayoutRepository=" + this.e + ", chatTheme=" + this.f + ")";
    }
}
