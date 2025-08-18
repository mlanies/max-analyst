package defpackage;

/* loaded from: classes2.dex */
public final class jzf implements kzf {
    public final String a;

    public jzf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzf) && tpa.f(this.a, ((jzf) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("UploadFile(uriString="), this.a, ")");
    }
}
