package defpackage;

/* loaded from: classes.dex */
public final class yt5 extends zt5 {
    public final CharSequence a;
    public final String b;
    public final boolean c;

    public yt5(CharSequence charSequence, String str, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = z;
    }

    public static yt5 b(yt5 yt5Var, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            charSequence = yt5Var.a;
        }
        String str = yt5Var.b;
        yt5Var.getClass();
        return new yt5(charSequence, str, z);
    }

    @Override // defpackage.zt5
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt5)) {
            return false;
        }
        yt5 yt5Var = (yt5) obj;
        return tpa.f(this.a, yt5Var.a) && tpa.f(this.b, yt5Var.b) && this.c == yt5Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + rh4.d((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Edit(name=");
        sb.append((Object) this.a);
        sb.append(", folderId=");
        sb.append(this.b);
        sb.append(", canSave=");
        return au1.j(sb, this.c, ")");
    }

    public /* synthetic */ yt5(String str, CharSequence charSequence, int i) {
        this((i & 1) != 0 ? null : charSequence, str, false);
    }
}
