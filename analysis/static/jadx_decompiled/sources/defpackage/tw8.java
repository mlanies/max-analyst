package defpackage;

/* loaded from: classes2.dex */
public final class tw8 implements Cloneable {
    public int a;
    public int b;
    public int c;
    public boolean o;

    public final Object clone() {
        tw8 tw8Var = new tw8();
        tw8Var.a = 512;
        tw8Var.b = 8192;
        tw8Var.c = 8192;
        tw8Var.o = true;
        tw8Var.a = this.a;
        tw8Var.b = this.b;
        tw8Var.c = this.c;
        tw8Var.o = this.o;
        return tw8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tw8)) {
            return false;
        }
        tw8 tw8Var = (tw8) obj;
        return this.a == tw8Var.a && this.b == tw8Var.b && this.c == tw8Var.c && this.o == tw8Var.o;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + (this.o ? 1 : 0);
    }
}
