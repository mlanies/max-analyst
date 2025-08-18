package defpackage;

import java.nio.charset.CodingErrorAction;

/* loaded from: classes2.dex */
public final class uw8 implements Cloneable {
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public boolean b;
    public CodingErrorAction c;
    public CodingErrorAction o;

    public final Object clone() {
        uw8 uw8Var = new uw8();
        uw8Var.a = true;
        uw8Var.b = true;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        uw8Var.c = codingErrorAction;
        uw8Var.o = codingErrorAction;
        uw8Var.X = Integer.MAX_VALUE;
        uw8Var.Y = 8192;
        uw8Var.Z = 8192;
        uw8Var.a = this.a;
        uw8Var.b = this.b;
        uw8Var.c = this.c;
        uw8Var.o = this.o;
        uw8Var.X = this.X;
        uw8Var.Y = this.Y;
        return uw8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uw8)) {
            return false;
        }
        uw8 uw8Var = (uw8) obj;
        return this.a == uw8Var.a && this.b == uw8Var.b && this.c == uw8Var.c && this.o == uw8Var.o && this.X == uw8Var.X && this.Z == uw8Var.Z && this.Y == uw8Var.Y;
    }

    public final int hashCode() {
        int i = (((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31;
        CodingErrorAction codingErrorAction = this.c;
        int iHashCode = (i + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        CodingErrorAction codingErrorAction2 = this.o;
        return ((((((iHashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.X) * 31) + this.Y) * 31) + this.Z;
    }
}
