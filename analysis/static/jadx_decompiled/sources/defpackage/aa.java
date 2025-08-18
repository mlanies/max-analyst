package defpackage;

/* loaded from: classes.dex */
public final class aa {
    public static final aa h = new aa(false, true, true, true, true, true, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public aa(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public static aa a(aa aaVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = aaVar.a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = aaVar.b;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = aaVar.c;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = aaVar.d;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = aaVar.e;
        }
        boolean z11 = z5;
        boolean z12 = aaVar.f;
        if ((i & 64) != 0) {
            z6 = aaVar.g;
        }
        aaVar.getClass();
        return new aa(z7, z8, z9, z10, z11, z12, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.a == aaVar.a && this.b == aaVar.b && this.c == aaVar.c && this.d == aaVar.d && this.e == aaVar.e && this.f == aaVar.f && this.g == aaVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminCallState(isAdminOrCreator=");
        sb.append(this.a);
        sb.append(", isEnableCameraAvailableInCall=");
        sb.append(this.b);
        sb.append(", isEnableMicrophoneAvailableInCall=");
        sb.append(this.c);
        sb.append(", isEnableSharingScreenAvailableInCall=");
        sb.append(this.d);
        sb.append(", isEnableRecordScreenAvailableInCall=");
        sb.append(this.e);
        sb.append(", isEnableHandsUpAvailableInCall=");
        sb.append(this.f);
        sb.append(", isEnableWaitingRoom=");
        return au1.j(sb, this.g, ")");
    }
}
