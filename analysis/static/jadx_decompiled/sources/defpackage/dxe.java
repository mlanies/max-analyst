package defpackage;

/* loaded from: classes.dex */
public final class dxe {
    public final boolean a;
    public final boolean b;
    public final nnf c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final vwe i;

    public dxe(boolean z, boolean z2, nnf nnfVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, vwe vweVar) {
        this.a = z;
        this.b = z2;
        this.c = nnfVar;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = vweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxe)) {
            return false;
        }
        dxe dxeVar = (dxe) obj;
        return this.a == dxeVar.a && this.b == dxeVar.b && this.c == dxeVar.c && this.d == dxeVar.d && this.e == dxeVar.e && this.f == dxeVar.f && this.g == dxeVar.g && this.h == dxeVar.h && tpa.f(this.i, dxeVar.i);
    }

    public final int hashCode() {
        int iD = ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        nnf nnfVar = this.c;
        int iD2 = ms2.d(ms2.d(ms2.d(ms2.d(ms2.d((iD + (nnfVar == null ? 0 : nnfVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        vwe vweVar = this.i;
        return iD2 + (vweVar != null ? vweVar.hashCode() : 0);
    }

    public final String toString() {
        return "TopPanelState(isGroupCall=" + this.a + ", shouldShowTitleAndStatus=" + this.b + ", mode=" + this.c + ", isVisible=" + this.d + ", isMenuEnabled=" + this.e + ", isRecordEnabled=" + this.f + ", isMenuButtonVisible=" + this.g + ", isAddUserEnabled=" + this.h + ", recordStateTooltip=" + this.i + ")";
    }
}
