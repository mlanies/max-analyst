package defpackage;

/* loaded from: classes.dex */
public final class qm2 {
    public final e52 a;
    public final es8 b;
    public final es8 c;
    public final es8 d;
    public final zof e;
    public final k29 f;
    public final nr2 g;

    public qm2(e52 e52Var, es8 es8Var, es8 es8Var2, es8 es8Var3, zof zofVar, k29 k29Var, nr2 nr2Var) {
        this.a = e52Var;
        this.b = es8Var;
        this.c = es8Var2;
        this.d = es8Var3;
        this.e = zofVar;
        this.f = k29Var;
        this.g = nr2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm2)) {
            return false;
        }
        qm2 qm2Var = (qm2) obj;
        return tpa.f(this.a, qm2Var.a) && tpa.f(this.b, qm2Var.b) && tpa.f(this.c, qm2Var.c) && tpa.f(this.d, qm2Var.d) && this.e == qm2Var.e && tpa.f(this.f, qm2Var.f) && tpa.f(this.g, qm2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingFirstMessage=" + this.b + ", incomingSecondMessage=" + this.c + ", outgoingMessage=" + this.d + ", messageViewStatus=" + this.e + ", messageTextLayoutRepository=" + this.f + ", chatTheme=" + this.g + ")";
    }
}
